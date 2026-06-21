class Employee {
    int Salary;
    String Name;
    String Department;

    public Employee() {
        System.out.println("Employee Object Initialized");
    }

    public Employee(int Salary) {
        this.Salary = Salary;
    }

    public Employee(String Name, int Salary) {
        this.Name = Name;
        this.Salary = Salary;
    }

    public Employee(String Department, String Name, int Salary) {
        this.Department = Department;
        this.Name = Name;
        this.Salary = Salary;
    }

    public void printDetails() {
        System.out.println("\nUser Details :-");
        System.out.println("Name = " + Name);
        System.out.println("Salary = " + Salary);
        System.out.println("Department = " + Department);
    }
}

public class Question {
    public static void main(String[] args) {
        Employee em = new Employee();
        em.Department = "tech";
        em.Name = "User1";
        em.Salary = 10000;
        em.printDetails();

        Employee em1 = new Employee(12000);
        em1.Department = "tech";
        em1.Name = "User2";
        em1.printDetails();

        Employee em2 = new Employee("User3", 13000);
        em2.Department = "tech";
        em2.printDetails();

        Employee em3 = new Employee("tech", "User4", 14000);
        em3.printDetails();

    }
}
