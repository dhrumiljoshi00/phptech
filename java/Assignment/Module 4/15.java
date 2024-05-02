import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cartId;
    private double total;
    private String name;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
    private Set<Item> items = new HashSet<>();

    // Constructors, getters, and setters
}

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String itemId;
    private double itemTotal;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    // Constructors, getters, and setters
}

public class Main {
    public static void main(String[] args) {
        // Create EntityManagerFactory
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu");

        // Create EntityManager
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // CRUD operations
        entityManager.getTransaction().begin();

        // Create
        Cart cart = new Cart();
        cart.setName("Shopping Cart");

        Item item1 = new Item();
        item1.setItemId("ABC123");
        item1.setItemTotal(20.0);
        item1.setQuantity(2);
        item1.setCart(cart);

        Item item2 = new Item();
        item2.setItemId("XYZ789");
        item2.setItemTotal(15.0);
        item2.setQuantity(1);
        item2.setCart(cart);

        cart.getItems().add(item1);
        cart.getItems().add(item2);

        entityManager.persist(cart);

        // Read
        Cart foundCart = entityManager.find(Cart.class, cart.getCartId());
        System.out.println("Found cart: " + foundCart.getName());
        System.out.println("Items in cart:");
        for (Item item : foundCart.getItems()) {
            System.out.println("Item ID: " + item.getItemId() + ", Quantity: " + item.getQuantity());
        }

        // Update
        foundCart.setName("Updated Shopping Cart");
        entityManager.merge(foundCart);

        // Delete
        entityManager.remove(foundCart);

        entityManager.getTransaction().commit();

        // Close EntityManager and EntityManagerFactory
        entityManager.close();
        entityManagerFactory.close();
    }
}
