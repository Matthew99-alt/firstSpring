package LogPassMapDirectory;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.HashMap;

@ConfigurationProperties(prefix="logpassmapclass")
public class Props {

    private HashMap<String, Integer> logpassmapclass;

    public HashMap<String, Integer> getLogPassMap() {
        return logpassmapclass;
    }

    public void setLogPassMap(String login, Integer password) {
        logpassmapclass.put(login, password);
    }
}
