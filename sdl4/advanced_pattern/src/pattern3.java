import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of n = ");
        int n = scanner.nextInt();
        for (int i = n; i >=0; i--){
            for (int j = 0; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                if(i-j==0||i-j==i||i==n||j==n) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if(i-j==0||i-j==i||i==n||j==n) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}
