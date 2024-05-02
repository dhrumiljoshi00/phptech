<!-- students.xml -->

<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- Define Student class -->
    <bean id="student1" class="Student">
        <property name="id" value="1"/>
        <property name="fname" value="John"/>
        <property name="lname" value="Doe"/>
        <property name="email" value="john.doe@example.com"/>
        <property name="mobile" value="1234567890"/>
    </bean>

    <bean id="student2" class="Student">
        <property name="id" value="2"/>
        <property name="fname" value="Alice"/>
        <property name="lname" value="Smith"/>
        <property name="email" value="alice.smith@example.com"/>
        <property name="mobile" value="9876543210"/>
    </bean>

    <bean id="student3" class="Student">
        <property name="id" value="3"/>
        <property name="fname" value="Bob"/>
        <property name="lname" value="Johnson"/>
        <property name="email" value="bob.johnson@example.com"/>
        <property name="mobile" value="2345678901"/>
    </bean>

    <bean id="student4" class="Student">
        <property name="id" value="4"/>
        <property name="fname" value="Emily"/>
        <property name="lname" value="Brown"/>
        <property name="email" value="emily.brown@example.com"/>
        <property name="mobile" value="4567890123"/>
    </bean>

    <bean id="student5" class="Student">
        <property name="id" value="5"/>
        <property name="fname" value="David"/>
        <property name="lname" value="Miller"/>
        <property name="email" value="david.miller@example.com"/>
        <property name="mobile" value="8901234567"/>
    </bean>

    <!-- Define a List to collect Student objects -->
    <bean id="studentList" class="java.util.ArrayList">
        <constructor-arg>
            <list>
                <ref bean="student1"/>
                <ref bean="student2"/>
                <ref bean="student3"/>
                <ref bean="student4"/>
                <ref bean="student5"/>
            </list>
        </constructor-arg>
    </bean>

</beans>
