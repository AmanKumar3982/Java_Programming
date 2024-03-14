import java.util.Scanner;

public class q3 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first alphabet: ");
        char a = sc.next().charAt(0);
        System.out.println("Enter the second alphabet: ");
        char b = sc.next().charAt(0);

        int as1 = a;
        int as2 = b;
        
        System.out.println(as1 + " " + as2);
    }
}
