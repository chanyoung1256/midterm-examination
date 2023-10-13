package Class;

class Student
{
    private int studentNo;
    private String studentName;
    private int grade;
    private String dept;

    public Student(int studentNo, String studentName, int grade, String dept)
    {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.grade = grade;
        this.dept = dept;
    }

    public int getStudentNo()
    {
        return studentNo;
    }
    public void setStudentNo(int studentNo)
    {
        this.studentNo = studentNo;
    }

    public String getStudentName()
    {
        return studentName;
    }
    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }

    public int getGrade()
    {
        return grade;
    }
    public void setGrade(int grade)
    {
        this.grade = grade;
    }

    public String getDept()
    {
        return dept;
    }
    public void setDept(String dept)
    {
        this.dept = dept;
    }

    public String toStirng()
    {
        return " 학번 : " + this.studentNo + " 이름 : " + this.studentName  +  " 학년 : " + this.grade + "학과 : " + this.dept;
    }
}
public class Class_Ex_2 {
    public static void main(String[] args)
    {
        Student s1 = new Student(12345678, "홍길동", 1, "달리기학과");
        Student s2 = new Student(87654321, "도레미", 2, "물고기학과");
        Student s3 = new Student(12345678, "아이폰", 4, "컴퓨터학과");


        System.out.println(s1.toStirng());
        System.out.println(s2.toStirng());
        System.out.println(s3.toStirng());


    }
}
