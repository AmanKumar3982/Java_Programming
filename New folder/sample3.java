import java.util.*;

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
    private int employeeId;

    public RegularEmployee(int employeeId, String name, double salary, double deductions, double bonus) {
        super(name, salary, deductions, bonus);
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
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

    public void addEmployee(int employeeId, String name, double salary, double deductions, double bonus) {
        if (numEmployees < MAX_EMPLOYEES) {
            employees[numEmployees] = new RegularEmployee(employeeId, name, salary, deductions, bonus);
            numEmployees++;
        } else {
            System.out.println("Maximum number of employees reached!");
        }
    }

    public void generatePaySlips() {
        System.out.println("|/|/|/|------ Pay Slips ------|/|/|/|");
        for (int i = 0; i < numEmployees; i++) {
            RegularEmployee employee = employees[i];
            double netSalary = employee.calculateNetSalary();
            System.out.println("Employee ID: " + employee.getEmployeeId());
            System.out.println("Name: " + employee.getName());
            System.out.println("Net Salary: RS" + netSalary);
            System.out.println("__________------____------___________");
        }
    }

    public void generatePaySlipForEmployee(int employeeId) {
        for (int i = 0; i < numEmployees; i++) {
            RegularEmployee employee = employees[i];
            if (employee.getEmployeeId() == employeeId) {
                double netSalary = employee.calculateNetSalary();
                System.out.println("|/|/|/|------ Pay Slip for Employee ID " + employeeId + " ------|/|/|/|");
                System.out.println("Name: " + employee.getName());
                System.out.println("Net Salary: RS" + netSalary);
                return;
            }
        }
        System.out.println("Employee with ID " + employeeId + " not found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PayrollSystem payrollSystem = new PayrollSystem();

        System.out.println("Welcome to Payroll System");

        int choice;
        do {
            System.out.println("1. Add Employee");
            System.out.println("2. Generate Pay Slips");
            System.out.println("3. Generate Pay Slip for an Employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter employee ID: ");
                    int employeeId = sc.nextInt();
                    System.out.print("Enter employee name: ");
                    String name = sc.next();
                    System.out.print("Enter salary: ");
                    double salary = sc.nextDouble();
                    System.out.print("Enter deductions: ");
                    double deductions = sc.nextDouble();
                    System.out.print("Enter bonus: ");
                    double bonus = sc.nextDouble();
                    payrollSystem.addEmployee(employeeId, name, salary, deductions, bonus);
                    break;
                case 2:
                    payrollSystem.generatePaySlips();
                    break;
                case 3:
                    System.out.print("Enter employee ID: ");
                    int id = sc.nextInt();
                    payrollSystem.generatePaySlipForEmployee(id);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
