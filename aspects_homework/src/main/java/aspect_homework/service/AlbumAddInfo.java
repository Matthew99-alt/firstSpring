package aspect_homework.service;

import aspect_homework.domain.Album;
import org.springframework.stereotype.Service;

import java.util.Objects;

public class AlbumAddInfo {
    public void addComposer(String band, Album album){
        System.out.println("Album "+album.getTitle()+" was written by "+band);
    }
    public void commentTheGenre(Album album) {
        if (Objects.equals(album.getGenre(), "classic rock"))
        {       System.out.println("That's some classic stuff");
        }else if (Objects.equals(album.getGenre(), "metalcore")) {
            System.out.println("This day is going to be one of these, isn't it?");
        } else if (Objects.equals(album.getGenre(), "shogaze")) {
            System.out.println("Feel a little bit dreamy, don't you?");
        }
        else {
            System.out.println("Never heard about that one");
        }
    }
}