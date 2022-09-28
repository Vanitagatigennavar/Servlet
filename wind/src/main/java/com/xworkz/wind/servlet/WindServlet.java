package com.xworkz.wind.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2126, urlPatterns = "/switch")
public class WindServlet extends HttpServlet {

	public WindServlet() {
		System.out.println("DEFAULT CONSTRUCTOR CREATED");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service created");
		String type = req.getParameter("wind");
		String type1 = req.getParameter("oxy");
		String type2 = req.getParameter("carb");

		System.out.println("name".concat(type));
		System.out.println("name".concat(type1));
		System.out.println("name".concat(type2));

		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.append("<html><body>").append("<h1>THIS IS WORKING</h1>").append(type).append(type1).append(type2)
				.append("</html></body>");
	}

}
