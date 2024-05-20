import java.util.Scanner;

public class q4 {
    public static boolean ValidEmail(String e) {
        if (e.contains("@") && e.contains(".com")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email address: ");
        String e = scanner.nextLine();
        if (ValidEmail(e)) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}
