package webpack;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

public class ShoppingAction extends Action
{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		// TODO Auto-generated method stub
		System.out.println(request.getParameter("shopid"));
		Enumeration<String> en=request.getParameterNames();
		while(en.hasMoreElements())
		{

			HttpSession session=request.getSession();
			String paramnames=en.nextElement();
			String paramvalues=request.getParameter(paramnames).toString();
			session.setAttribute(paramnames, paramvalues);
		}
		return request.getParameter("shopid")+".success";
	}
	

}
