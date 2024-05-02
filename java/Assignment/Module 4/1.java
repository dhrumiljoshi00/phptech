import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class ConfigDemoServlet extends HttpServlet {

    private String servletName;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        servletName = config.getServletName();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Servlet Config Demo</title></head><body>");

        out.println("<h2>Servlet Name: " + servletName + "</h2>");

        Enumeration<String> initParameterNames = getServletConfig().getInitParameterNames();
        out.println("<h2>Init Parameters:</h2>");
        while (initParameterNames.hasMoreElements()) {
            String paramName = initParameterNames.nextElement();
            String paramValue = getServletConfig().getInitParameter(paramName);
            out.println("<p>" + paramName + " : " + paramValue + "</p>");
        }

        out.println("</body></html>");
    }
}



<servlet>
    <servlet-name>ConfigDemoServlet</servlet-name>
    <servlet-class>ConfigDemoServlet</servlet-class>
    <init-param>
        <param-name>param1</param-name>
        <param-value>value1</param-value>
    </init-param>
    <init-param>
        <param-name>param2</param-name>
        <param-value>value2</param-value>
    </init-param>
</servlet>

<servlet-mapping>
    <servlet-name>ConfigDemoServlet</servlet-name>
    <url-pattern>/configDemo</url-pattern>
</servlet-mapping>
