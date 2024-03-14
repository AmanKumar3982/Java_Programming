import java.util.Scanner;

public class a5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the size of an array: ");
        int a = s.nextInt();
        int arr[]=new int[a];
        System.out.println(":insert the element in array: ");
        for (int i = 0; i < a; i++) {
            System.out.print("insert the element at "+i+"=");
            arr[i]=s.nextInt();    
        }
        System.out.print("element of an array are: ");
        for (int i = 0; i < a; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
