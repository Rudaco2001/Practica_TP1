package Lists;

import characters.Slayer;
import logic.Game;

public class SlayerList {

	private Slayer[] slayerlist;
	private Game game;
	private int nSlayer = 0;
	public SlayerList(int maxSlayers, Game game) {
		slayerlist = new Slayer[maxSlayers];
		this.game = game;
	}
	public void addSlayer(int s_i, int s_j) {
		if(nSlayer < slayerlist.length)
		{
			if ((s_i <= game.BOARD_WIDTH - 1)&&(s_i >= 0)&&(s_j >= 0)&&(s_j < game.BOARD_LENGTH - 1)&&(!game.isVampire(s_i, s_j))&&(!game.isSlayer(s_i, s_j))){
				slayerlist[nSlayer] = new Slayer(s_i, s_j, game);
				nSlayer++;
			}		
			else
				System.out.println("No ha sido posible crear un Slayer en esa posición");
		}
	}
	public boolean isSlayerList(int i, int j) {
		boolean encontrado = false;
		for	(int i1 = 0; i1 < nSlayer; i1++ ) {
			if (slayerlist[i1].isSlayer(i, j))
				encontrado = true;
		}
		return encontrado;
		
	}
	public String SlayerString(int i, int j) {
		for	(int i1 = 0; i1 < nSlayer; i1++ ) {
			if (slayerlist[i1].isSlayer(i, j))
				return slayerlist[i1].toString();
		}
		return null;
	}
	public void SlayerAttack() {
		for	(int i1 = 0; i1 < nSlayer; i1++ ) {
			slayerlist[i1].Attack();
		}
		// TODO Auto-generated method stub
		
	}

}
