package lesson99;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Kuba on 08/03/2019.
 */
public class Album {
    private String albumName;
    private String artist;
    private ArrayList<Song> albumOfSongs;

    public Album(String albumName, String artist) {
        this.albumName = albumName;
        this.albumOfSongs = new ArrayList<>();
        this.artist = artist;
    }

    public String getAlbumName() {
        return albumName;
    }


    public ArrayList<Song> getAlbumOfSongs() {
        return albumOfSongs;
    }

    public boolean addSong(String songName, int duration) {
        if (findSong(songName) == null) {

            this.albumOfSongs.add(new Song(songName, duration));
        }
        return false;
    }


    private Song findSong(String songName) {
        for (Song checkedSong : this.albumOfSongs) {
            if (checkedSong.getSongName().equals(songName))
                return checkedSong;
        }
        return null;
    }


    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if ((index > 0) && index <= (this.albumOfSongs.size())) {
            playList.add(this.albumOfSongs.get(index));
            return true;
        }
        System.out.println("there is no track with this number:" + trackNumber);
        return false;
    }
}
