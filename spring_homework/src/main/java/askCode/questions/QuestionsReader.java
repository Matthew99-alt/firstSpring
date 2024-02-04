package askCode.questions;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.stereotype.Service;

@Service
public class QuestionsReader {

    private final ArrayList<String> records = new ArrayList<>();

    public ArrayList<String> findQuestion(String path) {

        try {
            records.clear();
            InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(path);
            CSVReader csvReader = new CSVReaderBuilder(new InputStreamReader(inputStream)).build();
            String[] nextRecord;

            while ((nextRecord = csvReader.readNext()) != null) {
                records.addAll(Arrays.asList(nextRecord));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return records;
    }
}
