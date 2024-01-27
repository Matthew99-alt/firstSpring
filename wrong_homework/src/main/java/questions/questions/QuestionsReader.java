package questions.questions;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

import com.opencsv.CSVReaderBuilder;
import org.springframework.stereotype.Service;

@Service
public class QuestionsReader implements QuestionsDAO {

    private final ArrayList<String> records = new ArrayList<>();

    public ArrayList<String> findQuestion() {

        try {
            records.clear();
            InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("/questions/resources/questions.csv");
            final CSVParser parser = new CSVParserBuilder().withSeparator(';').build();
            CSVReader csvReader = new CSVReaderBuilder(new InputStreamReader(inputStream)).withCSVParser(parser).build();
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
