import java.lang.Exception;
public class Q1_1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0; 
        try {
            int c = a / b; 
            System.out.println("The value of c is = " + c);
        } catch (Exception e) {
            System.out.println("Invalid operation: " + e);
        }finally{
            System.out.println("this ia finally block");
        }
    }
}
