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

    // Setter for dependency injection
    public void setDependency(Dependency dependency) {
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
        // Instantiate objects
        Dependency dependency = new Dependency(42);
        Dependent dependent = new Dependent();

        // Inject dependency
        dependent.setDependency(dependency);

        // Perform operation
        dependent.performOperation();
    }
}
