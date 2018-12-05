public class DiceRunner{
	public static void main (String[]args){

		Dice die1 = new Dice();
		Dice die2 = new Dice();

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

		int i;
		do{
			i = hold.addDie(new Dice());
			hold.toString();
		}while(i != -1);


	}
}