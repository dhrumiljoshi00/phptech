<!DOCTYPE html>
<html>
<head>
    <title>Student Information Form</title>
</head>
<body>
    <h2>Student Information Form</h2>
    <form action="StudentServlet" method="post">
        <label>First Name: </label><input type="text" name="fname"><br>
        <label>Last Name: </label><input type="text" name="lname"><br>
        <label>Email: </label><input type="email" name="email"><br>
        <label>Mobile: </label><input type="text" name="mobile"><br>
        <label>Gender: </label>
        <select name="gender">
            <option value="Male">Male</option>
            <option value="Female">Female</option>
        </select><br>
        <label>Password: </label><input type="password" name="password"><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Fetching data from the form
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String gender = request.getParameter("gender");
        String password = request.getParameter("password");

        // Printing the data to the console
        System.out.println("First Name: " + fname);
        System.out.println("Last Name: " + lname);
        System.out.println("Email: " + email);
        System.out.println("Mobile: " + mobile);
        System.out.println("Gender: " + gender);
        System.out.println("Password: " + password);

        // Forwarding to a confirmation page
        response.sendRedirect("confirmation.jsp");
    }
}

<!DOCTYPE html>
<html>
<head>
    <title>Confirmation</title>
</head>
<body>
    <h2>Thank you for submitting the form!</h2>
</body>
</html>

<servlet>
    <servlet-name>StudentServlet</servlet-name>
    <servlet-class>StudentServlet</servlet-class>
</servlet>
<servlet-mapping>
    <servlet-name>StudentServlet</servlet-name>
    <url-pattern>/StudentServlet</url-pattern>
</servlet-mapping>
