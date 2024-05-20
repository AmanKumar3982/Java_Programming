import java.util.Arrays;
import java.util.Scanner;

public class q2 {
    public boolean anagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();
        Arrays.sort(arrA);
        Arrays.sort(arrB);

        return Arrays.equals(arrA, arrB);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter first String = ");
        String a = sc.nextLine();
        System.out.print("\nEnter second String = ");
        String b = sc.nextLine();

        q2 q = new q2();
        boolean isAnagram = q.anagram(a, b);
        if (isAnagram) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
