import java.util.*;

class Reader {
    private int readerId;
    private String email;
    private String firstName;
    private String lastName;
    private Set<Subscription> subscriptions;

    public Reader(int readerId, String email, String firstName, String lastName) {
        this.readerId = readerId;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.subscriptions = new HashSet<>();
    }

    // Getters and setters

    public int getReaderId() {
        return readerId;
    }

    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(Set<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    // Other methods for CRUD operations

    public void addSubscription(Subscription subscription) {
        subscriptions.add(subscription);
        subscription.getReaders().add(this);
    }

    public void removeSubscription(Subscription subscription) {
        subscriptions.remove(subscription);
        subscription.getReaders().remove(this);
    }

    // Other CRUD operations can be implemented similarly
}

class Subscription {
    private int subscriptionId;
    private String subscriptionName;
    private Set<Reader> readers;

    public Subscription(int subscriptionId, String subscriptionName) {
        this.subscriptionId = subscriptionId;
        this.subscriptionName = subscriptionName;
        this.readers = new HashSet<>();
    }

    // Getters and setters

    public int getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getSubscriptionName() {
        return subscriptionName;
    }

    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    public Set<Reader> getReaders() {
        return readers;
    }

    public void setReaders(Set<Reader> readers) {
        this.readers = readers;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating readers
        Reader reader1 = new Reader(1, "reader1@example.com", "John", "Doe");
        Reader reader2 = new Reader(2, "reader2@example.com", "Jane", "Smith");

        // Creating subscriptions
        Subscription subscription1 = new Subscription(101, "Subscription 1");
        Subscription subscription2 = new Subscription(102, "Subscription 2");

        // Establishing relationships
        reader1.addSubscription(subscription1);
        reader1.addSubscription(subscription2);
        reader2.addSubscription(subscription1);

        // Performing CRUD operations
        // For example, to remove a subscription from a reader
        reader1.removeSubscription(subscription2);
    }
}
