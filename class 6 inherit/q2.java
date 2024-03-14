import java.util.Scanner;

class employee{
    int employee_Id ;
    String employee_name;
    double salary;
    Scanner sc = new Scanner(System.in);
    public void insert_data(){
       System.out.print("Enter the Emp_id: ");
       employee_Id=sc.nextInt();
       System.out.println("\n Enter the name of Employee :");  
       employee_name=sc.nextLine();   
       System.out.print("Enter Salary of Employee : ");
       salary=sc.nextDouble(); 
    }
}
class manager extends employee {

    int YEAR_OF_EXPERIENCE;
    int WORK_PER_DAY;
    public void getExtdata(int YEAR_OF_EXPERIENCE, int WORK_PER_DAY) {
        this.YEAR_OF_EXPERIENCE = YEAR_OF_EXPERIENCE;
        this.WORK_PER_DAY = WORK_PER_DAY;
    }    
    public void dis_data(){
        System.out.println("EMPLOYEE_ID: "+employee_Id);
        System.out.println("EMPLOYEE_NAME: "+employee_name);
        System.out.println("EMPLOYEE_SALARY: "+ salary);
        System.out.println("Year of experience : "+ YEAR_OF_EXPERIENCE );
        System.out.println("Work per day: "+WORK_PER_DAY);
    }

}
class cleark extends employee{
    int Bonus;
    int deductions;
    public void getExtdata(int Bonus, int deductions){
        this.Bonus = Bonus; 
        this.deductions = deductions;

    }
    public void dis_data(){
        System.out.println("EMPLOYEE_ID: "+employee_Id);
        System.out.println("EMPLOYEE_NAME: "+employee_name);
        System.out.println("EMPLOYEE_SALARY: "+ salary);
        System.out.println("Bonus : "+ Bonus);
        System.out.println("Dedections: "+deductions);
        System.out.println("Gross Salary ₹ :  "+"₹"+((salary-deductions)+Bonus));
    }

}
public class q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year of Experience: ");
        int a = sc.nextInt();
        System.out.print("Enter Work hour per day: ");
        int b = sc.nextInt();
        System.out.print("Enter Bonus: ");
        int c = sc.nextInt();
        System.out.print("Enter Deduction: ");
        int d = sc.nextInt();
        manager ab = new manager();
        ab.insert_data();
        ab.getExtdata(a, b);
        ab.dis_data();

        cleark bc = new cleark();
        bc.insert_data();
        bc.getExtdata(c, d);
        bc.dis_data();

    }
}
