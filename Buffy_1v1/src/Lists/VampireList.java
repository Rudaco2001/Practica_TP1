package Lists;
import characters.Vampire;
public class VampireList {
	private Vampire[] vampirelist;
	private int nVampire = 0;
	public VampireList(int maxVampire) {
		vampirelist = new Vampire[maxVampire];
		
	}
	public void addVampire(int i, int j) {
		if(nVampire < vampirelist.length)
		{
			vampirelist[nVampire] = new Vampire(j, i);
			nVampire++;
			
		}
	}
	public boolean isVampireList(int i, int j) {
		boolean encontrado = false;
		for	(int i1 = 0; i1 < nVampire; i1++ ) {
			if (vampirelist[i1].isVampire(j, i))
				encontrado = true;
		}
		return encontrado;
		
	}
}
