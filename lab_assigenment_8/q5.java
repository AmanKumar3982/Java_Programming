import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Check if the last character of the first string matches the first character of the second string
        if (!secondString.isEmpty() && firstString.charAt(firstString.length() - 1) == secondString.charAt(0)) {
            // Concatenate the strings
            String concatenatedString = firstString + secondString.substring(1);
            System.out.println("Output: " + concatenatedString);
        } else {
            System.out.println("The strings cannot be concatenated.");
        }

        scanner.close();
    }
}
