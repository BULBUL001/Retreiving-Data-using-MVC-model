package p1;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class ResultFilter implements Filter {

    public ResultFilter() 
    {
    }

	public void destroy() 
	{	
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		String usn = request.getParameter("usn");
		if(usn.length()!=16)
		{
			((HttpServletResponse)(response)).sendRedirect("/MVC1/error.html");
		}
		else
		{
			chain.doFilter(request, response);
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException 
	{
	}

}
