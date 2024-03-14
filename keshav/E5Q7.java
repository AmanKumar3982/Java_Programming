class A {
    A(int a, int b){
        System.out.println("Constructor involked from sub-class : " + (a+b));
    }
}

class B extends A{
    B(int x, int y){
        super(x, y);
        System.out.println("Parent Class Constructor Involked.");
    }
}

public class E5Q7{
    public static void main(String[] args) {
        B child = new B(15, 20);
    }
}