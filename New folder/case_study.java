class Employee {
    private String Name;
    private double Salary;
    private double deduction;
    private double bonus;

    // Constructor for Employee class
    Employee(String Name, double Salary, double deduction, double bonus) {
        this.Name = Name;
        this.Salary = Salary;
        this.bonus = bonus;
        this.deduction = deduction;
    }

    // Getter methods
    public String getName() {
        return Name;
    }

    public double getSalary() {
        return Salary;
    }

    public double getDeduction() { // Corrected method name to follow Java conventions
        return deduction;
    }

    public double getBonus() { // Corrected method name to follow Java conventions
        return bonus;
    }
}

class RegularEmployee extends Employee { // Corrected class name to follow Java conventions
    private int id;
    private double net_salary;

    // Constructor for RegularEmployee class
    public RegularEmployee(int id, String name, double salary, double deduction, double bonus, double net_salary) {
        super(name, salary, deduction, bonus);
        this.id = id;
        this.net_salary = netSalary();
    }

    // Getter method for ID
    public int getId() { // Corrected method name to follow Java conventions
        return id;
    }

    // Method to calculate net salary
    public double netSalary() {
        return (getSalary() - getDeduction()) + getBonus();
    }
}

class ContractEmployee extends Employee { // Corrected class name to follow Java conventions
    private int id;
    private int Work_days;
    private double daily_wages;
    private double net_salary;

    // Constructor for ContractEmployee class
    public ContractEmployee(int id, String name, double salary, int work_days, double deduction, double bonus,
                             double daily_wages, double net_salary) {
        super(name, salary, deduction, bonus);
        this.id = id;
        this.Work_days = work_days;
        this.daily_wages = daily_wages;
        // Removed unnecessary assignment statements here
        this.net_salary = netSalary();
    }

    // Method to calculate salary
    public double cal_salary() {
        return (Work_days * daily_wages);
    }

    // Method to calculate net salary
    public double netSalary() {
        return (cal_salary() - getDeduction()) + getBonus();
    }
}

public class CaseStudy { // Corrected class name to follow Java conventions
    private static final int MAX_EMPLOYEE = 100;
    private RegularEmployee[] regularEmployees;
    private ContractEmployee[] contractEmployees; // Corrected variable name to follow Java conventions
    private int numRegularEmployee; // Corrected variable name to follow Java conventions
    private int numContractEmployee; // Corrected variable name to follow Java conventions

    // Constructor for CaseStudy class
    public CaseStudy() {
        regularEmployees = new RegularEmployee[MAX_EMPLOYEE];
        contractEmployees = new ContractEmployee[MAX_EMPLOYEE];
        numRegularEmployee = 0;
        numContractEmployee = 0;
    }

    // Method to add regular employee
    public void addRegularEmployee(int id, String name, double salary, double deductions, double bonuses, double netSalary) { // Corrected method name to follow Java conventions
        if (numRegularEmployee < MAX_EMPLOYEE) {
            regularEmployees[numRegularEmployee] = new RegularEmployee(id, name, salary, deductions, bonuses, netSalary);
            numRegularEmployee++;
        } else {
            System.out.println("Maximum number of regular employees reached!");
        }
    }

    // Method to add contract employee
    public void addContractEmployee(int id, String name, double salary, int workingDays, double dailyWage, double net_salary) {
        if (numContractEmployee < MAX_EMPLOYEE) {
            contractEmployees[numContractEmployee] = new ContractEmployee(id, name, salary, workingDays, dailyWage, net_salary);
            numContractEmployee++;
        } else {
            System.out.println("Maximum number of contract employees reached");
        }
    }
    

    // Method to generate payslip for regular employee
    public void generatePaySlipRegularEmployee(int id) {
        for (int i = 0; i < numRegularEmployee; i++) {
            RegularEmployee employee = regularEmployees[i];
            if (employee.getId() == id) {
                System.out.println("Pay Slip for Regular Employee:");
                System.out.println("Name: " + employee.getName());
                System.out.println("ID: " + employee.getId());
                System.out.println("Salary: " + employee.getSalary());
                System.out.println("Deduction: " + employee.getDeduction());
                System.out.println("Bonus: " + employee.getBonus());
                System.out.println("Net Salary: " + employee.netSalary());
                return;
            }
        }
        System.out.println("Regular employee with ID " + id + " not found.");
    }

    // Method to generate payslip for contract employee
    public void generatePaySlipContractEmployee(int id) {
        for (int i = 0; i < numContractEmployee; i++) {
            ContractEmployee employee = contractEmployees[i];
            if (employee.getId() == id) {
                System.out.println("Pay Slip for Contract Employee:");
                System.out.println("Name: " + employee.getName());
                System.out.println("ID: " + employee.getId());
                System.out.println("Salary: " + employee.getSalary());
                System.out.println("Deduction: " + employee.getDeduction());
                System.out.println("Bonus: " + employee.getBonus());
                System.out.println("Net Salary: " + employee.netSalary());
                return;
            }
        }
        System.out.println("Contract employee with ID " + id + " not found.");
    }

    public static void main(String[] args) {

    }
}
