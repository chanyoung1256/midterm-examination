package OOP.Oop;

public class PointExam
{
    public static void main(String[] args)
    {
        Point p = new Point(10, 10);
        System.out.println(p.toString());
        Point3D p3d1 = new Point3D(10, 20, 30);
        Point3D p3d2 = new Point3D(10, 20, 30);

        if(p3d1.equals(p3d2))
        {
            System.out.println("같은 좌표");
        }else
        {
            System.out.println("다른은 좌표");
        }
        System.out.println(p3d1.toString());
        p3d1.moveBy(5, 5, -5);
        System.out.println(p3d1.toString());
    }
}
