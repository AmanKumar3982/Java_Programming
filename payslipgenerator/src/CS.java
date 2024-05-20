import java.util.*;

class Employee {
    public String name;
    public double salary;
    public double deduction;
    public double bonus;

    protected Employee(String name, double salary, double deduction, double bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
        this.deduction = deduction;
    }
}

class RegularEmployee extends Employee {
    public int id;

    public RegularEmployee(int id, String name, double salary, double deduction, double bonus) {
        super(name, salary, deduction, bonus);
        this.id = id;
    }

    public void loadDataRegular(){
        App.addRecord(id, name, 0, 0, deduction, bonus, "R", salary);
    }
}

class ContractEmployee extends Employee {
    public int id;
    public int workDays;
    public double dailyWage;

    public ContractEmployee(int id, String name, double salary, int workDays, double deduction, double bonus, double dailyWage) {
        super(name, salary, deduction, bonus);
        this.id = id;
        this.workDays = workDays;
        this.dailyWage = dailyWage;
    }

    public void loadDataContract(){
        App.addRecord(id, name, workDays, dailyWage, deduction, bonus, "C", (workDays * dailyWage));
    }
}

public class CS {
    
    public void addRegularEmployee(int id, String name, double salary, double deductions, double bonuses) {
        RegularEmployee temp = new RegularEmployee(id, name, salary, deductions, bonuses);
        temp.loadDataRegular();
    }
    
    public void addContractEmployee(int id, String name, double salary, int workingDays, double dailyWage, double deductions, double bonuses) {
        ContractEmployee temp = new ContractEmployee(id, name, salary, workingDays, deductions, bonuses, dailyWage);
        temp.loadDataContract();
    }

    public void generatePaySlipRegularEmployee(int id, String[] data) {
        if(data == null){
            System.out.println("\nRegular employee with ID " + id + " not found.\n\n");
            return;
        }
        double salary = Double.parseDouble(data[7]);
        double deduction = Double.parseDouble(data[4]);
        double bonus = Double.parseDouble(data[5]);
        System.out.println("\n\n_____|/|/|/|:PAY SLIP:|/|/|/|_____\n");
        System.out.println("Pay Slip for Regular Employee:\n\n");
        System.out.println("Name: " + data[1]);
        System.out.println("ID: " + data[0]);
        System.out.println("Salary: " + data[7]);
        // System.out.println("Working Days: " + data[2]);
        // System.out.println("Daily Wage: " + data[3]);
        System.out.println("Deduction: "+ data[4]);
        System.out.println("Bonus: " + data[5]);
        System.out.println("Employee Type: " + data[6]);
        System.out.println("Net Salary: " + (salary - deduction + bonus) + "\n");
    }

    public void generatePaySlipContractEmployee(int id, String[] data) {
        if(data == null){
            System.out.println("\nContract employee with ID " + id + " not found.\n\n");
            return;
        }
        double salary = Double.parseDouble(data[7]);
        double deduction = Double.parseDouble(data[4]);
        double bonus = Double.parseDouble(data[5]);
        System.out.println("\n\n_____|/|/|/|:PAY SLIP:|/|/|/|_____\n");
        System.out.println("Pay Slip for Contract Employee:\n\n");
        System.out.println("Name: " + data[1]);
        System.out.println("ID: " + data[0]);
        System.out.println("Salary: " + data[7]);
        System.out.println("Working Days: " + data[2]);
        System.out.println("Daily Wage: " + data[3]);
        System.out.println("Deduction: "+ data[4]);
        System.out.println("Bonus: " + data[5]);
        System.out.println("Employee Type: " + data[6]);
        System.out.println("Net Salary: " + (salary - deduction + bonus) + "\n");
    }

    public static void main(String[] args) {
        App.createTable();
        Scanner sc = new Scanner(System.in);

        CS caseStudy = new CS();
        
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
                    String[] data_regular = App.generatePaySlipRegular(regEmpId);
                    caseStudy.generatePaySlipRegularEmployee(regEmpId, data_regular);
                    break;
                    
                case 4:
                    System.out.print("Enter contract employee ID: ");
                    int conEmpId = sc.nextInt();
                    String[] data_contract = App.generatePaySlipContract(conEmpId);
                    caseStudy.generatePaySlipContractEmployee(conEmpId, data_contract);
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