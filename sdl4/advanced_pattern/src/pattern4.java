public class pattern4 {
    public static void main(String[] args) {
        // here we will do q13
       int n=5;
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=n-i ; j++) {
                System.out.print(" ");// here we first print the spaces

            }
            for (int j = i; j >=1; j--) {
                System.out.print(j);// here we print the first half of the code from column 5 to 1

            }
            for (int j = 2; j <=i ; j++) {
                System.out.print(j);// here we print the second half of the code rest

            }
            System.out.println();

        }

    }
}
