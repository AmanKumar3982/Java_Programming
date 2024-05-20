class CountThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                try {
                    Thread.sleep(5000); // Delay after printing 5
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
 
class Q2 {
    public static void main(String[] args) {
        CountThread thread = new CountThread();
        thread.start();
    }
}
