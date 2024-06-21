package com.wipro.filter;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;
@WebFilter(filterName= "/filter1", urlPatterns="/controller")
public class Validatefilter extends HttpFilter implements Filter {
     
  
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("request object entered into ValidateFilter");
		// pass the request along the filter chain
		chain.doFilter(request, response);
		System.out.println("response object exiting ValidateFilter");
	}
	
}
