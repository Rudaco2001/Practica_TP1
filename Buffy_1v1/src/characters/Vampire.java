package characters;

import logic.Game;

public class Vampire {
	private int damage = 1; 
	private int health = 5;
	private int pos_X;
	private int pos_Y;
	private int cicloI = 1;
	private Game game;
	public Vampire(int i, int j, Game game) {
		// TODO Auto-generated constructor stub
		this.game = game;
		pos_X = i;
		pos_Y = j;		
	}
	
	public void takeDamage (int damage) {
		health -= damage;
	}
	
	public int Damage() {
		return damage;
	}
	
	public void moveVampire() {
		
		if (cicloI % 2 == 0) {
			if (!game.isVampire(pos_X, pos_Y - 1)&& !game.isSlayer(pos_X, pos_Y -1)) {
			pos_Y--;
			cicloI++;
			}
		}
		else 
			cicloI++;
		
	}
	public String toString() {
		return ("V[" + health + "]") ;
	}
	public boolean isVampire(int i, int j) {
		
			return i == pos_X && j == pos_Y;
				
	}

	public boolean isDead() {		
		return health <= 0;
	}

	public void Attack() {
		if (game.isSlayer(pos_X, pos_Y - 1))
			game.SlayerTakeDamage(damage, pos_X, pos_Y - 1);		
	}
}

