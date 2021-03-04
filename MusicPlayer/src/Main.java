import java.util.*;

public class Main {

    static List<Album> albums = new ArrayList<>();
    static LinkedList<Song> feelGood = new LinkedList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void createPlayList(Song song) {
        if (songFound(song.getTitle())) {
            feelGood.add(song);
            System.out.println("=================================");
            System.out.println("Song with title " + song.getTitle() + " added to playlist");
        } else {
            System.out.println("Song with title " + song.getTitle() + " is not found in any of the albums");
        }
        System.out.println("=================================");
    }

    private static boolean songFound(String title) {
        for (int i = 0; i < albums.size(); i++) {
            for (int j = 0; j < albums.get(i).getSongs().size(); j++) {
                if (title.equals(albums.get(i).getSongs().get(j).getTitle())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Song song = new Song("Bohemian rhapsody", 6.5);
        Song song1 = new Song("mama here we come", 4.5);
        Song song2 = new Song("We will rock you", 5.5);

        Album theQueen = new Album();
        theQueen.addSongs(song);
        theQueen.addSongs(song1);
        theQueen.addSongs(song2);

        Song song3 = new Song("Thrift shop", 8.0);
        Song song4 = new Song("get high", 4.5);

        Album hipHop = new Album();
        hipHop.addSongs(song3);
        hipHop.addSongs(song4);

        albums.add(theQueen);
        albums.add(hipHop);

        createPlayList(song1);
        createPlayList(song2);
        createPlayList(song4);

        playFromPlayList();

    }

    private static void playFromPlayList() {
        ListIterator listIterator = feelGood.listIterator();
        boolean play = true;
        while (play) {
            printMenu();
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("you chose to quit");
                    play = false;
                    break;
                case 1:
                    System.out.println("skipping backwards");
                    if (listIterator.hasPrevious()) {
                        listIterator.previous();
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Playing song " + listIterator.previousIndex() + " title " + feelGood.get(listIterator.previousIndex()).getTitle());
                    } else {
                        System.out.println("no songs available before this");
                    }
                    break;
                case 2:
                    System.out.println("Skipping forward");
                    if (listIterator.hasNext()) {
                        System.out.println("Playing song " + listIterator.nextIndex() + " title " + feelGood.get(listIterator.nextIndex()).getTitle());
                        listIterator.next();
                    } else {
                        System.out.println("no songs available after this");
                    }
                    break;
                case 3:
                    if (listIterator.hasPrevious()){
                        System.out.println("replaying song " + feelGood.get(listIterator.previousIndex()).getTitle());
                        if (listIterator.hasNext())
                        listIterator.next();
                    }
                    break;
                case 4:
                    System.out.println("list of songs");
                    printPlayList();
                    break;
            }
        }

    }

    private static void printPlayList() {
        ListIterator<Song> songIterator = feelGood.listIterator();
        while (songIterator.hasNext()) {
            System.out.println("songs are : " + feelGood.get(songIterator.nextIndex()).getTitle());
            songIterator.next();
        }
    }

    private static void printMenu() {
        System.out.println("0 -> quit \n" +
                "1 -> skip backwards \n" +
                "2 -> skip forward \n" +
                "3 -> replay \n" +
                "4 -> list the songs");
    }

}
