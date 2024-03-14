
import java.util.*;

class Employee {
    private String name;
    private double salary;
    private double deductions;
    private double bonus;

    public Employee(String name, double salary, double deductions, double bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
        this.deductions = deductions;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getDeductions() {
        return deductions;
    }
    public double bouns(){
        return bonus;
    }
}

public class casestudy_sample {
    private static final int MAX_EMPLOYEES = 100;
    private Employee[] employees;
    private int numEmployees;

    public casestudy_sample() {
        employees = new Employee[MAX_EMPLOYEES];
        numEmployees = 0;
    }

    public void addEmployee(String name, double salary, double deductions,double bonus) {
        if (numEmployees < MAX_EMPLOYEES) {
            employees[numEmployees] = new Employee(name, salary, deductions, bonus);
            numEmployees++;
        } else {
            System.out.println("Maximum number of employees reached!");
        }
    }
    public void generatePaySlips() {
        System.out.println("|/|/|/|------ Pay Slips ------|/|/|/|");
        for (int i = 0; i < numEmployees; i++) {
            Employee employee = employees[i];
            double netSalary = (employee.getSalary() - employee.getDeductions())+employee.bouns();
            System.out.println("Name: " + employee.getName());
            System.out.println("Net Salary: RS" + netSalary);
            System.out.println("-_-_-_-_-_-_-_-_-_-");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        casestudy_sample paySlipSystem = new casestudy_sample();

        System.out.println("Welcome to CGU Pay Slip Generation System");

        int choice;
        System.out.println("1. Add Employee");
            System.out.println("2. Generate Pay Slips");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
        do {

            switch (choice) {
                case 1:
                    System.out.print("Enter employee name: ");
                    String name = sc.next();
                    System.out.print("Enter salary: ");
                    double salary = sc.nextDouble();
                    System.out.print("Enter deductions: ");
                    double deductions = sc.nextDouble();
                    System.out.print("Enter bonus: ");
                    double bonus = sc.nextDouble();
                    paySlipSystem.addEmployee(name, salary, deductions, bonus);
                    break;
                case 2:
                    paySlipSystem.generatePaySlips();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 3);

        sc.close();
    } 
}


