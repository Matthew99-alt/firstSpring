package LogPassMapDirectory;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@Configuration
@ConfigurationProperties(prefix="logpassmapclass")
public class Props {

    private HashMap<String, Integer> logPassMap;

    public Props(HashMap<String, Integer> logPassMap){
        this.logPassMap = logPassMap;
    }

    public HashMap<String, Integer> getLogPassMap() {
        return logPassMap;
    }
}
