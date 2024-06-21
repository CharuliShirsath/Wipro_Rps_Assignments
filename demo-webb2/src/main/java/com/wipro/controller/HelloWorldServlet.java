package com.wipro.controller;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * https://localhost:8081/demo-webb2/hello
 * Servlet implementation class HelloWorldServlet
 * Since default HTTP method is GET, control enters into doGet() method
 * HttpServlet --> GenericServlet-->servlet
 * Servlet is an interface, GenericServlet is a class that implements Servlet,
 * httpServlet is class that extends GenericServlet.
 * 
 * GenericServlet can handle any type of protocol (Http, ftp, SHTP, etc) whereas HttpServlet can handle only Http protocol. 
 * Since most of the web applications are http-base, we create our own servlet that extend HttpServlet
 */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// dynamically generate the content
		PrintWriter out = response.getWriter();
		//dynamically generate web page
		out.println("<html><body><h1><font color='red'> Welcome to My Dynamic WebPAge </font></h1></body></html>");
		
		ServletConfig config = this.getServletConfig();
		out.println(config.getInitParameter("user"));
		out.println(config.getInitParameter("job"));
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
