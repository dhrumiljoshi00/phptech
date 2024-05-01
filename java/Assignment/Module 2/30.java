abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    private double subject1, subject2, subject3;

    A(double s1, double s2, double s3) {
        subject1 = s1;
        subject2 = s2;
        subject3 = s3;
    }

    double getPercentage() {
        return (subject1 + subject2 + subject3) / 3.0;
    }
}

class B extends Marks {
    private double subject1, subject2, subject3, subject4;

    B(double s1, double s2, double s3, double s4) {
        subject1 = s1;
        subject2 = s2;
        subject3 = s3;
        subject4 = s4;
    }

    double getPercentage() {
        return (subject1 + subject2 + subject3 + subject4) / 4.0;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects for each class
        A studentA = new A(85, 90, 95);
        B studentB = new B(75, 80, 85, 90);

        // Printing the percentage of marks for both students
        System.out.println("Percentage of marks for Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of marks for Student B: " + studentB.getPercentage() + "%");
    }
}
