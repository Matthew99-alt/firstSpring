package LogPassMapDirectory;

import java.util.HashMap;

public class LogPassMapClass {
    private final LogPassMapClassConfig config;

    public LogPassMapClass(LogPassMapClassConfig config) {
        this.config = config;
    }
    public String authorization(String login, Integer password) {
        return config.checkLogPassMap(login,password);
    }
}
