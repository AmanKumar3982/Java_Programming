package Class7;

interface A {
    public void as();
}

interface B extends A {
    public void vs();
}

class C implements B {
    public void as() {
        System.out.println("This is a method of interface A");
    }

    public void vs() {
        System.out.println("This is a method of interface B");
    }
}

public class q1 {
    public static void main(String[] args) {
        C obj = new C();
        obj.as();
        obj.vs();
    }
}
