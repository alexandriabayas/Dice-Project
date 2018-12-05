public class DiceRunner{
	public static void main (String[]args){

		Die die1 = new Die();
		Die die2 = new Die();

		int rolls = 0;

		while(die1.getValue() != 1 || die2.getValue() != 1){
			die1.roll();
			die2.roll();
			System.out.println("Die 1: " + die1.toString());
			System.out.println("Die 2: " + die2.toString());
			System.out.println();
			rolls++;
		}

		System.out.println("It took " + rolls + " rolls to get snake eyes");
		System.out.println();

		DiceHolder hold = new DiceHolder();

		int i = 1;
		while(i != -1){
			System.out.println(hold.toString());
			i = hold.addDie(new Die((int)(Math.random()*20)+1));
		}

		System.out.println();

		hold.shake();
		System.out.println(hold.toString());


	}
}