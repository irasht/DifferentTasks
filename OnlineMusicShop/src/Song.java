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
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if ((object == null) || (object.getClass() != getClass())) {
            return false;
        }
        Song song = (Song) object;

        return songwriter == song.songwriter || (songwriter != null && songwriter.equals(song.songwriter));
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int hash = 1;
        hash = prime * hash + (songwriter == null ? 0 : songwriter.hashCode());
        return hash;
    }

    @Override
    public String toString() {
        return name + " played by " + songwriter + ", songDuration: " + songDuration + ", songType: " + songType;
    }
}
