/**
* Class to create songs with an artist and a title.
* @author Max Liu
* @version 1.0
*/
public class Song{
  // fields
  private String artist;
  private String title;
  /**
  * Constructor for a song that takes in an artist and a title.
  * @param artist The artist of the song.
  * @param title The title of the song.
  */
  public Song(String artist, String title){
    this.artist = artist;
    this.title = title;
  }
  // accessors
  public String getArtist(){return artist;}
  public String getTitle(){return title;}
  /**
  * This method allows a song to be printed.
  * @return The name of the song followed by the artist.
  */
  public String toString(){
    return title + ", " + artist;
  }
}
