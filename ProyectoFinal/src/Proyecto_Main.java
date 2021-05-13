
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

public class Proyecto_Main {
	ConnectionBDD connection=new ConnectionBDD();
	public static void main(String[] args) {
		//try {
			// Connect to the BDD
	/*		String bdd="project";
			String url="jdbc:mysql://localhost/"+bdd+"?serverTimezone=UTC";
			String user="alumne";
			String pass="alumne";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, user, pass);*/
			
			//Start Graphic Interface
			new Main_Window();
			
	//	} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
	//		e.printStackTrace();
	//	} catch (SQLException e) {
			// TODO Auto-generated catch block
	//		e.printStackTrace();
	//	}
	}
}



