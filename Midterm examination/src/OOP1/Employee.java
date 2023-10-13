package OOP1;

public class Employee {
    private String name;
    private int pay;
    private String telNo;
    private long yearPay;
    private static int empLoyeeCount;

    public Employee(String name, int pay, String telNo)
    {
        this.name = name;
        this.pay = pay;
        this.telNo = telNo;
        empLoyeeCount++;
    }
    public long calIncome()
    {
        yearPay = pay * 12;
        return yearPay;
    }
    public void display()
    {
        System.out.println("이름 : " + name);
        System.out.println("급여 : " + pay);
        System.out.println("전화번호 : " + telNo);
        System.out.println("연봉 : " + yearPay);
    }
    public void setData(int pay)
    {
        this.pay = pay;
    }
    public void setData(String telNo)
    {
        this.telNo = telNo;
    }
    public int getPay()
    {
        return this.pay;
    }
    public static int getEmpLoyeeCount()
    {
        return empLoyeeCount;
    }
}

