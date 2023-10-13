package Class;

class Point
{
    private int posX;
    private int posY;

    public Point(int posX, int posY)
    {
        this.posX = posX;
        this.posY = posY;
    }

    public Point(int posX) {
    }

    public int getPosX()
    {
        return posX;
    }
    public void setPosX(int posX)
    {
        this.posX = posX;
    }

    public int getPosY()
    {
        return posY;
    }
    public void setPosY(int posY)
    {
        this.posY = posY;
    }

    @Override
    public String toString()
    {
        return "x좌료 : " + this.posX + " y좌표 : " + this.posY;
    }

    public boolean equals(Object obj)
    {
        if(obj instanceof Point)
        {
            Point p =(Point)obj;
            if(this.posX == p.getPosX() && this.posY == p.getPosY())
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

}
public class Class_Ex_1 {
    public static void main(String[] args) {
        Point p1 = new Point(10);
        Point p2 = new Point(10, 20);

        if(p1.equals(p2))
        {
            System.out.println("동일 위치 좌표");
        }
        else
        {
            System.out.println("다른 위치 좌표");
        }
        System.out.println("X : " + p1.getPosX() + " Y : " + p1.getPosY());
        System.out.println(p1 + p2.toString());

        p2.setPosY(10);

        if(p1.equals(p2))
        {
            System.out.println("동일 위치 좌표");
        }
        else
        {
            System.out.println("다른 위치 좌표");
        }
        System.out.println(p1 + p2.toString());
    }
}
