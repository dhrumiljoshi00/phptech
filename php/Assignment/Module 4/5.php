The Scope Resolution Operator is primarily used in object-oriented programming in PHP to access static properties and methods of a class,
 as well as to call parent class methods within child classes. 
 
 class MyClass {
    public static $staticProperty = 'Hello, I am a static property';

    public static function staticMethod() {
        echo "Hello, I am a static method";
    }
}

// Accessing static property using Scope Resolution Operator
echo MyClass::$staticProperty; // Output: Hello, I am a static property
echo "<br>";

// Calling static method using Scope Resolution Operator
MyClass::staticMethod(); // Output: Hello, I am a static method
echo "<br>";


class Math {
    const PI = 3.14;
}

// Accessing constant using Scope Resolution Operator
echo Math::PI; // Output: 3.14

class ParentClass {
    public static function sayHello() {
        echo "Hello from ParentClass";
    }
}

class ChildClass extends ParentClass {
    public static function sayHello() {
        parent::sayHello(); // Calling parent class method
        echo ", but I am overridden in ChildClass";
    }
}

// Calling overridden method using Scope Resolution Operator
ChildClass::sayHello(); // Output: Hello from ParentClass, but I am overridden in ChildClass
