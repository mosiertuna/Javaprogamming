package hust.soict.dsai.Aims.media;
import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    

    public List<Track> getTracks() {
        return tracks;
    }

    //Constructor
    public CompactDisc(String artist, int length, String director, int id, String title, String category, float cost){
        this.artist = artist;
        this.length = length;
        this.director = director;
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public CompactDisc(String text, String text2, float float1, String text3, int i, String text4) {
        //TODO Auto-generated constructor stub
    }

    // Getter for artist
    public String getArtist() {
        return artist;
    }

    // Setter for artist
    public void setArtist(String artist) {
        this.artist = artist;
    }

    // Method to add a track
    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("The track is already in the list.");
        } else {
            tracks.add(track);
            System.out.println("Track added successfully.");
        }
    }

    // Method to remove a track
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed successfully.");
        } else {
            System.out.println("The track is not in the list.");
        }
    }

    // Method to calculate the total length of the CD
    @Override
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    // Implement play() from Playable
    @Override
    public void play() {
        System.out.println("Playing CompactDisc: " + artist);
        for (Track track : tracks) {
            System.out.println("Playing track: " + track.getTitle());
            track.play();
        }
    }
}
