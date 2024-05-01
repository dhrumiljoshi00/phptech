abstract class Parent {
    abstract void message();
}

class FirstSubclass extends Parent {
    void message() {
        System.out.println("This is first subclass");
    }
}

class SecondSubclass extends Parent {
    void message() {
        System.out.println("This is second subclass");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects for each subclass
        FirstSubclass first = new FirstSubclass();
        SecondSubclass second = new SecondSubclass();

        // Calling the methods
        first.message();
        second.message();
    }
}
