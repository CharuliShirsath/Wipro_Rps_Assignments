
package com.wipro.controller;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("Entering  Servlet1...");
		System.out.println(response.getStatus());
		System.out.println(response.getHeader("location"));
		
		//back to client/browser with response headers, status=302, and location="servlet2"
//		response.sendRedirect("servlet2");
		
//		RequestDispatcher  requestDispatcher = request.getRequestDispatcher("servlet2");
//		requestDispatcher.include(request, response);
		
//		request.getRequestDispatcher("servlet2").include(request, response);
//		request.getRequestDispatcher("servlet2").forward(request, response);
		
		
//		this.getServletContext().getRequestDispatcher("/servlet2").include(request, response);
		this.getServletContext().getRequestDispatcher("/servlet2").forward(request, response);
		
		System.out.println(response.getStatus());
		System.out.println(response.getHeader("location"));
		out.println("Leaving Servelt1..");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
}
