package Lists;
import characters.Vampire;
import logic.Game;
public class VampireList {
	private Vampire[] vampirelist;
	private int nVampire = 0;
	Game game;
	public VampireList(int maxVampire, Game game) {
		vampirelist = new Vampire[maxVampire];
		this.game = game;
	}
	public void addVampire() {
		if(nVampire < vampirelist.length)
		{
			int spawn_i = game.randReadint(game.BOARD_WIDTH);
			System.out.println("Intentando vampiro en " + spawn_i + " " + game.BOARD_LENGTH);
			if (!game.isVampire(spawn_i, game.BOARD_LENGTH - 1)) { 
				vampirelist[nVampire] = new Vampire(spawn_i, game.BOARD_LENGTH - 1, game);
				nVampire++;
				System.out.println("Creando vampiro en " + spawn_i + " " + game.BOARD_LENGTH);
			}
			
		}
	}
	public boolean isVampireList(int i, int j) {
		boolean encontrado = false;
		for	(int i1 = 0; i1 < nVampire; i1++ ) {
			if (vampirelist[i1].isVampire(i, j))
				encontrado = true;
		}
		return encontrado;
		
	}
	public void moveVampires() {
		for	(int i2 = 0; i2 < nVampire; i2++ ) {
			vampirelist[i2].moveVampire();
		}
	}
	public String VampireString(int i, int j) {
		for	(int i1 = 0; i1 < nVampire; i1++ ) {
			if (vampirelist[i1].isVampire(i, j))
				return vampirelist[i1].toString();
		}
		return null;
	}
	public void VampireTakeDamage(int i, int j, int damage) {
		for	(int i1 = 0; i1 < nVampire; i1++ ) {
			if (vampirelist[i1].isVampire(i, j))
			{
				vampirelist[i1].takeDamage(damage);
				break;
			}
		
		}
	}
}
