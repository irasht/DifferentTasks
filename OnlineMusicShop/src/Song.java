import java.util.Comparator;

public class Song {
    private String name;
    private String songwriter;
    private double songDuration;
    private SongType songType;

    public Song(String name, String songwriter, double songDuration, SongType songType) {
        this.name = name;
        this.songwriter = songwriter;
        this.songDuration = songDuration;
        this.songType = songType;
    }

    public double getSongDuration() {
        return songDuration;
    }

    public String getSongwriter() {
        return songwriter;
    }

    public SongType getSongType() {
        return songType;
    }

    static class SongwriterComparator implements Comparator<Song> {
        @Override
        public int compare(Song song1, Song song2) {
            return song1.getSongwriter().compareTo(song2.getSongwriter());
        }
    }

    @Override
    public String toString() {
        return name + " played by " + songwriter + ", songDuration: " + songDuration + ", songType: " + songType;
    }
}
