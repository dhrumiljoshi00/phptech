User.java:
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
    private String password;
    private String gender;

    // Getters and setters
}

hibernate.cfg.xml:
<?xml version='1.0' encoding='utf-8'?>
<!DOCTYPE hibernate-configuration PUBLIC
        "-//Hibernate/Hibernate Configuration DTD 3.0//EN"
        "http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd">
<hibernate-configuration>
    <session-factory>
        <!-- Database connection settings -->
        <property name="connection.driver_class">com.mysql.jdbc.Driver</property>
        <property name="connection.url">jdbc:mysql://localhost:3306/your_database</property>
        <property name="connection.username">your_username</property>
        <property name="connection.password">your_password</property>

        <!-- Mapping files -->
        <mapping resource="User.hbm.xml"/>
    </session-factory>
</hibernate-configuration>

User.hbm.xml:
<!DOCTYPE hibernate-mapping PUBLIC
        "-//Hibernate/Hibernate Mapping DTD 3.0//EN"
        "http://hibernate.sourceforge.net/hibernate-mapping-3.0.dtd">
<hibernate-mapping>
    <class name="User" table="user">
        <id name="id" type="int">
            <column name="id" />
            <generator class="identity" />
        </id>
        <property name="firstName" type="string">
            <column name="first_name" />
        </property>
        <property name="lastName" type="string">
            <column name="last_name" />
        </property>
        <property name="email" type="string">
            <column name="email" />
        </property>
        <property name="mobile" type="string">
            <column name="mobile" />
        </property>
        <property name="password" type="string">
            <column name="password" />
        </property>
        <property name="gender" type="string">
            <column name="gender" />
        </property>
    </class>
</hibernate-mapping>

