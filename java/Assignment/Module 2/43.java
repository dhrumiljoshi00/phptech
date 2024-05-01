class MyRunnable implements Runnable {
    private String name;
    
    public MyRunnable(String name) {
        this.name = name;
    }

    public void run() {
        // Code to be executed in the thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + name + " is running: " + i);
            try {
                Thread.sleep(2000); // Sleep for 2000 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable1 = new MyRunnable("Thread 1"); // Creating instance for Thread 1
        MyRunnable myRunnable2 = new MyRunnable("Thread 2"); // Creating instance for Thread 2
        
        Thread thread1 = new Thread(myRunnable1); // Creating a new Thread with MyRunnable instance
        Thread thread2 = new Thread(myRunnable2); // Creating a new Thread with MyRunnable instance
        
        thread1.start(); // Starting thread 1
        thread2.start(); // Starting thread 2
    }
}
