package game;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		
		int max = 1000;
		int min = 1;
		int temp;
		int numberOfAttempts = 1;
		
		int guess = (max + min) / 2;
		
		System.out.println("Denke an eine Zahl zwischen 1 und 1000.");
	
		do {
			System.out.println("Ist deine Zahl die: " + guess + " Dann drücke die > 1");
			System.out.println("Ist deine Zahl kleiner als " + guess + " Dann drücke die > 2");
			System.out.println("Ist deine Zahl grösser als " + guess + " Dann drücke die > 3");
			Scanner sc = new Scanner (System.in);
			temp = sc.nextInt();
			
			if (temp ==1) {
				System.out.println("Deine Zahl ist die " + guess + " Herzlichen Glückwunsch!!!");
				System.out.println("Du hattest " + numberOfAttempts + " Versuche.");
			}
			else if (temp == 2) {
				max = guess;
				guess = nextGuess(guess, max, min);
				numberOfAttempts++;
			}
			else if (temp == 3) {
				min = guess;
				guess = nextGuess(guess, max, min);
				numberOfAttempts++;
			}
			else 
			{
				System.out.println("Deine Eingabe ist falsch. Versuche es erneut.");
			}
			
			
		} while (temp != 1);

	}
	
	public static int nextGuess(int guess, int max, int min) {
		int guess1 = (max + min) / 2;
		return guess1;
	}

}
