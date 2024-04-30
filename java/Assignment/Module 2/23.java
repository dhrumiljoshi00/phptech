class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void printArea() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    public void printPerimeter() {
        System.out.println("Perimeter of Rectangle: " + 2 * (length + breadth));
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        rectangle.printArea();
        rectangle.printPerimeter();

        Square square = new Square(7);
        square.printArea();
        square.printPerimeter();
    }
}
