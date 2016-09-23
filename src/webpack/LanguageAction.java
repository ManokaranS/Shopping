package webpack;

import java.util.Locale;
import java.util.ResourceBundle;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

public class LanguageAction extends Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(request.getParameter("lang"));
		ResourceBundle rb=ResourceBundle.getBundle("dictionary",new Locale(request.getParameter("lang")));
		HttpSession session=request.getSession();
		session.setAttribute("rb", rb);
		return "login.dologin";
		
		
	}

}
