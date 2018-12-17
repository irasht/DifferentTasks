import java.util.*;

public class MusicShop {

    public static void main(String[] args) {
        List<Song> musicList = new ArrayList();
        createMusicList(musicList);
        System.out.println("----------------------------------");
        System.out.println("Classic songs less then 10 minute.");
        System.out.println("----------------------------------");
        findByType(musicList);
        System.out.println("---------------------------");
        System.out.println("Songs sorted by Songwriter");
        System.out.println("---------------------------");
        printSortedSongs(sortSongsBySongwriter(musicList));
    }

    private static void createMusicList(List<Song> musicList) {
        musicList.add(new Song("Highway to Hell", "AC/DC", 3.29, SongType.Rock));
        musicList.add(new Song("Moonlight Sonata", "Ludwig van Beethoven", 15.0, SongType.Classic));
        musicList.add(new Song("Epilogue(La La Land)", "Justin Hurwitz", 7.41, SongType.Soundtrack));
        musicList.add(new Song("Ain't Misbehavin'", "Fats Waller", 2.46, SongType.Jazz));
        musicList.add(new Song("The Four Seasons(Spring)", "Antonio Vivaldi", 10.28, SongType.Classic));
        musicList.add(new Song("Waltz of the Flowers", "Tchaikovsky", 7.30, SongType.Classic));
        musicList.add(new Song("Oh, Lady Be Good", "Ella Fitzgerald", 3.15, SongType.Jazz));
        musicList.add(new Song("Take Five", "Dave Brubeck", 5.28, SongType.Jazz));
        musicList.add(new Song("Resident Evil Main Title Theme", "Marilyn Manson and Marco Beltrami", 2.12, SongType.Soundtrack));
        musicList.add(new Song("Ghostbusters", "Ray Parker Jr.", 4.05, SongType.Soundtrack));
        musicList.add(new Song("Revolution Radio", "Green Day", 3.00, SongType.Rock));
        musicList.add(new Song("Closing Time", "Semisonic", 4.33, SongType.Rock));
    }

    private static void findByType(List<Song> musicList) {
        for (Song song : musicList) {
            if (song.getSongType().equals(SongType.Classic) && song.getSongDuration() < 10) {
                System.out.println(song);
            }
        }
    }

    private static List<Song> sortSongsBySongwriter(List<Song> musicList) {
        musicList.sort(new Song.SongwriterComparator());
        return musicList;
    }

    private static void printSortedSongs(List<Song> musicList) {
        for (Song song : musicList) {
            System.out.println(song);
        }
    }
}
