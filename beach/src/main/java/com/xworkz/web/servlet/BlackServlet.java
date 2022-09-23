package com.xworkz.web.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 15,urlPatterns = "/v")
public class BlackServlet extends HttpServlet {

	public BlackServlet() {
		System.out.println("vanita");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Black created");
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		writer.append("<html><head><body bgcolor='black'>"
				+ "<h1 style='color:white;'>"+"white colour displyed")
		.append("</h1></body></head></html>");
	}
}
