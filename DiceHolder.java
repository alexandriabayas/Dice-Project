import java.util.ArrayList;

public class DiceHolder {

	private ArrayList<Dice> container;

	public DiceHolder() {
		this.container = new ArrayList<Dice>();
	}

	public int addDie(Die die) {
		if (container.size() < 6) {
			container.add(Die());
			return 1;
		}
		else
			return -1;
	}

	public void shake() {
		for (int i = 0; i < container.size(); i++) {
			container.get(i).roll();
		}
	}

	public String toString() {
		String x = "";
		for (int i = 0; i < container.size(); i++) {
			x += "Dice " + i + ": " + container.get(i).toString() + "\n";
		}
		return x;
	}

}