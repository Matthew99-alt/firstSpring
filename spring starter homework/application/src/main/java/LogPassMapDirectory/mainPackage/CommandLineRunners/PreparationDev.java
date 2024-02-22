package LogPassMapDirectory.mainPackage.CommandLineRunners;

import LogPassMapDirectory.LogPassMapClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class PreparationDev implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(PreparationDev.class);

    private final LogPassMapClass logPassMapClass;

    public PreparationDev(LogPassMapClass logPassMapClass) {
        this.logPassMapClass = logPassMapClass;
    }

    @Override
    public void run(String... args) {
        logger.info("DEV mode!!! Что-то настравиваем и подготавливаем, параметры: {} ", Arrays.toString(args));
        logger.info("Access:{}", logPassMapClass.authorization("Lennon",112374));
    }
}
