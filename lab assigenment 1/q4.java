import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        // Scanner sc =new Scanner(System.in);
        // System.out.println("Enter first number(A): ");
        // int a = sc.nextInt();
        // System.out.println("Enter second number(B): ");
        // int b = sc.nextInt();

        int a = 5;
        int b = 4;
         
        System.out.println("Before swaping: ");
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swaping: ");
        System.out.println("A = "+a);
        System.out.println("B = "+b); 
    }
}
