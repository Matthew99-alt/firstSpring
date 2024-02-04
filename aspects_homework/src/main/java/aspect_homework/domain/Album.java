package aspect_homework.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Album {


    private final String title;
    private final String genre;

    public Album(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }
}