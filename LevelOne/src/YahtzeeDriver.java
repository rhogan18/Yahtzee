import java.util.Scanner;

public class YahtzeeDriver
{

	/*
	1. Creates a new instance of the YahtzeeGame class
	2. Calls the playGame method on the Yahtzee object
	3. Asks user if they would like to play again
	4. When the user is done playing, prints the number of games played, min, max, and average score
	*/
	public static void main(String [] args)
	{
			int min = 0;
			int max = 0;
			int numGames = 1;
			int sum = 0;
			int score;
			YahtzeeGame myGame=new YahtzeeGame();
			System.out.println("Welcome to Ryan's APCSA Yahtzee Game!");
			score=myGame.playGame();
			System.out.println("Would you like to play again(y/n)? ");
			Scanner s = new Scanner(System.in);
			String answer = s.nextLine();
			min = score;
			max = score;
			sum = score;
			while(answer.equals("y")) {
				YahtzeeGame myNewGame = new YahtzeeGame();
				min = score;
				max = score;
				score = myNewGame.playGame();
				sum += score;
				if(score < min) { min = score; }
				if(score > max) { max = score; }
				numGames++;
				System.out.println("Would you like to play again(y/n)?");
				answer = s.nextLine();
			}
		System.out.println("You played " + numGames + " games. The min score was " + min + ", the max score was " + max + ", and the average score was " + sum/numGames + ".");

	}
}
