import java.util.Scanner;

//find the sum of n natural number
public class q1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a 'n'= ");
        int n = sc.nextInt();


        int sum = 0;
        for(int i = 1 ;i<=n;i++){
            sum=sum + i;

        }
        System.out.println(sum);

        //table of n number
        // for(int i=1;i<=20;i++){
        //  System.out.println(n+"*"+i+"="+n*i);
        // }

        //table of n number using do while.


//        int i = 0;
//
//        System.out.println("table of "+n+":");
//        do{
//
//            System.out.println(n+"*"+i+"="+n*i);
//            i++;
//        }while(i<=10);


    }
}
