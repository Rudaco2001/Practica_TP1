package Game;

import java.util.Random;

import View.GamePrinter;

import characters.Slayer;
import Lists.VampireList;
import characters.Player;
public class Game {

	public final static int BOARD_LENGTH = 10;
	public final static int BOARD_WIDTH = 4;
	private Random rand;
	private VampireList vampirelist;
	private Player player;
	private Slayer slayer;
	private GamePrinter printer;
	public Game() {
		rand = new Random();
		vampirelist = new VampireList(5);
		player = new Player();
		slayer = new Slayer();
		printer = new GamePrinter(this, BOARD_LENGTH, BOARD_WIDTH);
	}
	public String toString() {
		return printer.toString();
	}
	public String GetString(int i, int j) {
		// TODO Auto-generated method stub
		if(vampirelist.isVampireList(i, j))
			return "V";
		else
			return " ";
	}
	public void addVampire(int i, int j) {
		vampirelist.addVampire(i, j);
	}
		

	

}
