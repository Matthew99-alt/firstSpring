package LogPassMapDirectory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
    public String LogPassMapClassConfig() {
        String message = props.getLogPassMap().isEmpty() ? "default message" : "hashmap is empty";
        logger.info("AutoConfig. creating LogPassMapClassAutoConfiguration, default message: "+message);
        return message;
    }

    @Bean
    @ConditionalOnMissingBean
    public LogPassMapClass logPassMapClass(LogPassMapClassConfig logPassMapClassConfig) {
        logger.info("AutoConfig. creating LogPassMapClass");
        return new LogPassMapClass(logPassMapClassConfig);
    }
}
