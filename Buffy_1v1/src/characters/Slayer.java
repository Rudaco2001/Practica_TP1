package characters;

import logic.Game;

public class Slayer {
	private int damage = 1; 
	private int health = 3;
	private int pos_X;
	private int pos_Y;
	private Game game;
	private static int costo = 50;
	
	public Slayer(int i,int j,Game game) {
		pos_X = i;
		pos_Y = j;
		this.game = game;
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
		return "S[" + health + "]";
	}
	public void Attack() {
		for (int j = pos_Y + 1; j < game.getBoardLength(); j++) {
			if(game.isVampire(pos_X, j)) {
				game.VampireTakeDamage(pos_X, j, damage);
				break;
			}
		}
		
	}
	public boolean isDead() {		
		return health <= 0;
	}
	public static int getCosto() {
		return costo;
	}
}
