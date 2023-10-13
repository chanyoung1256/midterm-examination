package InterFace;

public class MusicCD extends AlbumInfo implements Printable
{
    private int price;
    private String madeBy;
    public MusicCD(String artist, String album, int numOfSongs, int price, String madeBy)
    {
        super(artist, album, numOfSongs);
        this.price = price;
        this.madeBy = madeBy;
    }

    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }

    public String getMadeBy()
    {
        return madeBy;
    }
    public int getNumOfSongs()
    {
        int NumOfSongs = 0;
        return NumOfSongs;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\n가격 : " + price + "\n음반사 : " + madeBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
        {
            return true;
        }
        if (!(o instanceof MusicCD))
        {
            return false;
        }
        MusicCD musicCD = (MusicCD) o;
        return super.equals(o) && price == musicCD.price && madeBy.equals(musicCD.madeBy);
    }

    @Override
    public void printAlbumInfo()
    {
        System.out.println("앨범 정보:");
        System.out.println("가수명: " + getArtist());
        System.out.println("앨범명: " + getAlbum());
        System.out.println("곡수: " + getNumOfSongs());
        System.out.println("가격: " + price);
        System.out.println("음반사: " + madeBy);
        System.out.println("곡 목록:");
        printSongs();
    }


    @Override
    public void printAlumInfo() {

    }

    @Override
    public void printTitle()
    {
        System.out.println("첫 번째 곡 제목: " + getSong(TITLE));
    }

    public void setArtist(String 싸이) {
    }
}
