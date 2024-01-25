package aspect_homework.dao;

import aspect_homework.domain.Album;
import org.springframework.stereotype.Repository;

@Repository
public class AlbumDaoSimple {

    public Album findAlbum(String title, String genre) {
        return new Album(title, genre);
    }

}