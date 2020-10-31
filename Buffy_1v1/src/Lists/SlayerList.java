package Lists;

import characters.Slayer;

public class SlayerList {

	private Slayer[] slayerlist;
	private int nSlayer = 0;
	public SlayerList(int maxSlayers) {
		slayerlist = new Slayer[maxSlayers];
	}
	public void addSlayer(int i, int j) {
		if(nSlayer < slayerlist.length)
		{
			slayerlist[nSlayer] = new Slayer(j, i);
			nSlayer++;
		}
	}
	public boolean isSlayerList(int i, int j) {
		boolean encontrado = false;
		for	(int i1 = 0; i1 < nSlayer; i1++ ) {
			if (slayerlist[i1].isSlayer(j, i))
				encontrado = true;
		}
		return encontrado;
		
	}

}
