import java.util.Scanner;

public class recurssion_fibo {
    public static void fibo(int a, int b, int n){
        if(n == 0){
            return;
        }
        else{
            System.out.print(a + " ");
            fibo(b, a+b, n-1);
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        fibo(0,1, sc.nextInt());
    }
}
