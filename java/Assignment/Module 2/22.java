class Member {

    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

   
    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

   
    public void printSalary() {
        System.out.println("Salary of " + name + ": " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
       
        Member member1 = new Member("John Doe", 30, "1234567890", "123 Main St, City", 50000.0);

       
        member1.printSalary();
    }
}
