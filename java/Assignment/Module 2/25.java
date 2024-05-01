class Member {
    // Data members
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of Member class
        Member member1 = new Member();
        
        // Setting data for the member
        member1.name = "John Doe";
        member1.age = 30;
        member1.phoneNumber = "123-456-7890";
        member1.address = "123 Main Street, City, Country";
        member1.salary = 50000.0;
        
        // Displaying member information
        System.out.println("Member 1 Information:");
        System.out.println("Name: " + member1.name);
        System.out.println("Age: " + member1.age);
        System.out.println("Phone Number: " + member1.phoneNumber);
        System.out.println("Address: " + member1.address);
        System.out.println("Salary: $" + member1.salary);
    }
}
