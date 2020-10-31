package logic;

import java.util.Random;
import View.GamePrinter;
import Lists.ListContainer;
import characters.Player;

public class Game {

	public final int BOARD_LENGTH = 10;
	public final int BOARD_WIDTH = 4;
	private Random rand;
	private ListContainer listcontainer;
	private Player player;
	private GamePrinter printer;
	
	public Game(long seed) {
		rand = new Random(seed);
		listcontainer = new ListContainer(5, BOARD_LENGTH*BOARD_WIDTH);
		player = new Player();
		printer = new GamePrinter(this, BOARD_LENGTH, BOARD_WIDTH);
		
	}
	public String toString() {
		return printer.toString();
	}
	public String GetString(int i, int j) {
		if(listcontainer.isVampireList(j, i))
			return "V";
		else if(listcontainer.isSlayerList(j, i))
			return "S";
		else
			return " ";
	}
	public void addVampire() {
		int spawn_j = randReadint(BOARD_WIDTH);
		System.out.println("Intentando vampiro en " + BOARD_LENGTH + " " + spawn_j);
		if (!listcontainer.isVampireList(BOARD_LENGTH - 1, spawn_j)&&(!listcontainer.isSlayerList(BOARD_LENGTH - 1, spawn_j))) { 
			listcontainer.addVampire(BOARD_LENGTH - 1, spawn_j);
			System.out.println("Creando vampiro en " + BOARD_LENGTH + " " + spawn_j);
		}
			
	}
	public void addSlayer(int s_i,int s_j) {
		if ((s_i < BOARD_LENGTH - 1)&&(s_i >= 0)&&(s_j >= 0)&&(s_j <= BOARD_LENGTH)&&(!listcontainer.isVampireList(s_i, s_j))&&(!listcontainer.isSlayerList(s_i, s_j))){
			listcontainer.addSlayer(s_i, s_j);
		}
		else
			System.out.println("No ha sido posible crear un Slayer en esa posición");
	}
	public int randReadint(int n) {
		return rand.nextInt(n);
	}
	public Float randReadfloat() {
		return rand.nextFloat();
	}
		

	

}
