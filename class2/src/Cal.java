import java.util.*;

public class Cal {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int choice, num1=0 , num2=0; // Initialize num1 and num2
        System.out.println(
                "\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus\n6.Square\n7.Root\n8.Cube Root");
        System.out.print("\nEnter Choice: ");
        choice = n.nextInt();
        if (choice == 6 || choice == 7 || choice == 8) {
            System.out.println("Enter a Number: ");
            num1 = n.nextInt();
        } else if (choice >= 1 && choice <= 5) {
            System.out.println("Enter Two Numbers: ");
            num1 = n.nextInt();
            num2 = n.nextInt();
        } else {
            System.out.println("Invalid Input!!");
            System.exit(0); // Terminate the program if the input is invalid
        }

        switch (choice) {
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                if (num2 != 0) {
                    double result = (double) num1 / num2; // Use double for better precision
                    System.out.println(result);
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            case 5:
                if (num2 != 0) {
                    System.out.println(num1 % num2);
                } else {
                    System.out.println("Error: Modulus by zero");
                }
                break;
            case 6:
                System.out.println(num1 * num1);
                break;
            case 7:
                System.out.println(Math.sqrt(num1));
                break;
            case 8:
                System.out.println(Math.cbrt(num1));
                break;
            default:
                System.out.println("Invalid Input!!");
                break;
        }
    }
}
