// Dependency class
class Dependency {
    private int value;

    public Dependency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

// Dependent class
class Dependent {
    private Dependency dependency;

    // Constructor for dependency injection
    public Dependent(Dependency dependency) {
        this.dependency = dependency;
    }

    // Method using the dependency
    public void performOperation() {
        if (dependency != null) {
            System.out.println("Performing operation with dependency value: " + dependency.getValue());
        } else {
            System.out.println("Dependency not set!");
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Instantiate dependency
        Dependency dependency = new Dependency(42);

        // Inject dependency via constructor
        Dependent dependent = new Dependent(dependency);

        // Perform operation
        dependent.performOperation();
    }
}
