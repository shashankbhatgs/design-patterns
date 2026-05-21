package patterns.behaviour.iterator;

import java.util.ArrayList;

public class Playlist {
    private ArrayList<String> songs;
    public Playlist() {
        songs = new ArrayList<>();
    }
    public void addSong(String song) {
        this.songs.add(song);
    }

    public PlaylistIterator iterator(String type) {
        return switch (type) {
            case "simple" -> new SimplePlaylistIterator(this);
            case "shuffled" -> new ShuffeldPlaylistIterator(this);
            default -> null;
        };
    }

    public ArrayList<String> getSongs() {
        return songs;
    }
}
