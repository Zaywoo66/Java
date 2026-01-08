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

    @Override
    public String toString() {
        return "Title: " + title;
    }
}

class Song extends MediaItem implements Playable {
    private int duration;

    public Song() {
        super();
        duration = 0;
    }

    public Song(String title) {
        super(title);
        duration = 0;
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

    // SEARCH
    public void searchByTitle(String title) {
        for (int i = 0; i < songs.length; i++) {
            if (songs[i].getTitle().equals(title)) {
                System.out.println("Found: " + songs[i]);
            }
        }
    }

    // FILTER
    public void filterByDuration(int min) {
        for (int i = 0; i < songs.length; i++) {
            if (songs[i].getDuration() > min) {
                System.out.println(songs[i]);
            }
        }
    }

    // SORT (bubble sort, простой)
    public void sortByDuration() {
        for (int i = 0; i < songs.length - 1; i++) {
            for (int j = 0; j < songs.length - 1; j++) {
                if (songs[j].getDuration() > songs[j + 1].getDuration()) {
                    Song temp = songs[j];
                    songs[j] = songs[j + 1];
                    songs[j + 1] = temp;
                }
            }
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

        System.out.println("\nAll songs:");
        playlist.showSongs();

        System.out.println("\nPlay song:");
        song1.play();

        System.out.println("\nSearch result:");
        playlist.searchByTitle("Believer");

        System.out.println("\nFiltered songs (duration > 205):");
        playlist.filterByDuration(205);

        System.out.println("\nSorted songs:");
        playlist.sortByDuration();
        playlist.showSongs();

        System.out.println("\nEquals test:");
        Song testSong = new Song("Believer", 210);
        System.out.println(song3.equals(testSong));

        // Polymorphism demonstration
        MediaItem item = new Song("Test", 100);
        System.out.println("\nPolymorphism:");
        System.out.println(item);
    }
}
