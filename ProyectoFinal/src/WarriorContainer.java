import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class WarriorContainer {
	private ArrayList<Warriors> wp=new ArrayList<Warriors>();
	
	WarriorContainer(){
	
	}
	public ArrayList<Warriors> createWarriorContainer(ConnectionBDD connection) {
		// 1.- llegir la base de dades y carregar els personatges
			Warriors warrior;
				try {
					Statement stm = connection.getCon().createStatement();
					String query = "Select warrior_id, warrior_name, warrior_image_path, race_name, hp, strength, speed, agility, defense, points \n"
							+ "from warriors w inner join race r on r.race_id=w.race_id;";
					ResultSet rs = stm.executeQuery(query);

			        while(rs.next()){
			        	warrior = new Warriors();
			        	warrior.setId(rs.getInt(1));
			            warrior.setName(rs.getString(2));
			            warrior.setImagePath(rs.getString(3));
			            warrior.setRaceName(rs.getString(4));
			            warrior.setHp(rs.getInt(5));
			            warrior.setStrength(rs.getInt(6));
			            warrior.setSpeed(rs.getInt(7));
			            warrior.setAgility(rs.getInt(8));
			            warrior.setDefense(rs.getInt(9));
			            warrior.setPoints(rs.getInt(10));
			            wp.add(warrior);
			        }
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				

		return wp;
	}
}
