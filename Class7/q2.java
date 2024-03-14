package Class7;

interface A {
    public void as();
}

interface B extends A {
    @Override
    public void as();
}

class C implements B {
    public void as() {
        System.out.println("This is an overridden method in interface A to B");
    }
}

public class q2 {
    public static void main(String[] args) {
        C obj = new C();
        obj.as();
    }
}
