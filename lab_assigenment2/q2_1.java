import java.util.Scanner;

public class q2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("//..Enter the employee details..//");
            System.out.println();
            System.out.print("Enter the Employee name: ");
            String name = sc.nextLine();

            System.out.print("Enter the designation: ");
            String designation = sc.nextLine();

            System.out.print("Enter the Employee ID: ");
            long employe_Id = sc.nextLong();
            sc.nextLine(); 

            System.out.print("Enter the salary/annum: ");
            double salary = sc.nextDouble();
            sc.nextLine(); 
            System.out.println();
            System.out.println("Employee " + i + " Details");
            System.out.println("Employee Name: " + name);
            System.out.println("Designation: " + designation);
            System.out.println("Employee ID: " + employe_Id);
            System.out.println("Salary per annum: " + salary);
            System.out.println();
        }
        

    }
}
