class MyThread extends Thread {
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
        MyThread myThread = new MyThread(); // Creating an instance of MyThread
        myThread.start(); // Starting the thread
    }
}
