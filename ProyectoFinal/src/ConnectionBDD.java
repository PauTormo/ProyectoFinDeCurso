import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionBDD {
	
	String url;
	String user;
	String pass;
	Connection con;
	
	public  ConnectionBDD() {
		try {
			// Connect to the BDD
			 
			 url="jdbc:mysql://localhost/project?serverTimezone=UTC";
			 user="alumne";
			 pass="alumne";
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection(url, user, pass);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Connection getCon() {
		return con;
	}

	
}
