import java.sql.ResultSet;
import java.sql.Statement;

public class Warriors {
	private String name,raceName;
	private int hp, strength, speed, agility, defense, points;
	private int id;
	private String imagePath;
	public Warriors(String name, String raceName, int hp, int strength, int speed, int agility, int defense, int points,
			int id, String imagePath) {
		super();
		this.name = name;
		this.raceName = raceName;
		this.hp = hp;
		this.strength = strength;
		this.speed = speed;
		this.agility = agility;
		this.defense = defense;
		this.points = points;
		this.id = id;
		this.imagePath = imagePath;
	}
	public Warriors() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRaceName() {
		return raceName;
	}
	public void setRaceName(String raceName) {
		this.raceName = raceName;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getAgility() {
		return agility;
	}
	public void setAgility(int agility) {
		this.agility = agility;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	@Override
	public String toString() {
		return "Warriors [name=" + name + ", raceName=" + raceName + ", hp=" + hp + ", strength=" + strength
				+ ", speed=" + speed + ", agility=" + agility + ", defense=" + defense + ", points=" + points + ", id="
				+ id + ", imagePath=" + imagePath + "]";
	}

	
	

}
