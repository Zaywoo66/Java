class Song {
    private String title;
    private int duration;

    public Song() {
        this.title = "";
        this.duration = 0;
    }

    public Song(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void display() {
        System.out.println("Song: " + title + ", duration: " + duration + " sec");
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

    public void display() {
        System.out.println("Artist: " + name + ", genre: " + genre);
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

    public void display() {
        System.out.println("Playlist: " + name + ", songs: " + songsCount);
    }
}

public class Main {
    public static void main(String[] args) {

        Song song1 = new Song("Shape of You", 240);
        Song song2 = new Song("Blinding Lights", 200);

        Artist artist1 = new Artist("Ed Sheeran", "Pop");
        Artist artist2 = new Artist("The Weeknd", "R&B");

        Playlist playlist1 = new Playlist("My Favorites", 10);
        Playlist playlist2 = new Playlist("Workout", 8);

        song1.display();
        song2.display();

        artist1.display();
        artist2.display();

        playlist1.display();
        playlist2.display();

        if (song1.getDuration() > song2.getDuration()) {
            System.out.println(song1.getTitle() + " is longer than " + song2.getTitle());
        } else {
            System.out.println(song2.getTitle() + " is longer than " + song1.getTitle());
        }

        if (!artist1.getName().equals(artist2.getName())) {
            System.out.println("Artists are different");
        }

        if (playlist1.getSongsCount() > playlist2.getSongsCount()) {
            System.out.println("Playlist " + playlist1.getName() + " has more songs");
        } else {
            System.out.println("Playlist " + playlist2.getName() + " has more songs");
        }
    }
}
