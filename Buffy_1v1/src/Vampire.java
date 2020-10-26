
public class Vampire {
	private int damage = 1; 
	private int health = 5;
	private int pos_X;
	private int pos_Y;
	public void spawn (int Dimension_X, int Dimension_Y) {
		pos_X = Dimension_X;
		
	}
	public void takeDamage (int damage) {
		health -= damage;
	}
	
	public int Damage() {
		return damage;
	}
	
	public void Advance(int ciclo) {
		if (ciclo % 2 == 0)
		pos_X--;
	}
}
