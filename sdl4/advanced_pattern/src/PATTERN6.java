public class PATTERN6 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = n/2; i<n ; i+=2) {
//            System.out.print("*");
            for (int j = 1; j <n-i ; j+=2) {
                System.out.print(" ");
            }
            for (int j = 1; j <i+1 ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <n-i+1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = n; i > 0; i --) {
            for (int j = 0; j < n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i*2 ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
}
