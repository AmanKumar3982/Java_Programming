//Q1 IV
class SynchronizedThreads {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        
        thread1.setPriority(Thread.MAX_PRIORITY);
        
        thread1.start();
        synchronized (thread1) { // Synchronize thread1
            thread2.start();
        }
    }
}
