import java.util.Scanner;

// this is question 1
public class Main {
//    public Main(){
//
//    }Main
    // here we created the function for adding the two numbers
    public static  int calculate_sum (int a, int b){
        int sum = a+b;// operation
        return sum;// return valaue if here the type is void we cancan write here only retun,
    }
    public static void main(String[] args) {// here it is a main class
        int a;// here we have done the inputs
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = sc.nextInt();
        System.out.print("Enter the second number: ");
        b = sc.nextInt();

        int sum = calculate_sum(a,b);// here wec all the function in the main class
        System.out.println("sum="+sum);//here we have printed it
    }
}