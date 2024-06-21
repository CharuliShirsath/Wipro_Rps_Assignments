package com.wipro.filter;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebFilter(filterName="/filter2", urlPatterns="/controller")
public class AuthenticateFilter extends HttpFilter implements Filter {
	
	public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Entered Filter2");
		chain.doFilter(request, response);
		System.out.println("Exiting Filter2");
	}
	
}
