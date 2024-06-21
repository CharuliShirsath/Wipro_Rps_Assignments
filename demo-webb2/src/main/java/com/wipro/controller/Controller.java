package com.wipro.controller;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		/*
		 * creates HttpSession object and return its reference, it will create cookie file, place jsessionid=XXXX
		 * in the cookie file and send it to client.
		 *
		 * request.getSession(): create a new session object if  not existing, if existing returns its reference
		 */
		HttpSession session = request.getSession();
		System.out.println(session.getId());
		
		session.setAttribute("email", "charulishirsath@gmail.com");
		
		request.getRequestDispatcher("servlet1").forward(request, response);
		
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
}
