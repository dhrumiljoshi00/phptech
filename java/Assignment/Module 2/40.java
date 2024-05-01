// Custom exception class for age not within range
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// Custom exception class for invalid name
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

// Student class
class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    // Constructor with parameter validation
    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within the range of 15 and 21.");
        }
        if (!name.matches("[a-zA-Z ]+")) {
            throw new NameNotValidException("Name contains invalid characters.");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Getters
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        try {
            // Creating a valid student
            Student validStudent = new Student(101, "John Doe", 18, "Computer Science");
            System.out.println("Valid Student Details:");
            System.out.println("Roll No: " + validStudent.getRollNo());
            System.out.println("Name: " + validStudent.getName());
            System.out.println("Age: " + validStudent.getAge());
            System.out.println("Course: " + validStudent.getCourse());

            // Creating an invalid student (age not within range)
            Student invalidAgeStudent = new Student(102, "Jane Smith", 14, "Physics");

            // Creating an invalid student (name contains numbers)
            Student invalidNameStudent = new Student(103, "Alice123", 20, "Mathematics");
        } catch (AgeNotWithinRangeException e) {
            System.ou
