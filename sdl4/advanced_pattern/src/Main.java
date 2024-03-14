// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int  m=5;
        int  n=4;
        // this is the first part of the code...
        for (int i = 0; i <= n; i++) {// this is for the rows
            for (int j = 0; j <= i; j++) {//this is for the columns
                System.out.print(" * ");// here is the command to print the stars for the half
            }
            for (int j = 0; j < 2*(n-i); j++) {// command to print the spaces
                System.out.print("   ");

            }
            /* *
               * *
               * * *
               * * * *
               * * * * *  only this much will be printed from the above code
             */
           /*
                                     *
                                   * *
                                 * * *
                               * * * *
                             * * * * *
             */
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");

            }
            System.out.println();

          // with the above  half of the stars will be printed...
//               *                 *
//               * *             * *
//               * * *         * * *
//               * * * *     * * * *
//               * * * * * * * * * *
//          this pattern will be printed
//
//
        }
        // second half of the code where we reverse the rows of the  first part
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");



            }
            for (int j = 0; j < 2*(n-i); j++) {
                System.out.print("   ");

            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");

            }
            System.out.println();


        }


    }
}