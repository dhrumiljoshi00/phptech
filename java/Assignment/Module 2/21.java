class Parent {
    public void printMessage() {
        System.out.println("This is a parent class");
    }
}

class Child extends Parent {
    public void printMessage() {
        System.out.println("This is a child class");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent parentObj = new Parent();
        Child childObj = new Child();

       
        parentObj.printMessage();

      
        childObj.printMessage();

      
        childObj.printMessage(); 
}
