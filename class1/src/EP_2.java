import java.util.Scanner;
public class EP_2 {
    
        int a;
        int b;
    public EP_2() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
         a = sc.nextInt();
        System.out.print("Enter the second number: ");
         b = sc.nextInt();

    }

    public int adder() {
        int c = a + b;
        return c;
    }
    public static void main(String[] args) {
        EP_2 myObject = new EP_2();
        int result = myObject.adder();
        System.out.println("The sum of two numbers is: " + result);
    }

}

