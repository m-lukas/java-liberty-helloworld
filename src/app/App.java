package app;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/*")
public abstract class App extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void init() throws ServletException {
		// this space intentionally left blank
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Hello, Homeport!");
	}

	public void destroy()
	{
		// this space intentionally left blank
	}
	
}
