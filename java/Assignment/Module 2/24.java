
class Parent {
  
    void parentMethod() {
        System.out.println("This is a parent class");
    }
}

class Child extends Parent {
   
    void childMethod() {
        System.out.println("This is child class");
    }
}

public class Main {
    public static void main(String[] args) {
        
        Parent parentObj = new Parent();
        
        parentObj.parentMethod();

        Child childObj = new Child();
        
        childObj.childMethod();

       
        childObj.parentMethod();
    }
}
