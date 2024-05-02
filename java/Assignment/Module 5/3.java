// Dependency interface
interface Dependency {
    void performAction();
}

// Concrete dependency class
class ConcreteDependency implements Dependency {
    @Override
    public void performAction() {
        System.out.println("Action performed by ConcreteDependency");
    }
}

// Dependent class using object-based dependency injection
class Dependent {
    private Dependency dependency;

    // Setter method for object-based dependency injection
    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }

    public void performOperation() {
        if (dependency != null) {
            dependency.performAction();
        } else {
            System.out.println("Dependency not set!");
        }
    }
}

<!-- Configuration file for Spring beans -->
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- Define a ConcreteDependency bean -->
    <bean id="concreteDependency" class="ConcreteDependency"/>

    <!-- Define a Dependent bean with inner bean dependency -->
    <bean id="dependent" class="Dependent">
        <!-- Inner bean definition -->
        <property name="dependency">
            <bean class="ConcreteDependency"/>
        </property>
    </bean>

</beans>
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Initialize Spring container with beans configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Retrieve Dependent bean from the container
        Dependent dependent = (Dependent) context.getBean("dependent");

        // Perform operation using Dependent bean
        dependent.performOperation();
    }
}
