import java.util.Scanner;

public class Q5 {
    public static boolean containsDigits(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String password;
        System.out.print("Enter password : ");
        Scanner sc = new Scanner(System.in);
        password = sc.nextLine();
        
        if (password.length() >= 8 && containsDigits(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

}