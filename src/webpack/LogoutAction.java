package webpack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutAction extends Action
{
	public Connection connection;
	public Statement statement;
	private void setConnection() throws SQLException
	{

		connection=Jdbc_Connection.getConnection();
		statement = connection.createStatement();
		
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
			setConnection();
			String usr=(String) request.getSession().getAttribute("name");
			String updateTableSQL = "UPDATE project SET status = ? WHERE name = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(updateTableSQL);
			preparedStatement.setString(1, "0");
			preparedStatement.setString(2, usr);
			// execute insert SQL stetement
			preparedStatement .executeUpdate();
			System.out.println(usr);
			
			System.out.println("done logging out");
			
		
		return "login.dologin";
	}

}
