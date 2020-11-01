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
	private int cicle = 0;
	
	public Game(long seed) {
		rand = new Random(seed);
		listcontainer = new ListContainer(5, BOARD_LENGTH*BOARD_WIDTH, this);
		player = new Player();
		printer = new GamePrinter(this, BOARD_LENGTH, BOARD_WIDTH);
		
	}
	
	public String toString() {
		return printer.toString();
	}
	
	public boolean isVampire(int i, int j) {
		return listcontainer.isVampireList(i, j);
	}
	
	public boolean isSlayer(int i, int j) {
		return listcontainer.isSlayerList(i, j);
	}
	
	public String GetString(int i, int j) {
		if(isVampire(i, j))
			return listcontainer.VampireString(i, j);
		else if(isSlayer(i, j))
			return listcontainer.SlayerString(i, j);
		else
			return " ";
	}
	
	public void addVampire() {		
		
			listcontainer.addVampire();
			
	}
			
		
	public void addSlayer(int s_i,int s_j) {
		
			listcontainer.addSlayer(s_i, s_j);
		
	}
	
	public int randReadint(int n) {
		return rand.nextInt(n);
	}
	
	public Float randReadfloat() {
		return rand.nextFloat();
	}
	
	public void moveVampire() {
		listcontainer.moveVampire();
	}
	
	public void Update() {
		
		moveVampire();
		
		if(randReadfloat() < 0.5) {
			addVampire();	
		}
		cicle++;
	}
	public int GetCicle() {
		return cicle;
	}
	
	public void SlayerAttack()
	{
		listcontainer.SlayerAttack();
	}

	public void VampireTakeDamage(int i, int j, int damage) {
		listcontainer.VampireTakeDamage(i, j, damage);
		
	}
	
	
}
	
