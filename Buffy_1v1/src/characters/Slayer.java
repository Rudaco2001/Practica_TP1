package characters;

public class Slayer {
	private int damage = 1; 
	private int health = 5;
	private int pos_X;
	private int pos_Y;
	
	public void takeDamage (int damage) {
		health -= damage;
	}
	
	public int Damage() {
		return damage;
	}
	
	

}
