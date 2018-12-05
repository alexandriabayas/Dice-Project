public class Dice{

	private int sides;
	private int value;

	public Dice(){
		sides = 6;
		value = (int)(Math.random()*6)+1;
	}

	public Dice(int sides){
		this.sides = sides;
		value = (int)(Math.random()*sides)+1;
	}

}