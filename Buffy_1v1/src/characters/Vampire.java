package characters;

public class Vampire {
	private int damage = 1; 
	private int health = 5;
	private int pos_X;
	private int pos_Y;
	public Vampire(int i, int j) {
		// TODO Auto-generated constructor stub
		pos_X = i;
		pos_Y = j;
	}
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
	public String toString() {
		return "V";
	}
	public boolean isVampire(int i, int j) {
		if((i == pos_X)&&(j == pos_Y))
			return true;
		else
			return false;			
	}
}

