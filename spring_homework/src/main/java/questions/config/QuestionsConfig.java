package questions.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import questions.questions.ReadQuestions;
import questions.questions.Questions;

@Configuration
public class QuestionsConfig {

    @Bean
    public Questions readQuestionsObject() {
        return new ReadQuestions();
    }
}
