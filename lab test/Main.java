import java.util.*;
class Shape{
    public void Methord_find_area(int a , int b){
        int c = a*b;
        System.out.println(c);
    }
}
class Rectangle extends Shape{
    int a;
    int b;
    public void Rectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        a = sc.nextInt();
        System.out.print("Enter Breadth: ");
        b = sc.nextInt();
        Shape S = new Shape();
        System.out.print("area of rectangle = ");
        S.Methord_find_area(a, b);
    }
}
class Square extends Shape{
    int a;
    public void Square(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        a = sc.nextInt();
        Shape S = new Shape();
        System.out.print("area of Square = ");
        S.Methord_find_area(a, a);
    }
}
public class main {
    public static void main(String[] args) {
        Rectangle R = new Rectangle();
        Square S = new Square();
        R.Rectangle();
        System.out.println();
        S.Square();
    }
}  
