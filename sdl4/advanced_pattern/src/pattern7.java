import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of n = ");
        int n = scanner.nextInt();

        if (n > 1) {
            for (int i = 0; i < 2 * n - 1; i++) {
                System.out.print("* ");
            }
            System.out.println();

            int posF, posE;
            for (int i = 1; i < 2 * n - 2; i++) {
                posF = i;
                posE = (2 * n - 1) - i - 1;
                for (int j = 0; j < 2 * n - 1; j++) {
                    if (j == posE || j == posF) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }

            for (int i = 0; i < 2 * n - 1; i++) {
                System.out.print("* ");
            }
        }
    }
}
