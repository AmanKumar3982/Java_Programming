import java.util.Scanner;

public class q3 {
    public static int print_factorial (int n) {
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }

        return fact;
    }
    public static void main(String[] args) {
        Scanner fc = new Scanner(System.in);
        System.out.print("enter the number:");
        int n = fc.nextInt();
        int fact = print_factorial(n);

        System.out.println("factorial of a number = "+ fact);

    }
}
