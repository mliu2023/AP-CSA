/**
* Class to create an array of top 10 songs.
* @author Max Liu
* @version 1.0
*/
public class Top10Songs{
  // fields
  private Song[] songs;
  /**
  * Default constructor to create an song array of size 10.
  */
  public Top10Songs(){
    songs = new Song[10];
  }
  public Song getSong(int index){
    return songs[index];
  }
  /**
  * This method adds a song at the first available spot and returns true.
  * If a song can't be added, returns false
  * @param song The song that is being added.
  * @return true if the song was added, false otherwise.
  */
  public boolean add(Song song){
    for(int i = 0; i < songs.length; i++){
      if(songs[i] == null){
        songs[i] = song;
        return true;
      }
    }
    return false;
  }
  /**
  * This method adds a song at position index and returns the last song that is bumped from the list.
  * @param song The song that is added.
  * @param index The index at which the song is added.
  * @return The song that is bumped from the end of the list.
  */
  public Song add(Song song, int index){
    Song temp = songs[songs.length-1];
    for(int i = songs.length-1; i > index; i--){
      songs[i] = songs[i-1];
    }
    songs[index] = song;
    return temp;
  }
  /**
  * This method allows the array of songs to be printed in a list.
  * @return A list of songs
  */
  public String toString(){
    String list = "";
    for(int i = 0; i < songs.length; i++){
      if(songs[i] == null){
        list += i + ". Empty Song\n";
      }
      else{
        list += i + ". " + songs[i].toString() + "\n";
      }
    }
    return list;
  }
}
