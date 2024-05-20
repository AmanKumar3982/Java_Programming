//Q! I
class Thread1 extends Thread {
    public void run() {
        System.out.print("Hello ");
    }
}
//Q1 II
class Thread2 extends Thread {
    public void run() {
        System.out.print("World");
    }
}
//Q1 III
public class q1 {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        
        thread1.setPriority(Thread.MAX_PRIORITY); 
        thread1.start(); 
        thread2.start(); 
    }
}
