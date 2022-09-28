package com.xworkz.lipstick;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 12, urlPatterns = "/lips")
public class LipstickServlet extends HttpServlet {

	public LipstickServlet() {
		System.out.println("defalut constructor created");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("object is created");
		String parameter = req.getParameter("color");
		String parameter2 = req.getParameter("bran");
		String parameter3 = req.getParameter("amt");

		System.out.println("name=".concat(parameter));
		System.out.println("name=".concat(parameter2));
		System.out.println("name=".concat(parameter3));
		System.out.println();
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.append("<html><body bgcolor='pink'><h1>IT IS WORKING</h1><br>").append(parameter).append("<br>").append(parameter2)
				.append("<br>").append(parameter3).append("</html></body></br>");

	}
}
