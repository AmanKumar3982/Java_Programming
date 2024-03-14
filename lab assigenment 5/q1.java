import java.util.Scanner;

class Employee {
    private int employeeId;
    private String name;
    protected double salary;

    public Employee(int employeeId, String name, double salary){
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public void displayEmployee(){
        System.out.println("Employee_id = "+ employeeId);
        System.out.println("Employee Name = "+ name);
        System.out.println("Salary= "+salary);
    }
}

class Manager extends Employee {
    String department;
    double experience;
    double bonus;
    double netSalary;

    public Manager(int employeeId, String name, double salary, String department, double experience, double bonus) {
        super(employeeId, name, salary);
        this.department = department;
        this.experience = experience;
        this.bonus = bonus;
        // calculateNetSalary(); 
    }

    // public void calculateNetSalary() {
    //     netSalary = salary + bonus; 
    // }

    @Override
    public void displayEmployee() {
        super.displayEmployee();
        System.out.println("Bonus : " + bonus);
        System.out.println("Department  = " + department);
        System.out.println("Experience =" + experience);
        System.out.println("Net_salary = " + (salary+bonus));
    }
}

class Clerk extends Employee {
    String designation;

    public Clerk(int employeeId, String name , double salary, String designation){
        super(employeeId, name, salary);
        this.designation = designation;
    }

    @Override
    public void displayEmployee(){
        super.displayEmployee();

        System.out.println("Designation= "+designation);
    }
}

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("_____//||Enter Data||//____\n");
        System.out.print("Enter Employee_id :- ");
        int employeeId = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("\nEnter Employee_Name :- ");
        String name = sc.nextLine();
        System.out.print("\nEnter Salary :- ");
        double salary = sc.nextDouble();
        sc.nextLine(); // Consume newline
        System.out.print("\nEnter Department :- ");
        String department = sc.nextLine();
        System.out.print("\nEnter Employee_Experience (in years):- ");
        double experience = sc.nextDouble();
        System.out.print("\nEnter Bonus :- ");
        double bonus = sc.nextDouble();
        sc.nextLine(); // Consume newline
        System.out.print("\nEnter Designation :- ");
        String designation = sc.nextLine();

        Employee emp = new Employee(employeeId, name, salary);
        System.out.println("\n-:Class Employee details:-");
        emp.displayEmployee();

        Manager mang = new Manager(employeeId, name, salary, department, experience, bonus);
        System.out.println("\n-:Class Manager details:-");
        mang.displayEmployee();

        Clerk clerk = new Clerk(employeeId, name, salary, designation);
        System.out.println("\n-:Class Clerk details:-");
        clerk.displayEmployee();

        sc.close();
    }
}
