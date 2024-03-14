import java.util.Scanner;

public class a4{
    public static void main(String[] args) {
        int arr[]={45,58,75,66,88,41};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be searched: ");
        int a = sc.nextInt();
        sc.close();
        for (int i = 0; i < 6; i++) {
            if(a==arr[i]){
                System.out.println("number is found at index: "+i);

            }  
        }
        


    }
}