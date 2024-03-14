import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a= ab.nextInt();
        System.out.print("enter second number: ");
        int b= ab.nextInt();
        System.out.println("addition of a and b is:  " + (a+b));
        System.out.println("addition of a and b is:  " + (a^b));
        System.out.println("substraction of a and b is:  " + (a-b));
        System.out.println("division of a and b is:  " + (a/b));
        System.out.println("multiplication of a and b is:  " + (a*b));
        System.out.println("reminder of a and b is:  " + (a%b));

    }
}