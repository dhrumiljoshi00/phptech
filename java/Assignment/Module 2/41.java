class MyRunnable implements Runnable {
    public void run() {
        // Code to be executed in the thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread is running: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable(); // Creating an instance of MyRunnable
        Thread thread = new Thread(myRunnable); // Creating a new Thread with MyRunnable instance
        thread.start(); // Starting the thread
    }
}
