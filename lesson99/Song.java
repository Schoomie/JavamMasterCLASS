package lesson99;

/**
 * Created by Kuba on 08/03/2019.
 */
public class Song {
    private String songName;
    private double duration;


    public Song(String songName, int duration) {
        this.songName = songName;
        this.duration = duration;

    }

    public String getSongName() {
        return songName;
    }


    public double getDuration() {
        return duration;
    }

    public String toString() {
        return this.songName + ": " + this.duration;
    }


}
