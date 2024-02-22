package LogPassMapDirectory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.HashMap;


@Configuration
@ConditionalOnClass(LogPassMapClass.class)
@EnableConfigurationProperties(Props.class)
public class LogPassMapClassAutoConfiguration {
    private static final Logger logger = LoggerFactory.getLogger(LogPassMapClassAutoConfiguration.class);

    private final Props props;

    public LogPassMapClassAutoConfiguration(Props props) {
        this.props = props;
    }

    @Bean
    @ConditionalOnMissingBean
    public LogPassMapClassConfig logPassMapClassConfig() {
        HashMap<String, Integer> map;
        if(props.getLogPassMap()==null){
            map = new HashMap<>();
            logger.info("HashMap was not found, using default HashMap(empty):" + map);
        }else{
            HashMap<String, Integer> mappa = props.getLogPassMap();
            map = new HashMap<>(mappa);
            logger.info("HashMap was found, using founded HashMap:" + map);
        }
        return new LogPassMapClassConfig(map);
    }

    @Bean
    @ConditionalOnMissingBean
    public LogPassMapClass logPassMapClass(LogPassMapClassConfig logPassMapClassConfig) {
        logger.info("AutoConfig. creating LogPassMapClass");
        return new LogPassMapClass(logPassMapClassConfig);
    }
}
