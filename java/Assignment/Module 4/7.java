<!DOCTYPE html>
<html>
<head>
    <title>Student Form</title>
    <!-- Bootstrap CSS link -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script>
        // Client-side validation using JavaScript
        function validateForm() {
            // You can implement your validation logic here
            return true; // Return true if validation succeeds, otherwise false
        }
    </script>
</head>
<body>
    <div class="container">
        <h2>Student Form</h2>
        <form action="AddStudentServlet" method="post" onsubmit="return validateForm()">
            <!-- Input fields for student information -->
            <!-- Use Bootstrap classes for styling -->
        </form>
    </div>
</body>
</html>


import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class AddStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Retrieve form parameters
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String gender = request.getParameter("gender");
        String password = request.getParameter("password");

        // Perform server-side validation (filter can be used here)

        // Insert the student record into the database
    }
}


import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.*;

public class ShowStudentsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Fetch all student records from the database

        // Forward to show.jsp with student data
    }
}


<!DOCTYPE html>
<html>
<head>
    <title>Show Students</title>
    <!-- Bootstrap CSS link -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <h2>Student Records</h2>
        <!-- Table to display student records -->
    </div>
</body>
</html>

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ValidationFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // Server-side validation logic
        chain.doFilter(request, response);
    }
}


