package View;
import Game.Game;
import characters.Vampire;
public class SlayerGame {

	public static void main(String[] args) {
		
		Game game;
		game = new Game();
		game.addVampire(3, 2);
		game.addVampire(0, 2);
		game.addVampire(7, 3);
		game.addVampire(3, 3);
		game.addVampire(5, 0);
		game.addVampire(0, 0);
		System.out.println(game);

	}

}
