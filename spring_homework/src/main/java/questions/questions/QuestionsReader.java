package questions.questions;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.stereotype.Service;

@Service
public class QuestionsReader implements QuestionsDAO {

    private final ArrayList<String> records = new ArrayList<>();

    public ArrayList<String> findQuestion(String file) {

        try {
            records.clear();
            CSVReader csvReader = new CSVReader(new FileReader(file));
            String[] nextRecord;

            while ((nextRecord = csvReader.readNext()) != null) {
                records.addAll(Arrays.asList(nextRecord));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return records;
    }
}
