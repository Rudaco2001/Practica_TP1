package characters;

import logic.Game;

public class Vampire {
	private int damage = 1; 
	private int health = 5;
	private int pos_X;
	private int pos_Y;
	private int cicloI = 1;
	private Game game;
	private static int VampireCreated = 0;
	private static int VampireinBoard = 0;
	private static boolean isArrived = false;
	public Vampire(int i, int j, Game game) {
		// TODO Auto-generated constructor stub
		this.game = game;
		pos_X = i;
		pos_Y = j;	
		VampireCreated++;
		VampireinBoard++;
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
		if(isArrived())
			isArrived = true;					
	}
	public String toString() {
		return ("V[" + health + "]") ;
	}
	public boolean isVampire(int i, int j) {
		
			return i == pos_X && j == pos_Y;
				
	}

	public boolean isDead() {	
		if (health <= 0) {
			VampireinBoard--;
			return true;
		}
		return false;
		
	}

	public void Attack() {
		if (game.isSlayer(pos_X, pos_Y - 1))
			game.SlayerTakeDamage(damage, pos_X, pos_Y - 1);		
	}
	public boolean isArrived() {
		return pos_Y < 0;				
	}
	public static boolean getisArrived() {
		return isArrived;
	}
	public static int getVampireCreated() {
		return VampireCreated;
	}
	public static int getVampireinBoard() {
		return VampireinBoard;
	}
}

