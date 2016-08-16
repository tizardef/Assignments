package DicePackage;

import java.util.Random;

class Dice {
	int dice;
	int score = 0;

	public int getDice() {
		return this.dice;
	}

	public void setDice() {
		long seed = (new java.util.Date()).getTime();
		java.util.Random rnd = new java.util.Random(seed);

		//this.dice = rnd.nextInt(5) + 1;
		this.dice = ((int) (Math.random() * (6) + 1));
		
		
	}

	public void startgame() {

		while (this.dice != 1) {

			setDice();
			System.out.println(getDice());

			if (this.dice != 1) {
				score += getDice();
			} else {
				break;
			}

		}

	}

}

public class StartGame {

	public static void main(String[] args) {
		Dice dice = new Dice();

		// dice.setDice();
		// System.out.println(dice.getDice());

		dice.startgame();

		System.out.println("Your score is: " + dice.score);
	}

}
