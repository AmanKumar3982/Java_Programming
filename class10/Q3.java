class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}

class Q3 {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();
        System.out.println("These are the even no's:");
        evenThread.start();
        try {
            evenThread.join(); // Wait for evenThread to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("These are the odd no's:");
        oddThread.start();
    }
}
