package logic;

import java.util.Random;
import View.GamePrinter;
import Lists.ListContainer;
import characters.Player;
import characters.Vampire;


public class Game {

	private int BOARD_LENGTH;
	private int BOARD_WIDTH;
	private int numberOfVampires;
	private double vampireFrequency;
	private Random rand;
	private ListContainer listcontainer;
	private Player player;
	private GamePrinter printer;
	private int cicle = 0;
	boolean Ended = false;
	
	
	public Game(long seed, Level level) {
		rand = new Random(seed);
		BOARD_LENGTH = level.getDim_x();
		BOARD_WIDTH = level.getDim_y();
		numberOfVampires = level.getNumberOfVampires();
		vampireFrequency = level.getVampireFrequency();
		listcontainer = new ListContainer(numberOfVampires, BOARD_LENGTH*BOARD_WIDTH, this);
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
			
		
	public void addSlayer(int s_i,int s_j) { //modificado
		if(player.getCoins() >= ListContainer.slayergetCosto()) {
			listcontainer.addSlayer(s_i, s_j);
			player.addCoins(-ListContainer.slayergetCosto());
		}		
		else
			System.out.println("Monedas insuficientes");
		
	}
	
	public int randReadint(int n) {
		return rand.nextInt(n);
	}
	
	public Float randReadfloat() {
		return rand.nextFloat();
	}
	public double randReaddouble() {
		return rand.nextDouble();
	}
	
	public void moveVampire() {
		listcontainer.moveVampire();
	}
	
	public void Update() { //modificado
		
		moveVampire();
		addCoins();
		if(randReaddouble() < vampireFrequency) {
			addVampire();	
		}
		cicle++;
	}
	public int GetCicle() {
		return cicle;
	}
	public void Attack() {
		SlayerAttack();
		VampireAttack();
	}
	public void SlayerAttack()
	{
		listcontainer.SlayerAttack();
	}
	public void VampireAttack() {
		listcontainer.VampireAttack();
	}
	public void VampireTakeDamage(int i, int j, int damage) {
		listcontainer.VampireTakeDamage(i, j, damage);
		
	}
	public void SlayerTakeDamage(int damage, int i, int j) {
		listcontainer.SlayerTakeDamage(i, j, damage);		
	}
	
	public int getBoardWidth() {
		return BOARD_WIDTH;
	}
	public int getBoardLength() {
		return BOARD_LENGTH;
	}
	public void removeCorpses() {
		listcontainer.removeCorpses();
	}
	public void addCoins() { //creado
		if(randReadfloat() < 0.5) {
			player.addCoins(10);
			System.out.println("añadiendo monedas");
		}
		
	}
	
	public String PlayerString() {
		return "Coins: " + player.getCoins();
	}

	public void isGameFinished() {
		if(Vampire.getisArrived()) {
			System.out.println("Vampires win");
			Ended = true;
		}
		
		
	
	}
	public boolean getEnded() {
		return Ended;
	}

	public void Exit() {
		Ended = true;		
	}
	
	public int reaminVamp(){
		return numberOfVampires - Vampire.getVampireCreated();
	}
	public String vampireinBoardSt() {
		return "Vampires in Board: " + Vampire.getVampireinBoard();
	}
	
	
		// TODO Auto-generated method stub
		
	
}
	
