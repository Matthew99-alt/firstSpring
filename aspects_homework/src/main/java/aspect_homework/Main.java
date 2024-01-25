package aspect_homework;

import aspect_homework.dao.AlbumDaoSimple;
import aspect_homework.domain.Album;
import aspect_homework.service.AlbumAddInfo;
import aspect_homework.service.AlbumFilter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.Arrays;

@EnableAspectJAutoProxy
@ComponentScan
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Main.class);

        AlbumDaoSimple service = context.getBean(AlbumDaoSimple.class);
        AlbumAddInfo albumAddInfo = context.getBean(AlbumAddInfo.class);
        AlbumFilter albumFilter = context.getBean(AlbumFilter.class);

        Album theWall = service.findAlbum("The Wall", "classic rock");
        Album areYouExpirienced = service.findAlbum("Are you experienced", "classic rock");
        Album eternalBlue = service.findAlbum("Eternal Blue", "metalcore");
        Album everythingIsAlive = service.findAlbum("Everything is alive", "shogaze");


        albumAddInfo.addComposer("Pink Floyd",theWall);
        albumAddInfo.commentTheGenre(theWall);
        albumAddInfo.addComposer("The Jimmi Hendrix Experience",areYouExpirienced);
        albumAddInfo.commentTheGenre(areYouExpirienced);
        albumAddInfo.addComposer("Spiritbox",eternalBlue);
        albumAddInfo.commentTheGenre(eternalBlue);
        albumAddInfo.addComposer("Slowdive", everythingIsAlive);
        albumAddInfo.commentTheGenre(everythingIsAlive);

        ArrayList<Album> albums = new ArrayList<>(Arrays.asList(theWall, areYouExpirienced, eternalBlue, everythingIsAlive));

        albumFilter.showAlbums("classic rock", albums);
        albumFilter.hideAlbums("classic rock", albums);

        albumFilter.showAlbumsAndComment("classic rock", albums);

    }
}
