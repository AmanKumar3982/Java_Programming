import java.util.Arrays;

public class pattern_q {
    public static void main(String[] args) {
        int m=4;
        int n=5;
        int num=1;
        /*print the pattern
        * * * * *
        * * * * *
        * * * * *
        * * * * *
        */


        /*(int i=1 ; i<=m; i++){
            for(int j=1 ; j<=n ;j++) {
                System.out.print("* ");
            }
            System.out.println();*/

        /* print this pattern * * * * *
                              *       *
                              *       *
                              * * * * *
         */

//        for(int i=1; i<=m; i++){
//            for(int j=1 ; j<=n ; j++){
//                System.out.print(" ");
//                if (i==1||j==1||i==m||j==n){
//                    System.out.print("*");
//
//
//                }else{
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
        /*print the pattern *
                            * *
                            * * *
                            * * * *

         */
       for(int i=1 ;i<=n;i++){
           for(int j=1 ; j<=i; j++){
               System.out.print(i);
           }
           System.out.println();

       }
        /* print the pattern  * * * * *
                              * * * *
                              * * *
                              * *
                              *
         */
        /*
        for (int i = n ;i>=1;i--){
            for (int j = i; j>=1 ; j--) {
                System.out.print("* ");

            }
            System.out.println();
        }*/
        /* print thr pattern
                                *
                              * *
                            * * *
                          * * * *
         */
        /*for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");

            }

            for (int j =1 ; j <= i ; j++) {
                System.out.print("*");

            }

            System.out.println();




        }*/
        /*wap to print 1
                       12
                       123
                       1234
                       12345


         */
       /* for(int i=1 ;i<=n;i++){
            for(int j=1 ; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();

        }*/
        /*wap to print 1 2 3 4 5
                       1 2 3 4
                       1 2 3
                       1 2
                       1
         */
       /* for (int i = 1;i<=n ;i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j+" ");

            }
            System.out.println();
        }*/
        /*for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }*/
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=i ; j++) {
//               int sum =i+j;
//               if (sum%2==0){
//                   System.out.print(1);
//               }else{
//                    System.out.print(0);
//               }
//
//            }
//            System.out.println();
//        }

    }
}
