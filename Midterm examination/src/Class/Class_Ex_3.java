package Class;

class MyClass
{
    private String name;
    private int age;
    private int grade;
    private double credit;

    public MyClass(String name, int age, int grade, double credit)
    {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.credit = credit;
    }
    public MyClass(String name, int age, int grade)
    {
        this(name, age, grade, 0.0);
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }

    public int getGrade()
    {
        return grade;
    }

    public void setGrade(int grade)
    {
        this.grade = grade;
    }
    public double getCredit()
    {
        return credit;
    }
    public void setCredit(double credit)
    {
        this.credit = credit;
    }

    public void increaseGrade()
    {
        grade = grade + 1;
    }
    public void increaseAge()
    {
        age = age + 1;
    }

    @Override
    public String toString()
    {
        return "이름 : " + this.name + " 나이 : " + this.age + " 학년 : " + this.grade + " 학점 : " + this.credit;
    }
}

public class Class_Ex_3
{
    public static void main(String[] args)
    {
        MyClass st2 = new MyClass("김찬영", 22, 1, 4.5);
        System.out.println(st2);
    }
}
