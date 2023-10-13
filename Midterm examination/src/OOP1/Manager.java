package OOP1;

public class Manager extends Employee
{
    private int allowance;
    public Manager(String name, int pay, String telNo, int allowance)
    {
        super(name, pay, telNo);
        this.allowance = allowance;
    }
    public long calIncome()
    {
        return super.calIncome() + allowance;
    }
    public int getAllowance()
    {
        return allowance;
    }
    public void disPlay()
    {
        super.display();
        System.out.println("수당 : " + allowance);
    }
}
