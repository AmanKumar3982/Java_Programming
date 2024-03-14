import java.util.Scanner;

public class q2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long n = sc.nextLong();
        long fact = 1;
        for (int i = 1; i <=n ; i++) {
            fact = fact*i;
            
        }
        System.out.println("factorial of "+n+ " is = " +fact);

    }
}
