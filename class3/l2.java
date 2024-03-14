import java.util.Scanner;
public class l2 {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("enter the marks out of 100");
        System.out.print("Enter the marks of 1st subject: ");
        int s1 = ab.nextInt();
        System.out.print("Enter the marks of 2nd subject: ");
        int s2 = ab.nextInt();
        System.out.print("Enter the marks of 3rd subject: ");
        int s3 = ab.nextInt();
        System.out.print("Enter the marks of 4th subject: ");
        int s4 = ab. nextInt();
        System.out.println("Enter the marks of 5th subject: ");
        int s5 = ab.nextInt();
        int tm = s1+s2+s3+s4+s5;

        if (tm<=500&&tm>=400){
            System.out.println("Grade O "+ tm);
        }
        else if (tm<=400&&tm>=300) {
            System.out.println("Grade E "+tm);
        }
        else if (tm<=300&&tm>=200) {
            System.out.println("Grade A"+tm);
        }
        else if (tm<=200&&tm>=100) {
            System.out.println("Grade B "+tm);
        }
        else{
            System.out.println("Grade C"+tm);
        }
    }
}
