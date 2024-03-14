import java.util.Scanner;

public class l1 {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = ab.nextInt();
        if (age >= 18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not Eligible to vote");
        }
    }
}
