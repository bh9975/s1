<html>
<body>
<form method=get action ="http:\\127.0.0.1:8080\E:\ty slips updated\java\s1\Q2\HobbyServerlet">
<input type =radio name=hobby value="swimming">Swimming<br>
<input type =radio name=hobby value="Painting">Painting<br>
<input type =radio name=hobby value="Singing">Singing<br>
<input type =radio name=hobby value="Drawing">Drawing<br>
<input type=submit value="submit">
<input type =reset value="reset">
</form>
</body>
</html>








/*Assignment No:5 Set B.2
Name:
Roll No:
Program:*/
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class HobbyServerlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException
	{
		String data=req.getParameter("hobby");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
                out.println("<html><body>");
                if(data==null)
                {
                 out.println("<script>alert(\"Select some item\");</script> <a href=\"http://localhost:8080/osim\"><br><br><br><br><br><br><br><br>GO BACK </a>");
             
                 return;
                }
		Cookie[] c=req.getCookies();	
		
		
			out.println("<h3>Existing cookie:</h3><br>");
			if(c!=null){
                        for(int i=0;i<c.length;i++)
			{
				String name=c[i].getName();
				String value=c[i].getValue();
				out.println("<b>Name:</b>"+name);
				out.println("<b>Value:</b>"+value);
                                out.println("<br>");
                               
			}
			for(int i=0;i<c.length;i++)
			{
				if(c[i].getValue().equals(data))
				{
					out.println("<h3>cookie is exist</h3>");
                                        out.println(""+c.length);
					
					return;
				}
			}}
		
		
			Cookie c1=new Cookie(""+data+"HOOBY_name",data);
			//c1.setMaxAge(6000);                        
                        resp.addCookie(c1); //out.println(""+c.length);
					
			out.println("<h4>Cookie is added</h4><h2>"+data);
			out.println("</h2><br>"); 	
                         
		out.println("</body></html>");
	}
}
