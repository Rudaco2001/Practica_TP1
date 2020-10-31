package Lists;
import Lists.VampireList;
import logic.Game;
import Lists.SlayerList;
public class ListContainer {
	VampireList vampirelist;
	SlayerList slayerlist;
	public ListContainer(int maxVampires, int maxSlayers)
	{
		vampirelist = new VampireList(maxVampires);
		slayerlist = new SlayerList(maxSlayers);
	}
	public boolean isSlayerList(int i,int j) {
		return slayerlist.isSlayerList(i, j);
	}
	public boolean isVampireList(int i,int j) {
		return vampirelist.isVampireList(i, j);
	}
	public void addVampire(int v_i, int v_j) {
		vampirelist.addVampire(v_i, v_j);
	}
	public void addSlayer(int s_i,int s_j) {
		slayerlist.addSlayer(s_i, s_j);
	}
}
