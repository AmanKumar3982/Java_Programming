import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("/////operation/////\n"+"1. Addition\n"+"2. substraction\n"+"3.multiplication\n"+"4.Division\n"+"5. modulus\n"+"6. Square root\n"+"7. cube root\n"+"enter a choice 1|2|3|4|enter any number to exit. :");
        int button = sc.nextInt();
        
        System.out.print("Enter first number: ");
        float a = sc.nextFloat();
        System.out.print("Enter second number: ");
        float b = sc.nextFloat();


        switch (button){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                float num = (a/b);
                System.out.println(num);
                break;
            case 5:
                System.out.println(a%b);
                break;
            case 6:
                System.out.println("square root of a = "+Math.sqrt(a));
                System.out.println("square root of b = "+Math.sqrt(b));
                break;
            case 7:
                System.out.println("Cube root of a = "+Math.cbrt(a));
                System.out.println("Cube root of b = "+Math.cbrt(b));

            default:
                System.exit(0);
            break;

        }
    }
    
}
