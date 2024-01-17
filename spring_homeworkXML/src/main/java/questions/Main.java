package questions;

import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import questions.service.PersonService;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");

        ArrayList<String> userAnswers = new ArrayList<>(Arrays.asList("Loveless", "2007", "Grunge", "Minors", "Chaoscore"));

        PersonService askService = context.getBean(PersonService.class);
        askService.askUser("Stephan", userAnswers);
    }
}
