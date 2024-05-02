import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private String studentName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    // Constructors, getters, and setters
}

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;
    private String street;
    private String city;
    private String state;
    private String zipCode;

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
        Address address = new Address();
        address.setStreet("123 Main St");
        address.setCity("City");
        address.setState("State");
        address.setZipCode("12345");

        Student student = new Student();
        student.setStudentName("John Doe");
        student.setAddress(address);

        entityManager.persist(student);

        // Read
        Student foundStudent = entityManager.find(Student.class, student.getStudentId());
        System.out.println("Found student: " + foundStudent.getStudentName());
        System.out.println("Student's address: " + foundStudent.getAddress().getStreet() + ", " +
                foundStudent.getAddress().getCity() + ", " +
                foundStudent.getAddress().getState() + ", " +
                foundStudent.getAddress().getZipCode());

        // Update
        foundStudent.getStudentName();
        foundStudent.getStudentName().concat(" Updated");
        entityManager.merge(foundStudent);

        // Delete
        entityManager.remove(foundStudent);

        entityManager.getTransaction().commit();

        // Close EntityManager and EntityManagerFactory
        entityManager.close();
        entityManagerFactory.close();
    }
}
