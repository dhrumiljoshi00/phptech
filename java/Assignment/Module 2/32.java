abstract class Shape {
    abstract double RectangleArea(double length, double breadth);
    abstract double SquareArea(double side);
    abstract double CircleArea(double radius);
}

class Area extends Shape {
    @Override
    double RectangleArea(double length, double breadth) {
        return length * breadth;
    }

    @Override
    double SquareArea(double side) {
        return side * side;
    }

    @Override
    double CircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Area area = new Area();

        double rectangleArea = area.RectangleArea(5, 4);
        double squareArea = area.SquareArea(5);
        double circleArea = area.CircleArea(5);

        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Square: " + squareArea);
        System.out.println("Area of Circle: " + circleArea);
    }
}
