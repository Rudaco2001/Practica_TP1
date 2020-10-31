package characters;

public class Slayer {
	private int damage = 1; 
	private int health = 5;
	private int pos_X;
	private int pos_Y;
	
	public Slayer(int i,int j) {
		pos_X = i;
		pos_Y = j;
	}
	public void takeDamage (int damage) {
		health -= damage;
	}
	
	public int Damage() {
		return damage;
	}
	public boolean isSlayer(int i, int j) {
		
		return i == pos_X && j == pos_Y;
	}
	public String toString() {
		return "S";
	}
	

}
