interface Playable {
    void play();
}

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

    public final void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return "Title: " + title;
    }
}

class Song extends MediaItem implements Playable {
    private int duration;

    public Song() {
        super();
        this.duration = 0;
    }

    public Song(String title) {
        super(title);
        this.duration = 0;
    }

    public Song(String title, int duration) {
        super(title);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public final void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void play() {
        System.out.println("Playing song: " + getTitle());
    }

    @Override
    public String toString() {
        return "Song: " + getTitle() + ", duration: " + duration + " sec";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Song) {
            Song other = (Song) obj;
            return getTitle().equals(other.getTitle()) &&
                   duration == other.duration;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return getTitle().hashCode() + duration;
    }
}

class Artist {
    private String name;

    public Artist() {
        name = "";
    }

    public Artist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Artist: " + name;
    }
}

class Playlist {
    private String name;
    private Song[] songs;

    public Playlist(String name, Song[] songs) {
        this.name = name;
        this.songs = songs;
    }

    public String getName() {
        return name;
    }

    public int getSongsCount() {
        return songs.length;
    }

    public void showSongs() {
        for (int i = 0; i < songs.length; i++) {
            System.out.println(songs[i]);
        }
    }

    @Override
    public String toString() {
        return "Playlist: " + name + ", songs: " + songs.length;
    }
}

public class Main {
    public static void main(String[] args) {

        Song song1 = new Song("Shape of You", 240);
        Song song2 = new Song("Blinding Lights", 200);
        Song song3 = new Song("Believer", 210);

        Song[] songs = { song1, song2, song3 };

        Artist artist = new Artist("Ed Sheeran");

        Playlist playlist = new Playlist("My Favorites", songs);

        System.out.println(artist);
        System.out.println(playlist);

        System.out.println("\nSongs in playlist:");
        playlist.showSongs();

        System.out.println("\nPlay song:");
        song1.play();

        System.out.println("\nEquals test:");
        Song testSong = new Song("Believer", 210);
        System.out.println(song3.equals(testSong));
    }
}
