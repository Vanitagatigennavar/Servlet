package com.xworkz.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 2,urlPatterns = "/van")
public class Yellow extends HttpServlet{

	public Yellow() {
		System.out.println("Default Constructor Created");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Yellow Service Created");
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		writer.append("<html><head><body bgcolor='Yellow';><h1 style ='color:black;'>"+" Yellow Colour displyed")
		.append("</h1></body></head></html>");
	
		
	}

}
