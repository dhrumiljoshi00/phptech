LoginServlet.java:
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Check login credentials in the database using Hibernate
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("FROM User WHERE email = :email AND password = :password");
        query.setParameter("email", email);
        query.setParameter("password", password);
        User user = (User) query.uniqueResult();
        session.close();

        if (user != null) {
            // If login is successful, forward to the home page with user details
            request.setAttribute("user", user);
            RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
            dispatcher.forward(request, response);
        } else {
            // If login fails, redirect back to the login page with an error message
            response.sendRedirect("login.jsp?error=1");
        }
    }
}

login.jsp

<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h2>Login</h2>
    <% if (request.getParameter("error") != null) { %>
        <p style="color: red;">Invalid email or password!</p>
    <% } %>
    <form action="loginServlet" method="post">
        <label for="email">Email:</label><br>
        <input type="email" id="email" name="email" required><br><br>
        <label for="password">Password:</label><br>
        <input type="password" id="password" name="password" required><br><br>
        <input type="submit" value="Login">
    </form>
</body>
</html>

home.jsp: 
<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
</head>
<body>
    <h2>Welcome, <%= request.getAttribute("user").getFirstName() %></h2>
    <p>Email: <%= request.getAttribute("user").getEmail() %></p>
    <p>Mobile: <%= request.getAttribute("user").getMobile() %></p>
    <p>Gender: <%= request.getAttribute("user").getGender() %></p>
</body>
</html>





