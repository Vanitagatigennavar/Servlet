package com.xworkz.web.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/water")

public class MoonServlet extends HttpServlet {

	public MoonServlet() {
	System.out.println("default constructor created");	
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("moonservlet is created");
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.append("<html><head><body bgcolor='green';><h1> GREEN COLOR DISPLAYED</h1></body></></head></html>");
		PrintWriter writer1 = resp.getWriter();
		}
}
