import java.util.Scanner;

public class gtrsmr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        System.out.print("Enter first no 'a':");
        int a = sc .nextInt();
        System.out.print("\nEnter first no 'b':");
        int b = sc. nextInt();

        if(a==b){
            System.out.println("both the numbers are equal.");
        }else if(a>b){
            System.out.println("a is greater then b .");
        }
        else{
            System.out.println("b is greater then a .");
        }
    }
}
