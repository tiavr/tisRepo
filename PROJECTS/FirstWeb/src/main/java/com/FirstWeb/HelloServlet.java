package com.FirstWeb;

import beans.Coyote;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.servlet.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
        request.getRequestDispatcher( "/webapp/WEB-INF/index.jsp" ).forward( request, response );
    }

}
