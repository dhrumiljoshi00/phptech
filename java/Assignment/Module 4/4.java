import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DataServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        
        // Fetching data (You should replace this with your actual data fetching logic)
        List<String> dataList = fetchData(); 
        
        // Storing data in request attribute
        request.setAttribute("dataList", dataList);
        
        // Forwarding request to JSP
        RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
        dispatcher.forward(request, response);
    }

    private List<String> fetchData() {
        // Replace this with your actual data fetching logic
        List<String> dataList = new ArrayList<>();
        dataList.add("Data 1");
        dataList.add("Data 2");
        dataList.add("Data 3");
        return dataList;
    }
}

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Result Page</title>
</head>
<body>
    <h1>Data Fetched from Servlet</h1>
    <ul>
        <% 
        // Using expression language to iterate over dataList and print each item
        List<String> dataList = (List<String>) request.getAttribute("dataList");
        if (dataList != null) {
            for (String data : dataList) {
        %>
            <li><%= data %></li>
        <%
            }
        }
        %>
    </ul>
</body>
</html>

