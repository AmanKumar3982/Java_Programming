//Q1 V
class Q1_5 {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        
        thread1.start();
        if (thread1.isAlive()) {
            System.out.println("Thread1 is alive.");
        } else {
            System.out.println("Thread1 is not alive.");
        }
    }
}

