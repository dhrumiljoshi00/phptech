public class AreaCalculator {
   
    public void printArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    
    public void printArea(int side) {
        int area = side * side;
        System.out.println("Area of Square: " + area);
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

      
        calculator.printArea(5, 10);

        calculator.printArea(7);
    }
}
