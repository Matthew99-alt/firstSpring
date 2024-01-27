package questions;

import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import questions.service.PersonServiceImpl;

@ComponentScan
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Main.class);

        ArrayList<String> userAnswers = new ArrayList<>(Arrays.asList("Loveless", "2007", "Grunge", "Minors", "Chaoscore"));

        PersonServiceImpl askService = context.getBean(PersonServiceImpl.class);
        askService.askUser("Stephan", userAnswers);
    }
}
