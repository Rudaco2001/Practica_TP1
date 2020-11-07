package characters;

import java.util.Random;

public class Player {
	private int coins = 50;	
	public Player(){
		
	}
	public void addCoins(int amount) {
		coins += amount;
	}
	 
	public int getCoins() {
		return coins;
	}
}
