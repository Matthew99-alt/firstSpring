package questions.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import questions.questions.QuestionsDAO;

@Service
public class PersonServiceImpl implements PersonService {

    private final QuestionsDAO readQuestionsDAO;

    public PersonServiceImpl(QuestionsDAO readQuestionsDAO) {
        this.readQuestionsDAO = readQuestionsDAO;
    }

    public void askUser(String name, ArrayList<String> userAnswers) {

        //TODO: вынести файлы с вопросами и ответами в resources



        ArrayList<String> questions = new ArrayList<>(List.copyOf(readQuestionsDAO.findQuestion()));
        ArrayList<String> rightAnswers = new ArrayList<>(List.copyOf(readQuestionsDAO.findQuestion()));
        int k = 0;

        System.out.println("Hello, " + name + "! Please, answer some questions: ");

        for (int i = 0; i < questions.size(); i++) {
            System.out.println(questions.get(i));
            System.out.println(userAnswers.get(i));
        }

        for (int j = 0; j < rightAnswers.size(); j++) {
            if (Objects.equals(rightAnswers.get(j), userAnswers.get(j))) {
                k++;
            }
        }

        System.out.println("You've got " + k + " out of " + questions.size() + " questions right!");
    }
}
