package hust.soict.dsai.aims.media;

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
	
	public CD(int id, String title, String category, float cost, String director, int length) {
		super(id, title, category, cost, director, length);
	}
	public CD(int id, String title, String category, float cost, String director, int length, String artist,
			List<Track> tracks) {
		super(id, title, category, cost, director, length);
		this.artist = artist;
		this.tracks = tracks;
	}
	
	
	// Thêm bài mới
	public void addTrack(Track track) {
		if(!tracks.contains(track)) {
			tracks.add(track);
			System.out.println("Đã thêm vào " + getTitle());
		}
		else {
			System.out.println("Đã có trong " + getTitle());
		}
	}
	
	//Xóa bài
	public void removeTrack(Track track) {
		if(tracks.remove(track)) {
			System.out.println("Đã xóa khỏi " + getTitle());
		}
		else {
			System.out.println("Không có trong " + getTitle());
		}
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
        System.out.println("CD length: " + this.getLength());
        for (Track track : tracks) {
            track.play();
        }
    }
	
	
	
	
	
}
