package OOP.Oop;

public class Point
{
    private int posX;
    private int posY;

    public Point()
    {
        posX = 0;
        posY = 0;
    }

    public Point(int v)
    {
        posX = v;
        posY = v;
    }

    public Point(int posX, int posY)
    {
        if(posX < 0 || posY < 0)
        {
            posX = posY = 0;
        }
        else
        {
            this.posX = posX;
            this.posY = posY;

        }
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
    public void moveBy(int posX, int posY)
    {
        this.posX += posX;
        this.posY += this.posY + posY;
    }

    @Override
    public  String toString()
    {
        return "x : " + posX + " y : " + posY;
    }
    public boolean equals(Point p)
    {
        if(this.posX == p.posX && this.posY ==p.posY)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
