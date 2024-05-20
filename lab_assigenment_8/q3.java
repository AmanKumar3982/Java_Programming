import java.util.Scanner;

public class q3 {
    private static boolean isValidPassword(String password) {  
        if (password.length() < 8)
            return false;

        // Remove leading and trailing spaces
        password = password.trim();

        // Convert first character to uppercase if not already
        char firstChar = password.charAt(0);
        if (!Character.isUpperCase(firstChar))
            password = Character.toUpperCase(firstChar) + password.substring(1);

        // Check for at least one special character
        if (!password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*"))
            return false;

        // Check for at least one numeric character
        if (!password.matches(".*\\d.*"))
            return false;

        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a password:");
        String password = scanner.nextLine().trim();

        if (isValidPassword(password)) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }

        scanner.close();
    }

    
}
