package aspect_homework.service;

import aspect_homework.domain.Album;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class AlbumAddInfoProxy extends AlbumAddInfo{

    public void addComposer(String band, Album album){
        System.out.println("Let's write a composer!");
        super.addComposer(band, album);
    }

    public void commentTheGenre(Album album) {
        System.out.println("Let's see a genre!");
        super.commentTheGenre(album);
    }
}
