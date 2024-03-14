import java.util.Scanner;

public class q8 {
    double a;
    double b;
    
    public q8(){
        // a = 12;
        // b = 6;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextDouble();
        System.out.print("Enter second number: ");
        b = sc.nextDouble();
    }

    public double add(){
        double sum = a+b;
        return sum;
    }
    public double subtract(){
        double sub = a-b;
        return sub;
    }
    public double multiplication(){
        double mult = a*b;
        return mult;
    }
    public double division(){
        double div = a/b;
        return div;
    }
    public double reminder(){
        double remin = a%b;
        return remin;
    }
    public static void main(String[] args) {
        q8 object = new q8();
        System.out.println("Addition : " + object.add());
        System.out.println("Subtraction : " + object.subtract());
        System.out.println("Multiplication : " + object.multiplication());
        System.out.println("division : " + object.division());
        System.out.println("reminder: "+ object.reminder());
    }   
}
