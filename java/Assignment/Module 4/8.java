User.java:
package model;

public class User {
    private int uid;
    private String fname;
    private String lname;
    private String email;
    private String mobile;
    // Getters and setters
}


Message.java:

package model;

public class Message {
    private int mid;
    private int uid;
    private String from;
    private String to;
    private String msg;
    // Getters and setters
}


UserDAO.java:

package dao;

import model.User;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    public boolean addUser(User user) {
        // Implement method to add user to the database
    }

    public boolean updateUser(User user) {
        // Implement method to update user in the database
    }

    public User getUserByEmail(String email) {
        // Implement method to retrieve user by email from the database
    }

    // Other CRUD methods as needed
}

RegistrationServlet.java:

package controller;

import dao.UserDAO;
import model.User;
import util.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegistrationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Handle user registration
    }
}

LoginServlet.java:
package controller;

import dao.UserDAO;
import model.User;
import util.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Handle user login
    }
}

ProfileEditServlet.java:

package controller;

import dao.UserDAO;
import model.User;
import util.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProfileEditServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Handle user profile editing
    }
}

SendMessageServlet.java:
package controller;

import dao.MessageDAO;
import model.Message;
import util.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SendMessageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Handle sending a message to another user
    }
}
ViewMessagesServlet.java:

package controller;

import dao.MessageDAO;
import model.Message;
import util.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ViewMessagesServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve and display messages sent to the logged-in user
    }
}

DBUtil.java:


package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/message_passing_system";
    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}


web.xml:

<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xmlns="http://xmlns.jcp.org/xml/ns/javaee"
         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
         id="WebApp_ID" version="4.0">
    <display-name>MessagePassingSystem</display-name>

    <servlet>
        <servlet-name>RegistrationServlet</servlet-name>
        <servlet-class>controller.RegistrationServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>RegistrationServlet</servlet-name>
        <url-pattern>/register</url-pattern>
    </servlet-mapping>

    <!-- Add mappings for other servlets -->

</web-app>

