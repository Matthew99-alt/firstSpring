package LogPassMapDirectory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        LogPassMapClassConfig logPassMapClassConfig = new LogPassMapClassConfig(new HashMap<>(){{put("Lennon",11234);put("McCarney",8973245);put("Harrison",933624);put("Ringo",682046);}});
        LogPassMapClass logPassMapClass = new LogPassMapClass(logPassMapClassConfig);
        String auth = logPassMapClass.authorization("Lennon",11234);
        System.out.println(auth);
    }
}
