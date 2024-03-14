import java.util.*;

public class i4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number (n) : ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int temp;
        for (int i = 0; i < n; i++) {
            System.out.print(a+" ");
            temp = a+b;
            a=b;
            b=temp;
        }
    }
}
