package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 2126,urlPatterns = "/")
public class CakeServlet extends HttpServlet  {

	public CakeServlet() {
		System.out.println("Default constructor created");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service is created");
		resp.setContentType("txt/html");
		PrintWriter writer = resp.getWriter();
		writer.append("<html><body bgcolor='Pink';><h1>Cake Color is Pink</h1>").append("</html></body>");
		
	}
	

}
