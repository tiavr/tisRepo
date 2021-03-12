package com.WebPro;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");

        request.setAttribute("test", message);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/src/main/webapp/WEB-INF/index.jsp");

        dispatcher.forward(request, response);

        //this.getServletContext().getRequestDispatcher( "/WEB-INF/test.jsp" ).forward( request, response );
    }

    public void destroy() {
    }
}