import java.util.Scanner;

public class switchs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a choice 1|2|3 :");
        int button = sc.nextInt();
        switch (button){
            case 1:
                System.out.println("hellow");
                break;
            case 2:
                System.out.println("namaste");
                break;
            case 3:
                System.out.println("bonjore");
                break;
            default :
                System.out.println("invalid input");
                break;
        }
    }
}
