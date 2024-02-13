package LogPassMapDirectory;

import java.util.HashMap;

public class LogPassMapClass {
    private final LogPassMapClassConfig config;

    public LogPassMapClass(LogPassMapClassConfig config) {
        this.config = config;
    }

    public HashMap<String, Integer> getMap(){
        return config.getLopPassMap();
    }
}
