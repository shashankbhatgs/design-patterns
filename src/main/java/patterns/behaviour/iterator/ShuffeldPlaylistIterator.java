package patterns.behaviour.iterator;

public class ShuffeldPlaylistIterator implements PlaylistIterator {

    private final Playlist playlist;
    private int index;

    public ShuffeldPlaylistIterator(Playlist playlist) {
        this.playlist = playlist;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < playlist.getSongs().size();
    }

    @Override
    public String next() {
        return playlist.getSongs().get(index++);
    }
}
