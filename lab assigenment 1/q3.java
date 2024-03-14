import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        int c ;
        int a = 5;
        int b = 4;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter first number: ");
        // int a = sc.nextInt();
        // System.out.println("Enter second number: ");
        // int b = sc.nextInt();
        System.out.println("Before swaping: ");
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        c=a;
        a=b;
        b=c;
        System.out.println("After swaping: ");
        System.out.println("A = "+a);
        System.out.println("B = "+b);
    }
}
