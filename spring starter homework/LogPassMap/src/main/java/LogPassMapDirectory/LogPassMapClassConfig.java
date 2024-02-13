package LogPassMapDirectory;

import java.util.HashMap;

public class LogPassMapClassConfig {
    private final HashMap<String, Integer> logPassMap;

    public LogPassMapClassConfig(HashMap<String, Integer> logPassMap) {
        this.logPassMap = logPassMap;
    }

    public HashMap<String, Integer> getLopPassMap(){
        return logPassMap;
    }
}
