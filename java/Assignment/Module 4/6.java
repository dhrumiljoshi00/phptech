<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Form Validation</title>
</head>
<body>
    <h2>Form Validation</h2>
    <form action="ValidationServlet" method="post">
        Name: <input type="text" name="name"><br>
        Email: <input type="email" name="email"><br>
        Age: <input type="number" name="age"><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ValidationServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        
        // Retrieve form parameters
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String ageString = request.getParameter("age");
        
        // Perform server-side validation
        String errorMessage = "";
        if (name == null || name.trim().isEmpty()) {
            errorMessage += "Name is required.<br>";
        }
        if (email == null || email.trim().isEmpty()) {
            errorMessage += "Email is required.<br>";
        } else if (!email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            errorMessage += "Invalid email format.<br>";
        }
        int age = 0;
        try {
            age = Integer.parseInt(ageString);
            if (age <= 0) {
                errorMessage += "Age must be a positive number.<br>";
            }
        } catch (NumberFormatException e) {
            errorMessage += "Age must be a number.<br>";
        }
        
        // If there are validation errors, forward back to the form with error messages
        if (!errorMessage.isEmpty()) {
            request.setAttribute("errorMessage", errorMessage);
            RequestDispatcher dispatcher = request.getRequestDispatcher("form.jsp");
            dispatcher.forward(request, response);
        } else {
            // If validation succeeds, forward to a success page or perform further actions
            // For simplicity, let's just print the submitted data
            PrintWriter out = response.getWriter();
            out.println("<h2>Form Submitted Successfully</h2>");
            out.println("<p>Name: " + name + "</p>");
            out.println("<p>Email: " + email + "</p>");
            out.println("<p>Age: " + age + "</p>");
        }
    }
}

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Form Validation</title>
</head>
<body>
    <h2>Form Validation</h2>
    <form action="ValidationServlet" method="post">
        Name: <input type="text" name="name"><br>
        Email: <input type="email" name="email"><br>
        Age: <input type="number" name="age"><br>
        <input type="submit" value="Submit">
    </form>
    <c:if test="${not empty errorMessage}">
        <div style="color: red;">
            ${errorMessage}
        </div>
    </c:if>
</body>
</html>

