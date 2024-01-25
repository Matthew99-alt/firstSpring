package aspect_homework.service;

import aspect_homework.dao.AlbumDaoSimple;
import aspect_homework.domain.Album;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;

@Service
public class AlbumFilter {
    public void showAlbums(String settedGenre, ArrayList<Album> albums){
        for (Album album : albums) {
            if (Objects.equals(album.getGenre(), settedGenre)) {
                System.out.println(album.getTitle());
            }
        }
    }
    public void hideAlbums(String settedGenre, ArrayList<Album> albums){
        for (Album album : albums) {
            if (!Objects.equals(album.getGenre(), settedGenre)) {
                System.out.println(album.getTitle());
            }
        }
    }
    public void showAlbumsAndComment(String settedGenre, ArrayList<Album> albums){
        AlbumAddInfo albumAddInfo = new AlbumAddInfo();
        AlbumDaoSimple albumDaoSimple = new AlbumDaoSimple();
        albumAddInfo.commentTheGenre(albumDaoSimple.findAlbum("Doesn't matter",settedGenre));
        for (Album album : albums) {
            if (Objects.equals(album.getGenre(), settedGenre)) {
                System.out.println(album.getTitle());
            }
        }
    }
}
