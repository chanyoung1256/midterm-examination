package InterFace;

public class Test
{
    public static void main(String[] args)
    {
        MusicCD m1 = new MusicCD("psy", "champion", 10, 12000, "sony");

        MusicCD m2 = new MusicCD("조PD", "친구여", 8, 11000, "sony");

        if (m1.equals(m2))
        {
            System.out.println("같은 음반");
        }
        else
        {
            System.out.println("다른 음반");
        }

        System.out.println("m1 음반 정보:\n" + m1.toString());

        m1.addSong("새");
        m1.addSong("챔피언");
        m1.addSong("강남스타일");

        System.out.print("\nm1 앨범 정보:");
        m1.printAlbumInfo();

        m1.setArtist("싸이");

        System.out.print("\nm1의 타이틀 곡:");
        m1.printTitle();
    }
}
