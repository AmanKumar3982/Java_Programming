import java.util.Scanner;

public class q2 {
    public static int calculate_Product(int a, int b ){
        int product = a*b;
        return product;
    }

    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = ab.nextInt();
        System.out.print("Enter second number: ");
        int b = ab.nextInt();

        int product = calculate_Product(a,b);
        System.out.println("product of to number = "+product);



    }

}
