package InterFace;

public abstract class AlbumInfo {
    private String artist;
    private String album;
    private String[] songs;
    private int index = 0;

    public AlbumInfo(String artist, String album)
    {
        this(artist, album, 10);
    }

    public AlbumInfo(String artist, String album, int numOfSongs)
    {
        this.artist = artist;
        this.album = album;
        this.songs = new String[numOfSongs];
    }

    public String getArtist()
    {
        return artist;
    }
    public String getAlbum()
    {
        return album;
    }
    public void setAlbum(String album)
    {
        this.album = album;
    }

    @Override
    public String toString()
    {
        return "가수명 : " + artist + "\n 앨범명 : " + album;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof AlbumInfo)) return false;
        AlbumInfo otherAlbum = (AlbumInfo) o;
        return artist.equals(otherAlbum.artist) && album.equals(otherAlbum.album);
    }
    public void addSong(String song)
    {
        if (index < songs.length)
        {
            songs[index] = song;
            index++;
        }
        else
        {
            System.out.println("더 이상 저장할 수 없습니다.");
        }
    }
    public String getSong(int index)
    {
        if (index >= 0 && index < songs.length)
        {
            return songs[index];
        }
        else
        {
            return "유효하지 않은 인덱스입니다.";
        }
    }

    public void printSongs()
    {
        System.out.print("앨범의 곡 목록:");
        for (String song : songs)
        {
            if (song != null)
            {
                System.out.print(" "+song);
            }
        }
    }

    public abstract void printAlbumInfo();
}
