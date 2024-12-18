package hust.soict.hedspi.aims.media;

import java.util.List;

public class CD extends Disc implements Playable{
	private String artist;
	private List<Track> tracks;
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public List<Track> getTracks() {
		return tracks;
	}
	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}
	public CD(String title, String category, float cost, String director, int length, String artist,List<Track> tracks) {
		super(title, category, cost, director, length);
		this.artist = artist;
		this.tracks = tracks;
	}
	public CD( String title, String category, float cost, String director, int length) {
		super( title, category, cost, director, length);
	}
	
	// Thêm bài mới
	   public void addTrack(Track track) {
	        if (!checkTrack(track)) {
	            tracks.add(track);
	            System.out.println(track.getTitle() + " has been added to the album!");
	        } else {
	            System.out.println(track.getTitle() + " already exists in the album!");
	        }
	    }
	
	//Xóa bài
    public void removeTrack(Track track) {
        if (checkTrack(track)) {
            tracks.remove(track);
            System.out.println(track.getTitle() + " has been removed from the album!");
        } else {
            System.out.println("Cannot find " + track.getTitle() + " in the album!");
        }
    }
    private boolean checkTrack(Track track) {
        for (Track t : tracks) {
            if (t.equals(track)) {
                return true;
            }
        }
        return false;
    }
	
	public int getLegth() {
		int totalLength = 0;
		for(Track track : tracks) {
			totalLength += track.getLength();
		}
	return totalLength;
	}
	
    @Override
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD artist: " + artist);
        System.out.println("CD length: " + this.getLength());
        for (Track track : tracks) {
            track.play();
        }
    }

    @Override
    public void print() {
        System.out.println("Compact Disc: " + this.getTitle() + 
                           " | Category: " + this.getCategory() + 
                           " | Artist: " + this.getArtist() + 
                           " | Length: " + this.getLength() + " seconds | Cost: " + this.getCost());
    }

    @Override
    public String toString() {
        return "Compact Disc: " + super.toString() + 
               " | Artist: " + this.getArtist() + 
               " | Length: " + this.getLength() + " seconds";
    }
}
