package LogPassMapDirectory;

import java.util.HashMap;

public class LogPassMapClassConfig {
    private final HashMap<String, Integer> logPassMap;

    public LogPassMapClassConfig(HashMap<String, Integer> logPassMap) {
        this.logPassMap = logPassMap;
    }

    public String checkLogPassMap(String login, Integer password) {
        String answer;
        if(logPassMap.containsKey(login) && logPassMap.containsValue(password)){
            answer = "granted";
        }else{
            answer = "denied";
        }
        return answer;
    }
}
