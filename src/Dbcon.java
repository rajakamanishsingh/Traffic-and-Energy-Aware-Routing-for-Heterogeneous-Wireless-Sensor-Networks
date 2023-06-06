import java.sql.Connection;
import java.sql.DriverManager;


public class Dbcon 
{
	static Connection con;
	
	public Connection getConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
		
			System.out.println("Connection Established");
			
		}catch(Exception es){System.out.println(es);}
		return con;
		
	}
}
