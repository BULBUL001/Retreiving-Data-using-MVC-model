package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class GetResult extends HttpServlet 
{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			String temp = request.getParameter("usn");
			Model m = new Model();
			m.setUsn(temp);
			m.getResult();
			String name=m.getName();
			String usn = m.getUsn();
			int m1 = m.getMarks1();
			int m2 = m.getMarks2();
			int m3 = m.getMarks3();
			
			HttpSession session=request.getSession(true);
			session.setAttribute("NAME", name);
			session.setAttribute("USN", usn);
			session.setAttribute("marks1", m1);
			session.setAttribute("marks2", m2);
			session.setAttribute("marks3", m3);
		
			response.sendRedirect("/MVC1/result.jsp");
		}
		catch(Exception x)
		{
			x.printStackTrace();
		
		}
	}
}
