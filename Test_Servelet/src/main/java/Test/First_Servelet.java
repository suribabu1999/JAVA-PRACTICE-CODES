package Test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/xyz")


public class First_Servelet implements Servlet {
	
	
	public void init(ServletConfig sc) throws ServletException
	  {
	    //NoCode
	  }

	  public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	  {
	    PrintWriter pw = res.getWriter();
	    res.setContentType("text/html");
	    pw.println("Welcome to Servlet Programming...");
	  }
	  public void destroy()
	  {
	      //NoCode
	  }
	  public String getServletInfo()
	  {
	    return "FisrtServlet";
	  }
	  public ServletConfig getServletConfig()
	  {
	  return this.getServletConfig();
	  }
	
	

}
