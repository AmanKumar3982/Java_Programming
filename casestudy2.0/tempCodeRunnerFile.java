import java.util.*;

class Employee {
    private String name;
    private double salary;
    private double deduction;
    private double bonus;

    protected Employee(String name, double salary, double deduction, double bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
        this.deduction = deduction;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getDeduction() {
        return deduction;
    }

    public double getBonus() {
        return bonus;
    }
}

class RegularEmployee extends Employee {
    private int id;

    public RegularEmployee(int id, String name, double salary, double deduction, double bonus) {
        super(name, salary, deduction, bonus);
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    public double netSalary() {
        return (getSalary() - getDeduction()) + getBonus();
    }
}

class ContractEmployee extends Employee {
    private int id;
    private int workDays;
    private double dailyWage;

    public ContractEmployee(int id, String name, double salary, int workDays, double deduction, double bonus, double dailyWage) {
        super(name, salary, deduction, bonus);
        this.id = id;
        this.workDays = workDays;
        this.dailyWage = dailyWage;
    }

    public int getWorkDays() {
        return workDays;
    }

    public double getDailyWage() {
        return dailyWage;
    }

    public int getId() {
        return id;
    }
    
    public double calSalary() {
        return workDays * dailyWage;
    }
    
    public double netSalary() {
        return (calSalary() - getDeduction()) + getBonus();
    }
}

public class Case_Study {
    private static final int MAX_EMPLOYEE = 100;
    private RegularEmployee[] regularEmployees;
    private ContractEmployee[] contractEmployees;
    private int numRegularEmployee;
    private int numContractEmployee;
    
    public Case_Study() {
        regularEmployees = new RegularEmployee[MAX_EMPLOYEE];
        contractEmployees = new ContractEmployee[MAX_EMPLOYEE];
        numRegularEmployee = 0;
        numContractEmployee = 0;
    }
    
    public void addRegularEmployee(int id, String name, double salary, double deductions, double bonuses) {
        if (numRegularEmployee < MAX_EMPLOYEE) {
            regularEmployees[numRegularEmployee] = new RegularEmployee(id, name, salary, deductions, bonuses);
            numRegularEmployee++;
        } else {
            throw new RuntimeException("Maximum number of regular employees reached!");
        }
    }
    
    public void addContractEmployee(int id, String name, double salary, int workingDays, double dailyWage, double deductions, double bonuses) {
        if (numContractEmployee < MAX_EMPLOYEE) {
            contractEmployees[numContractEmployee] = new ContractEmployee(id, name, salary, workingDays, deductions, bonuses, dailyWage);
            numContractEmployee++;
        } else {
            throw new RuntimeException("Maximum number of contract employees reached!");
        }
    }
    
    public void generatePaySlipRegularEmployee(int id) {
        for (int i = 0; i < numRegularEmployee; i++) {

            RegularEmployee employee = regularEmployees[i];
            if (employee.getId() == id) {
                System.out.println("_____|/|/|/|:PAY SLIP:|/|/|/|_____");
                System.out.println("Pay Slip for Regular Employee:");
                System.out.println("\nName: " + employee.getName());
                System.out.println("ID: " + employee.getId());
                System.out.println("Salary: " + employee.getSalary());
                System.out.println("deduction: "+ employee.getDeduction());
                System.out.println("Bonus: " + employee.getBonus());
                System.out.println("Net Salary: " + employee.netSalary());
                return;
            }
        }
        System.out.println("Regular employee with ID " + id + " not found.");
    }
    
    public void generatePaySlipContractEmployee(int id) {
        for (int i = 0; i < numContractEmployee; i++) {
            ContractEmployee employee = contractEmployees[i];
            if (employee.getId() == id) {
                System.out.println("_____|/|/|/|:PAY SLIP:|/|/|/|_____");
                System.out.println("Pay Slip for Contract Employee:");
                System.out.println("Name: " + employee.getName());
                System.out.println("ID: " + employee.getId());
                System.out.println("Salary: " + employee.calSalary());
                System.out.println("Working Days: " + employee.getWorkDays());
                System.out.println("Daily Wage: " + employee.getDailyWage());
                System.out.println("Deduction: "+ employee.getDeduction());
                System.out.println("Bonus: " + employee.getBonus());
                System.out.println("Net Salary: " + employee.netSalary());
                return;
            }
        }
        System.out.println("Contract employee with ID " + id + " not found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Case_Study caseStudy = new Case_Study();
        
        System.out.println("||///|| WELCOME TO PAYSLIP GENERATOR ||///||\n");
        
        int choice;
        do {
            System.out.println("1. ADD regular employee");
            System.out.println("2. ADD contract employee");
            System.out.println("3. Generate payslip for a regular employee");
            System.out.println("4. Generate payslip for a contract employee");
            System.out.println("5. EXIT");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter employee ID: ");
                    int regId = sc.nextInt();
                    System.out.print("Enter employee name: ");
                    sc.nextLine(); // Consume newline
                    String regName = sc.nextLine();
                    System.out.print("Enter salary: ");
                    double regSalary = sc.nextDouble();
                    System.out.print("Enter deductions: ");
                    double regDeductions = sc.nextDouble();
                    System.out.print("Enter bonus: ");
                    double regBonus = sc.nextDouble();
                    caseStudy.addRegularEmployee(regId, regName, regSalary, regDeductions, regBonus);
                    break;
                case 2:
                    System.out.print("Enter employee ID: ");
                    int conId = sc.nextInt();
                    System.out.print("Enter employee name: ");
                    sc.nextLine(); // Consume newline
                    String conName = sc.nextLine();
                    System.out.println("Enter Work days : ");
                    int conWorkDays = sc.nextInt();
                    System.out.println("Enter Daily wages: ");
                    double conDailyWage = sc.nextDouble();
                    System.out.println("Enter deductions: ");
                    double conDeduction = sc.nextDouble();
                    System.out.println("Enter Bonus: ");
                    double conBonus = sc.nextDouble();
                    caseStudy.addContractEmployee(conId, conName, 0, conWorkDays, conDailyWage, conDeduction, conBonus);
                    break;
                case 3:
                    System.out.print("Enter regular employee ID: ");
                    int regEmpId = sc.nextInt();
                    caseStudy.generatePaySlipRegularEmployee(regEmpId);
                    break;
                    
                case 4:
                    System.out.print("Enter contract employee ID: ");
                    int conEmpId = sc.nextInt();
                    caseStudy.generatePaySlipContractEmployee(conEmpId);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice >= 1 && choice <= 4);
        sc.close();
    }
}
