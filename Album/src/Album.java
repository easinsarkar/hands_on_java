import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;
    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }
    public boolean addSong(String songTitle, double songDuration) {
        Song newSong = new Song(songTitle,songDuration);
        for ( Song song : songs) {
            if ( (song.getTitle().equals(songTitle)) ) {
                return false;
            }
        }
        songs.add(newSong);
        return true;
    }
    private Song findSong(String songTitle) {
        var songsIterator = songs.listIterator();
        while ( songsIterator.hasNext() ) {
            if ( ((songsIterator.next()).getTitle()).equals(songTitle) ) {
                return songsIterator.next();
            }
        }
        return null;
    }
    public boolean addToPlayList(int songTrackNumber, LinkedList<Song> playList) {
        for (Song song : songs) {
            if ((songs.indexOf(song)) == (songTrackNumber - 1)) {
                playList.add(song);
                return true;
            }
        }
        return false;
    }
    public boolean addToPlayList(String songTitle, LinkedList<Song> playList) {

        for (Song song : songs) {
            if ((song.getTitle()).equals(songTitle)) {
                playList.add(song);
                return true;
            }
        }
        return  false;
    }
}
