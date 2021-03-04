import java.util.ArrayList;
import java.util.List;

public class Album {

    private List<Song> songs;

    public Album() {
        songs = new ArrayList<>();
    }

    public void addSongs(Song song){
        this.songs.add(song);
        System.out.println("The song "+song.getTitle()+ " is added the album");
    }

    public List<Song> getSongs() {
        return songs;
    }
}
