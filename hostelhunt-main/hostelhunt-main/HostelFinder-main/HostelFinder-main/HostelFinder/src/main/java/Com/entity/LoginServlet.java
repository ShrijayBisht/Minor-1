package Com.servlet; 

import java.io.IOException;

import javax.servlet.ServletException;
import javax. servlet. annotation. WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http-HttpSession;

import com. entity. User;

@Webservlet("/Login"
public class LoginSerylet extends Httpservlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			
			String emereq getParameter ("email");
			String psureq-getParameter ("password");
			User u=new User);
            HttpSession session=req-getSession();

            if("admin@gmail. com". equals (em) 8& "admin@121", equals (ps))
            {    
            	session. setAttribute("userobj", u);
            	u.setRole ("admin");
            	resp. sendRedirect ("admin. jsp");
            }else {
		} 
		
		
		
		
	}