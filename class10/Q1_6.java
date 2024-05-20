class Q1_6 {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        
        
        try {
            thread1.join(); // Wait for thread1 to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        thread1.run(); // Call thread1 after completion of its lifecycle
    }
}
