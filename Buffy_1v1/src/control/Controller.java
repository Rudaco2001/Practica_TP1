package control;

import java.util.Scanner;

import logic.Game;

public class Controller {

	private boolean gameEnded = false;
	public final String prompt = "Command > ";
	public static final String helpMsg = String.format(
			"Available commands:%n" +
			"[a]dd <x> <y>: add a slayer in position x, y%n" +
			"[h]elp: show this help%n" + 
			"[r]eset: reset game%n" + 
			"[e]xit: exit game%n"+ 
			"[n]one | []: update%n");
	
	public static final String unknownCommandMsg = String.format("Unknown command");
	public static final String invalidCommandMsg = String.format("Invalid command");
	public static final String invalidPositionMsg = String.format("Invalid position");

    private Game game;
    private Scanner scanner;
    
    public Controller(Game game, Scanner scanner) {
	    this.game = game;
	    this.scanner = scanner;
    }
    
    public void  printGame() {
   	 System.out.println(game);
   }
    public void GameEnd()
    {
    	gameEnded = true;
    }
    public void run() {
		// TODO fill your code
    	String cmd;
    	while(!gameEnded) {
    		System.out.println(game);
    		System.out.println(prompt);
    		cmd = scanner.nextLine().toLowerCase();
    		switch(cmd)
    		{
    		case "a":
    		case "add":
    			System.out.println("añadiendo");
    			
    			game.addSlayer(Integer.parseInt(scanner.nextLine()),Integer.parseInt(scanner.nextLine()));
    			break;
    		case "h":
    		case "help":
    			System.out.println(helpMsg);
    			break;
    		case "r":
    		case "reset":
    			System.out.println("reseteando");
    			break;
    		case "e":
    		case "exit":
    			System.out.println("saliendo");
    			GameEnd();
    			break;
    		case "n":
    		case "none":
    		case "":
    			game.addVampire();
    			System.out.println("avanzando");
    			break;
    			
    		}
    		
    	}
    }

}

