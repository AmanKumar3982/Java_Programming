import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print ("Enter a String: ");
        String s = sc.nextLine();
        System.out.println("String in upper case = "+s.toUpperCase()
        );
        System.out.println("String in lower case = "+s.toLowerCase());

        System.out.print("Enter the string to be trimed(Without Spaces) :  ");
        String a = sc.nextLine();
        String b = a.replace(" ","");
        System.out.println("(Without Space) String = "+b);
    }
}
