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

class ContractEmployee extends Employee {
    private int id;
    private double dailyWage;

    public ContractEmployee(int id, String name, double dailyWage, double deductions, double bonus) {
        super(name, 0, deductions, bonus); // Contract employees don't have a fixed salary
        this.id = id;
        this.dailyWage = dailyWage;
    }

    public int getId() {
        return id;
    }

    public double getDailyWage() {
        return dailyWage;
    }

    @Override
    public double calculateNetSalary() {
        return (dailyWage - deductions) + bonus;
    }
}

public class PayrollSystem {
    private static final int MAX_EMPLOYEES = 100;
    private RegularEmployee[] regularEmployees;
    private ContractEmployee[] contractEmployees;
    private int numRegularEmployees;
    private int numContractEmployees;

    public PayrollSystem() {
        regularEmployees = new RegularEmployee[MAX_EMPLOYEES];
        contractEmployees = new ContractEmployee[MAX_EMPLOYEES];
        numRegularEmployees = 0;
        numContractEmployees = 0;
    }

    public void addRegularEmployee(int id, String name, double salary, double deductions, double bonus) {
        if (numRegularEmployees < MAX_EMPLOYEES) {
            regularEmployees[numRegularEmployees] = new RegularEmployee(id, name, salary, deductions, bonus);
            numRegularEmployees++;
        } else {
            System.out.println("Maximum number of regular employees reached!");
        }
    }

    public void addContractEmployee(int id, String name, double dailyWage, double deductions, double bonus) {
        if (numContractEmployees < MAX_EMPLOYEES) {
            contractEmployees[numContractEmployees] = new ContractEmployee(id, name, dailyWage, deductions, bonus);
            numContractEmployees++;
        } else {
            System.out.println("Maximum number of contract employees reached!");
        }
    }

    // Other methods remain the same...

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PayrollSystem payrollSystem = new PayrollSystem();

        System.out.println("Welcome to Payroll System");

        int choice;
        do {
            System.out.println("1. Add Regular Employee");
            System.out.println("2. Add Contract Employee");
            System.out.println("3. Generate Pay Slip");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Input for regular employee
                    break;
                case 2:
                    // Input for contract employee
                    break;
                case 3:
                    // Generate pay slip
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
