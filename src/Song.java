public class Song {
    private String title;
    private String artist;
    private String album;

    /**
     * Default constructor for Song class.
     * This takes in the title, artist, and album of the song
     * @param title Title of the song
     * @param artist Name of the artist of the song
     * @param album Album containing the song
     */
    public Song(String title, String artist, String album){
        this.title = title;
        this.artist = artist;
        this.album = album;
    }

    /**
     * Getter for title
     * @return title
     */
    public String getTitle(){
        return title;
    }
    /**
     * Getter for artist
     * @return artist
     */
    public String getArtist(){
        return artist;
    }
    /**
     * Getter for album
     * @return album
     */
    public String getAlbum(){
        return album;
    }
    /**
     * Setter for title
     * @param title new title of the song
     */
    public void setTitle(String title){
        this.title = title;
    }
    /**
     * Setter for artist
     * @param artist new artist of the song
     */
    public void setArtist(String artist){
        this.artist = artist;
    }
    /**
     * Setter for album
     * @param album new album of the song
     */
    public void setAlbum(String album){
        this.album = album;
    }
}
