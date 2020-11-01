package Lists;
import Lists.VampireList;
import logic.Game;
import Lists.SlayerList;
public class ListContainer {
	VampireList vampirelist;
	SlayerList slayerlist;
	public ListContainer(int maxVampires, int maxSlayers, Game game)
	{
		vampirelist = new VampireList(maxVampires, game);
		slayerlist = new SlayerList(maxSlayers, game);
	}
	public boolean isSlayerList(int i,int j) {
		return slayerlist.isSlayerList(i, j);
	}
	public boolean isVampireList(int i,int j) {
		return vampirelist.isVampireList(i, j);
	}
	public void addVampire() {
		vampirelist.addVampire();
	}
	public void addSlayer(int s_i,int s_j) {
		slayerlist.addSlayer(s_i, s_j);
	}
	public void moveVampire() {
		vampirelist.moveVampires();
	}
	public String VampireString(int i, int j) {
		return vampirelist.VampireString(i, j);
	}
	public String SlayerString(int i, int j) {
		return slayerlist.SlayerString(i, j);
	}
	public void SlayerAttack() {
		
		slayerlist.SlayerAttack();
		
	}
	public void VampireTakeDamage(int i, int j, int damage) {
		vampirelist.VampireTakeDamage(i, j, damage);
		
	}
}
