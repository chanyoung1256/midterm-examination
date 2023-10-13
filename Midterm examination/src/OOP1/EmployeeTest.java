package OOP1;

public class EmployeeTest {
    public static void main(String[] args)
    {
        Employee e1 = new Employee("Kim", 12000000, "010-6333-1256");
        Employee e2 = new Employee("lee", 1000000, "010-1111-2222");
        Employee e3 = new Employee("park", 1200000, "010-3333-4444");
        Manager m1 = new Manager("choi", 3000000, "010-5555-6666", 8000000);

        e1.calIncome();
        e2.calIncome();
        e3.calIncome();
        e1.display();
        e2.display();
        e3.display();

        e3.setData(2000000);
        e3.calIncome();
        e3.display();

        System.out.println(e3.getPay());
        System.out.println(Employee.getEmpLoyeeCount());

        m1.display();
        m1.setData(4000000);
        m1.calIncome();
        m1.display();

        System.out.println(m1.getPay());
        System.out.println(Employee.getEmpLoyeeCount());
    }
}
