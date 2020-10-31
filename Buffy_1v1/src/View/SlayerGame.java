package View;
import logic.Game;
import control.Controller;
import java.util.Scanner;

public class SlayerGame {

	public static void main(String[] args) {
		long seed = 0;
		Game game;
		game = new Game(seed);
		Scanner scanner = new Scanner(System.in);
		Controller controller = new Controller(game, scanner);
		controller.run();

	}

}
