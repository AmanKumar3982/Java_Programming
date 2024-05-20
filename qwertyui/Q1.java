class A{
    public void am(){
        System.out.print("kes");
    }
    public void an(){
        System.out.print("hav ");
    }
}
class B extends A{
    public void kum(){
        System.out.print("abh");
    }
    public void ar(){
        System.out.print("ishek");
    }
}
public class Q1{
    public static void main(String[] args) {
        A a =new A();
        B b = new B();

        b.am();
        b.an();
        b.kum();
        b.ar();
        
    }
    
}
