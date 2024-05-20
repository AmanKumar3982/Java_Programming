class PriorityThread extends Thread {
    public void run() {
        System.out.println("Thread with priority " + getPriority() + " is running.");
    }
}
 class Q4 {
    public static void main(String[] args) {
        PriorityThread maxPriorityThread = new PriorityThread();
        PriorityThread minPriorityThread = new PriorityThread();
        PriorityThread normPriorityThread = new PriorityThread();
        
        maxPriorityThread.setPriority(Thread.MAX_PRIORITY);
        minPriorityThread.setPriority(Thread.MIN_PRIORITY);
        
        maxPriorityThread.start();
        minPriorityThread.start();
        normPriorityThread.start();
    }
}
