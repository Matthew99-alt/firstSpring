package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import questions.QuestionsReader;

public class PersonServiceImpl {

    private final QuestionsReader readQuestionsDAO;

    public PersonServiceImpl(QuestionsReader readQuestionsDAO) {
        this.readQuestionsDAO = readQuestionsDAO;
    }

    public void askUser(String name, ArrayList<String> userAnswers) {

        ArrayList<String> questions = new ArrayList<>(List.copyOf(readQuestionsDAO.findQuestion("questions.csv")));
        ArrayList<String> rightAnswers = new ArrayList<>(List.copyOf(readQuestionsDAO.findQuestion("answers.csv")));
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
