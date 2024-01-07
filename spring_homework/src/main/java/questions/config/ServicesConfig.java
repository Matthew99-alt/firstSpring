package questions.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import questions.questions.ReadQuestions;
import questions.service.PersonService;
import questions.service.PersonServiceImpl;

@Configuration
public class ServicesConfig {

    @Bean
    public PersonService personService(ReadQuestions readQuestions) {
        return new PersonServiceImpl(readQuestions);
    }
}
