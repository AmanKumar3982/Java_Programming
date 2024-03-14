
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a choice 1,2,3:");
        int button = sc.nextInt();

        if(button==1){
            System.out.println("Hellow");
        } else if (button==2) {
            System.out.println("namaste");
        } else if (button==3) {
            System.out.println("bonjore");
        }else{
            System.out.println("invalide button");
        }
    }
}