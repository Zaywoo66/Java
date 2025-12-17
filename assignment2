import java.util.ArrayList;
import java.util.Collections;

class MediaItem {
    private String title;

    public MediaItem() {
        this.title = "";
    }

    public MediaItem(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Title: " + title;
    }
}

class Song extends MediaItem {
    private int duration;

    public Song() {
        super();
        this.duration = 0;
    }

    public Song(String title, int duration) {
        super(title);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song: " + getTitle() + ", duration: " + duration + " sec";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Song)) return false;

        Song other = (Song) obj;
        return getTitle().equals(other.getTitle()) && duration == other.duration;
    }

    @Override
    public int hashCode() {
        return getTitle().hashCode() + duration;
    }
}

class Artist {
    private String name;
    private String genre;

    public Artist() {
        this.name = "";
        this.genre = "";
    }

    public Artist(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Artist: " + name + ", genre: " + genre;
    }
}

class Playlist {
    private String name;
    private int songsCount;

    public Playlist() {
        this.name = "";
        this.songsCount = 0;
    }

    public Playlist(String name, int songsCount) {
        this.name = name;
        this.songsCount = songsCount;
    }

    public String getName() {
        return name;
    }

    public int getSongsCount() {
        return songsCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSongsCount(int songsCount) {
        this.songsCount = songsCount;
    }

    @Override
    public String toString() {
        return "Playlist: " + name + ", songs: " + songsCount;
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("Shape of You", 240));
        songs.add(new Song("Blinding Lights", 200));
        songs.add(new Song("Believer", 210));

        Artist artist1 = new Artist("Ed Sheeran", "Pop");
        Artist artist2 = new Artist("The Weeknd", "R&B");

        Playlist playlist1 = new Playlist("My Favorites", 10);
        Playlist playlist2 = new Playlist("Workout", 8);

        System.out.println("Artists:");
        System.out.println(artist1);
        System.out.println(artist2);

        System.out.println("\nPlaylists:");
        System.out.println(playlist1);
        System.out.println(playlist2);

        System.out.println("\nAll songs:");
        for (Song song : songs) {
            System.out.println(song);
        }

        System.out.println("\nSongs longer than 210 sec:");
        for (Song song : songs) {
            if (song.getDuration() > 210) {
                System.out.println(song);
            }
        }

        System.out.println("\nSearch by title:");
        for (Song song : songs) {
            if (song.getTitle().equals("Believer")) {
                System.out.println("Found: " + song);
            }
        }

        Collections.sort(songs, (a, b) -> a.getDuration() - b.getDuration());

        System.out.println("\nSorted by duration:");
        for (Song song : songs) {
            System.out.println(song);
        }

        Song testSong = new Song("Believer", 210);
        System.out.println("\nEquals test:");
        System.out.println(songs.get(2).equals(testSong));
    }
}
