package crapsPackage;

import java.util.Scanner;

public class CrapsGame {
	public static void main(String[] args) {
		
		Dice dice = new Dice();
		dice.start();
		
	}
}

 class Dice {

	private Scanner scan = new Scanner(System.in);
	
	int dice1;
	int dice2;
	boolean continuePlaying = true;
	boolean turn1 = true;
	int point;
	
	public int getDice1() {
		return this.dice1;
	}
	public int getDice2() {
		return this.dice2;
	}
	
	//totals the result of dice1 and dice2
	public int getRoll() {
		return getDice1() + getDice2();


	
	}
	//rolls the 2 dice and assigns random numbers to each die 1-6
	public void roll() {
		this.dice1 = ((int) (Math.random() * (6) + 1));
		this.dice2 = ((int) (Math.random() * (6) + 1));
	}
	
	public void start() {
		
		
		
		do {
			//rolls the 2 dice, totals dice value, prints result based on the conditions below
			roll();  
			System.out.println(getRoll());
			
			
			if(turn1 == false) { 
				
				if (getRoll() == 7) {
					System.out.println("You rolled a " + getRoll() + " LOSER");
					continuePlaying = false;
				}
				
				if (getRoll() == point) {
					System.out.println("You rolled a " + getRoll() + " POINT WIN ");
					continuePlaying = false;
							
							
				}
					
				}
			
			
			
			if(turn1 == true) {
			
			if (getRoll() == 7) {
				
				System.out.println("You rolled a " + getRoll() + " WINNER");
				continuePlaying = false;
			}
			
				
			if (getRoll() == 2 || getRoll() == 3 || getRoll() == 12) {
				System.out.println("You rolled a " + getRoll() + " LOSER");
				continuePlaying = false;
			}
				
			if (getRoll() == 4 || getRoll() == 5 || getRoll() == 6 || getRoll() == 8 || getRoll() == 9 || getRoll() == 10 || getRoll() == 11){ 
			   point = getRoll();	
			   turn1 = false; 
				System.out.println("You rolled a " + getRoll() + " POINT");
			}
			}
			
			
			
			
			//if (getRoll() == 7); {
				//System.out.println("You rolled a " + getRoll() + " LOSER");{
				//continuePlaying = false;	
				//}
			//}
			
		} while (continuePlaying == true);
		
		System.out.println("Do you want to play again? Hit N + Enter if you want to quit otherwise hit anything and hit enter.");
		String input = scan.nextLine();
		if(!input.toUpperCase().equals("N")) {
			continuePlaying = true;
			turn1 = true;
			start();
	
		}
		
		}
		
	}
	

