package questions;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import questions.service.PersonServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");

        ArrayList<String> userAnswers = new ArrayList<>(Arrays.asList("Loveless", "2007", "Grunge", "Minors", "Chaoscore"));

        PersonServiceImpl askService = context.getBean(PersonServiceImpl.class);
        askService.askUser("Stephan", userAnswers);
    }
}
