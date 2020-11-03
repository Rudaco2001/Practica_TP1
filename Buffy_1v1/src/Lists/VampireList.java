package Lists;
import characters.Vampire;
import logic.Game;
public class VampireList {
	private Vampire[] vampirelist;
	private int nVampire = 0;
	private int totalVampires = 0;
	Game game;
	public VampireList(int maxVampire, Game game) {
		vampirelist = new Vampire[maxVampire];
		this.game = game;
		
	}
	public void addVampire() {
		if(totalVampires < vampirelist.length)
		{
			int spawn_i = game.randReadint(game.getBoardWidth());
			System.out.println("Intentando vampiro en " + spawn_i + " " + game.getBoardLength());
			if (!game.isVampire(spawn_i, game.getBoardLength() - 1)) { 
				vampirelist[nVampire] = new Vampire(spawn_i, game.getBoardLength() - 1, game);
				nVampire++;
				totalVampires++;
				System.out.println("Creando vampiro en " + spawn_i + " " + game.getBoardLength());
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
	public void removeCorpses() {
		for	(int i = 0; i < nVampire; i++ ) {
			if (vampirelist[i].isDead()) {
				removeVampire(i);
			}
		}
		
	}
	private void removeVampire(int i) {
		for (int j = i; j < nVampire - 1; j++) {
			vampirelist[j] = vampirelist[j+1];
		}
		nVampire--;
		vampirelist[nVampire] = null;
		
	}
	
}
