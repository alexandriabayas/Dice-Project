public class Die{

	private int sides;
	private int value;

	public Die(){
		sides = 6;
		value = (int)(Math.random()*6)+1;
	}

	public Die(int sides){
		this.sides = sides;
		value = (int)(Math.random()*sides)+1;
	}

	public int getValue(){
		return value;
	}

	public void roll(){
		value = (int)(Math.random()*sides)+1;
	}

	public String toString(){
		return "Number of sides: " + sides + ", Value: " + value;
	}

}