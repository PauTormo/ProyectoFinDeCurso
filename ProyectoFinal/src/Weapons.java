
public class Weapons {
	private String weaponName;
	private int idWeapon;
	private String weaponImagePath;
	private int strength;
	private int speed;
	private String weaponRace ;
	private int points;
	public Weapons(String weaponName, int idWeapon, String weaponImagePath, int strength, int speed, String weaponRace,
			int points) {
		super();
		this.weaponName = weaponName;
		this.idWeapon = idWeapon;
		this.weaponImagePath = weaponImagePath;
		this.strength = strength;
		this.speed = speed;
		this.weaponRace = weaponRace;
		this.points = points;
	}
	public String getWeaponName() {
		return weaponName;
	}
	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}
	public int getIdWeapon() {
		return idWeapon;
	}
	public void setIdWeapon(int idWeapon) {
		this.idWeapon = idWeapon;
	}
	public String getWeaponImagePath() {
		return weaponImagePath;
	}
	public void setWeaponImagePath(String weaponImagePath) {
		this.weaponImagePath = weaponImagePath;
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
	public String getWeaponRace() {
		return weaponRace;
	}
	public void setWeaponRace(String weaponRace) {
		this.weaponRace = weaponRace;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	@Override
	public String toString() {
		return "Weapons [weaponName=" + weaponName + ", idWeapon=" + idWeapon + ", weaponImagePath=" + weaponImagePath
				+ ", strength=" + strength + ", speed=" + speed + ", weaponRace=" + weaponRace + ", points=" + points
				+ "]";
	}
	
	
}
