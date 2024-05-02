import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class ContextDemoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Servlet Context Demo</title></head><body>");

        ServletContext context = getServletContext();

        out.println("<h2>Context Parameters:</h2>");
        Enumeration<String> contextParamNames = context.getInitParameterNames();
        while (contextParamNames.hasMoreElements()) {
            String paramName = contextParamNames.nextElement();
            String paramValue = context.getInitParameter(paramName);
            out.println("<p>" + paramName + " : " + paramValue + "</p>");
        }

        out.println("</body></html>");
    }
}

<context-param>
    <param-name>param1</param-name>
    <param-value>value1</param-value>
</context-param>
<context-param>
    <param-name>param2</param-name>
    <param-value>value2</param-value>
</context-param>
