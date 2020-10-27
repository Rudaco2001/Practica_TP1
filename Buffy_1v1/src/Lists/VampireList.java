package Lists;
import characters.Vampire;
public class VampireList {
	private Vampire[] vampirelist;
	private int k = 0;
	public VampireList(int i) {
		vampirelist = new Vampire[i];
	}
	public void addVampire(int i, int j) {
		if(k < vampirelist.length)
		{
			vampirelist[k] = new Vampire(j, i);
			k++;
		}
	}
	public boolean isVampireList(int i, int j) {
		boolean encontrado = false;
		for	(int i1 = 0; i1 < k; i1++ ) {
			if (vampirelist[i1].isVampire(i, j))
				encontrado = true;
		}
		return encontrado;
		
	}
}
