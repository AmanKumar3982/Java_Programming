import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Employee {
    protected String name;
    protected double salary;
    protected double deductions;
    protected double bonus;

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

    public double getBonus() {
        return bonus;
    }

    public double calculateNetSalary() {
        return (salary - deductions) + bonus;
    }
}

class RegularEmployee extends Employee {
    private int id;

    public RegularEmployee(int id, String name, double salary, double deductions, double bonus) {
        super(name, salary, deductions, bonus);
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

public class PayrollSystem {
    private static final int MAX_EMPLOYEES = 100;
    private RegularEmployee[] employees;
    private int numEmployees;

    public PayrollSystem() {
        employees = new RegularEmployee[MAX_EMPLOYEES];
        numEmployees = 0;
    }

    public void addEmployee(int id, String name, double salary, double deductions, double bonus) {
        if (numEmployees < MAX_EMPLOYEES) {
            employees[numEmployees] = new RegularEmployee(id, name, salary, deductions, bonus);
            numEmployees++;
        } else {
            System.out.println("Maximum number of employees reached!");
        }
    }

    public void generatePaySlip(int id) {
        for (int i = 0; i < numEmployees; i++) {
            RegularEmployee employee = employees[i];
            if (employee.getId() == id) {
                double netSalary = employee.calculateNetSalary();
                System.out.println("|/|/|/|------ Pay Slip for Employee ID: " + id + " ------|/|/|/|");
                System.out.println("Name: " + employee.getName());
                System.out.println("Net Salary: RS" + netSalary);
                System.out.println("-_-_-_-_-_-_-_-_-_-");
                savePaySlip(id, employee.getName(), netSalary);
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    private void savePaySlip(int id, String name, double netSalary) {
        try (FileWriter writer = new FileWriter("pay_slips.txt", true)) {
            writer.write("Employee ID: " + id + "\n");
            writer.write("Name: " + name + "\n");
            writer.write("Net Salary: RS" + netSalary + "\n");
            writer.write("\n");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PayrollSystem payrollSystem = new PayrollSystem();

        System.out.println("Welcome to Payroll System");

        int choice;
        do {
            System.out.println("1. Add Employee");
            System.out.println("2. Generate Pay Slip");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter employee ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter employee name: ");
                    String name = sc.next();
                    System.out.print("Enter salary: ");
                    double salary = sc.nextDouble();
                    System.out.print("Enter deductions: ");
                    double deductions = sc.nextDouble();
                    System.out.print("Enter bonus: ");
                    double bonus = sc.nextDouble();
                    payrollSystem.addEmployee(id, name, salary, deductions, bonus);
                    break;
                case 2:
                    System.out.print("Enter employee ID: ");
                    int empId = sc.nextInt();
                    payrollSystem.generatePaySlip(empId);
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
