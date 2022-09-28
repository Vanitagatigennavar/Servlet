package primeminister;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 34, urlPatterns = "/modi")
public class PrimeMinisterServlet extends HttpServlet {

	public PrimeMinisterServlet() {
		System.out.println("creating the default constructor ");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("dopost method is created in p m servlet");
		String name = req.getParameter("name");
		String Cn = req.getParameter("COUNTRY NAME");
		String mr = req.getParameter("MARRIED");
		String um = req.getParameter("PARTY");
		String pr = req.getParameter("AGE");
		String yr = req.getParameter("YEARS");
		String tm = req.getParameter("TIMES");

		req.setAttribute("nm", name);
		req.setAttribute("cname", Cn);
		req.setAttribute("married", mr);
		req.setAttribute("party", pr);
		req.setAttribute("year", yr);
		req.setAttribute("times", tm);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/contact.jsp");
		dispatcher.forward(req, resp);

	}

}
