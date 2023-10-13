package OOP.Oop;

public class Point3D extends Point
{
    private int posZ;

    public Point3D(int posX, int posY, int posZ)
    {
        super(posX, posY);
        this.posZ = posZ;
    }

    public int getPosZ()
    {
        return posZ;
    }
    public void setPosZ(int posZ)
    {
        this.posZ = posZ;
    }

    public void moveBy(int posX, int posY, int posZ)
    {
        moveBy(posX, posY);
        this.posZ += posZ;
    }
    public String toString()
    {
        return super.toString() + " z : " + this.posZ;
    }
    public boolean equals(Point3D p)
    {
        if(!super.equals(p))
        {
            return false;
        }
        else if(this.posZ == p.posZ)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
