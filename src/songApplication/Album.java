package songApplication;
import songApplication.Song;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {

	
	private String name;
	private String artist;
	private ArrayList<Song> songs;
	
	public Album(String name, String artist) {
		super();
		this.name = name;
		this.artist = artist;
		this.songs = new ArrayList<>();
		
	}
	
	
	// find the song
	
	public boolean findSong(String title)
	{
	    for(Song checkSong: this.songs)
	    {
	    	if(checkSong.equals(title))
	    	{
	    		
	    		System.out.println("Song found!");
	    		return true;
	    	}
	    }
	    return false;
	}
	
	
	// add song
	
	public boolean addSong(String title, double duration)
	{
		if(findSong(title)==true)
		{
			System.out.println("Aleady have the song with same name");
			return false;
		}
		
		Song newSong = new Song(title,duration);
		return true;
	}
	
	
	
	
	// add playList
	
	
	public boolean addtoPlayList(String title ,LinkedList<Song> playList)
	{
		
		
		for(Song checkSong: this.songs )
		{
			if(checkSong.getTitle().equals(title))
			{
				playList.add(checkSong);
				return true;
			}
		}
		
		return false;
	}
	
	
	public boolean addtoPlayList(int trackNumber ,LinkedList<Song> playList)
	{
		int index = trackNumber-1;
		if(index>=0 && index<=this.songs.size()-1)
		{
		playList.add(this.songs.get(index));
		return true;
		}
		
		return false;
	}
	
}
