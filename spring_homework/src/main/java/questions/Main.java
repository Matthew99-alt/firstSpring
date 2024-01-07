package questions;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import questions.questions.ReadQuestions;
import questions.service.PersonServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
