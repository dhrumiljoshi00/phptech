// Define first trait
trait Greeting {
    public function sayHello() {
        echo "Hello, ";
    }
}

// Define second trait
trait Name {
    public $name = "John";

    public function getName() {
        return $this->name;
    }
}

// Define third trait
trait Age {
    public $age = 30;

    public function getAge() {
        return $this->age;
    }
}

// Define class using multiple traits
class Person {
    use Greeting, Name, Age;
}

// Create an instance of the Person class
$person = new Person();

// Use methods from traits
$person->sayHello(); // Output: Hello,
echo $person->getName(); // Output: John
echo $person->getAge(); // Output: 30
