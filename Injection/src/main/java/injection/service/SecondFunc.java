package injection.service;

import org.springframework.stereotype.Service;

@Service
public class SecondFunc {
    public String book(String book, String title){
        return "Book " + book + " was written by " + title;
    }
}