import java.util.*;
public class YahtzeeGame {
    Scanner s = new Scanner(System.in);
	/* instance data should include the five yahtzee dice, a scoreboard, and a CONSTANT (static final) variable NUM_SIDES
	which should be set to six (the number of sides on a yahtzee die) */

    private YahtzeeDie Die1;
    private YahtzeeDie Die2;
    private YahtzeeDie Die3;
    private YahtzeeDie Die4;
    private YahtzeeDie Die5;

    private YahtzeeScorecard sc;
    private static final int NUM_SIDES = 6;


    /* initializes the dice and scoreboard */
    public YahtzeeGame() {
        Die1 = new YahtzeeDie(NUM_SIDES);
        Die2 = new YahtzeeDie(NUM_SIDES);
        Die3 = new YahtzeeDie(NUM_SIDES);
        Die4 = new YahtzeeDie(NUM_SIDES);
        Die5 = new YahtzeeDie(NUM_SIDES);
        sc = new YahtzeeScorecard();

    }

    /* check to see if the game is over, and while the game is not over call the method takeTurn()
	once the game ends (hint: there are 13 turns in a game of Yahtzee), the method should print a
	final scorecard and return the grand total */
    public int playGame() {
        for (int i = 0; i < 13; i++) {
            takeTurn();
        }
        sc.printScoreCard();
        return sc.getGrandTotal();
    }

    /* 	1. call rollDice()
		2. call printDice()
		3. Ask the user if they are satisfied with their roll, or if they would like to roll again.
		   If they are not satisfied continue, otherwise call markScore()
		4. call chooseFrozen()
		5. call rollDice()
		6. call printDice()
		7. Ask the user if they are satisfied with their roll, or if they would like to roll again.
		   If they are not satisfied continue, otherwise call markScore()
		8. call chooseFrozen()
		9. call rollDice()
		10. call printDice()
		11. call markScore()
	*/
    private void takeTurn() {
        rollDice();
        printDice();
        System.out.println("Are you satisfied with your roll (y/n)?");
        String answer = s.nextLine();
        if (answer.equals("y")) {
            markScore();
        } else {
            chooseFrozen();
            rollDice();
            printDice();
            System.out.println("Are you satisfied with your roll (y/n)?");
            answer = s.nextLine();
            if (answer.equals("y")) {
                markScore();
            } else {
                chooseFrozen();
                rollDice();
                printDice();
                markScore();
            }

        }


    }

    /* Rolls all unfrozen dice.  Also resets all dice to the unfrozen state after the roll */
    private void rollDice() {
        if (Die1.isFrozen() == false) {
            Die1.rollDie();
        }
        if (Die2.isFrozen() == false) {
            Die2.rollDie();
        }
        if (Die3.isFrozen() == false) {
            Die3.rollDie();
        }
        if (Die4.isFrozen() == false) {
            Die4.rollDie();
        }
        if (Die5.isFrozen() == false) {
            Die5.rollDie();
        }
        Die1.unfreezeDie();
        Die2.unfreezeDie();
        Die3.unfreezeDie();
        Die4.unfreezeDie();
        Die5.unfreezeDie();
    }

    /* Asks the user which dice should be frozen 1-5 (should be read in in one line) */
    private void chooseFrozen() {
        System.out.println("Which dice do you want to freeze (ex. 1 4 5)");
        String answer = s.nextLine();
        int length = answer.length();
        if (length == 1) {
            if (answer.charAt(0) == '1') {
                Die1.freezeDie();
            }
            if (answer.charAt(0) == '2') {
                Die2.freezeDie();
            }
            if (answer.charAt(0) == '3') {
                Die3.freezeDie();
            }
            if (answer.charAt(0) == '4') {
                Die4.freezeDie();
            }
            if (answer.charAt(0) == '5') {
                Die5.freezeDie();
            }
        } else if (length == 3) {
            if (answer.charAt(0) == '1' || answer.charAt(2) == '1') {
                Die1.freezeDie();
            }
            if (answer.charAt(0) == '2' || answer.charAt(2) == '2') {
                Die2.freezeDie();
            }
            if (answer.charAt(0) == '3' || answer.charAt(2) == '3') {
                Die3.freezeDie();
            }
            if (answer.charAt(0) == '4' || answer.charAt(2) == '4') {
                Die4.freezeDie();
            }
            if (answer.charAt(0) == '5' || answer.charAt(2) == '5') {
                Die5.freezeDie();
            }
        } else if (length == 5) {
            if (answer.charAt(0) == '1' || answer.charAt(2) == '1' || answer.charAt(4) == '1') {
                Die1.freezeDie();
            }
            if (answer.charAt(0) == '2' || answer.charAt(2) == '2' || answer.charAt(4) == '2') {
                Die2.freezeDie();
            }
            if (answer.charAt(0) == '3' || answer.charAt(2) == '3' || answer.charAt(4) == '3') {
                Die3.freezeDie();
            }
            if (answer.charAt(0) == '4' || answer.charAt(2) == '4' || answer.charAt(4) == '4') {
                Die4.freezeDie();
            }
            if (answer.charAt(0) == '5' || answer.charAt(2) == '5' || answer.charAt(4) == '5') {
                Die5.freezeDie();
            }
        } else if (length == 7) {
            if (answer.charAt(0) == '1' || answer.charAt(2) == '1' || answer.charAt(4) == '1' || answer.charAt(6) == '1') {
                Die1.freezeDie();
            }
            if (answer.charAt(0) == '2' || answer.charAt(2) == '2' || answer.charAt(4) == '2' || answer.charAt(6) == '2') {
                Die2.freezeDie();
            }
            if (answer.charAt(0) == '3' || answer.charAt(2) == '3' || answer.charAt(4) == '3' || answer.charAt(6) == '3') {
                Die3.freezeDie();
            }
            if (answer.charAt(0) == '4' || answer.charAt(2) == '4' || answer.charAt(4) == '4' || answer.charAt(6) == '4') {
                Die4.freezeDie();
            }
            if (answer.charAt(0) == '5' || answer.charAt(2) == '5' || answer.charAt(4) == '5' || answer.charAt(6) == '5') {
                Die5.freezeDie();
            }
        } else if (length == 9) {
            if (answer.charAt(0) == '1' || answer.charAt(2) == '1' || answer.charAt(4) == '1' || answer.charAt(6) == '1' || answer.charAt(8) == '1') {
                Die1.freezeDie();
            }
            if (answer.charAt(0) == '2' || answer.charAt(2) == '2' || answer.charAt(4) == '2' || answer.charAt(6) == '2' || answer.charAt(8) == '2') {
                Die2.freezeDie();
            }
            if (answer.charAt(0) == '3' || answer.charAt(2) == '3' || answer.charAt(4) == '3' || answer.charAt(6) == '3' || answer.charAt(8) == '3') {
                Die3.freezeDie();
            }
            if (answer.charAt(0) == '4' || answer.charAt(2) == '4' || answer.charAt(4) == '4' || answer.charAt(6) == '4' || answer.charAt(8) == '4') {
                Die4.freezeDie();
            }
            if (answer.charAt(0) == '5' || answer.charAt(2) == '5' || answer.charAt(4) == '5' || answer.charAt(6) == '5' || answer.charAt(8) == '5') {
                Die5.freezeDie();
            }
        }
    }

    /* Should print the value of all five dice separated by a tab (\t) to the console */
    private void printDice() {
        System.out.println(Die1.getValue() + "\t" + Die2.getValue() + "\t" + Die3.getValue() + "\t" + Die4.getValue() + "\t" + Die5.getValue());
    }

    /* 1. Print a scoreboard
	   2. Ask the user where they would like to mark their score.
	   3. Call appropriate function
	   4. If false is returned the user entered an invalid number, so ask the user to try again	*/
    private void markScore() {
        sc.printScoreCard();
        System.out.println("Where would you like to mark your score (ex. markOnes or markThreeOfAKind or markFullHouse)?");
        String answer = s.nextLine();
        boolean successfulMark = false;
        if ((answer.equals("markOnes")) || (answer.equals("markTwos")) || (answer.equals("markThrees")) || (answer.equals("markFours")) || (answer.equals("markFives")) || (answer.equals("markSixes")) || (answer.equals("markThreeOfAKind")) || (answer.equals("markFourOfAKind")) || (answer.equals("markFullHouse")) || (answer.equals("markSmallStraight")) || (answer.equals("markLargeStraight")) || (answer.equals("markYahtzee")) || (answer.equals("markChance"))) {
            if (answer.equals("markOnes")) {
                successfulMark = sc.markOnes(Die1.getValue(), Die2.getValue(), Die3.getValue(), Die4.getValue(), Die5.getValue());
            }

            if (answer.equals("markTwos")) {
                successfulMark = sc.markTwos(Die1.getValue(), Die2.getValue(), Die3.getValue(), Die4.getValue(), Die5.getValue());
            }

            if (answer.equals("markThrees")) {
                successfulMark = sc.markThrees(Die1.getValue(), Die2.getValue(), Die3.getValue(), Die4.getValue(), Die5.getValue());
            }

            if (answer.equals("markFours")) {
                successfulMark = sc.markFours(Die1.getValue(), Die2.getValue(), Die3.getValue(), Die4.getValue(), Die5.getValue());
            }

            if (answer.equals("markFives")) {
                successfulMark = sc.markFives(Die1.getValue(), Die2.getValue(), Die3.getValue(), Die4.getValue(), Die5.getValue());
            }

            if (answer.equals("markSixes")) {
                successfulMark = sc.markSixes(Die1.getValue(), Die2.getValue(), Die3.getValue(), Die4.getValue(), Die5.getValue());
            }

            if (answer.equals("markThreeOfAKind")) {
                successfulMark = sc.markThreeOfAKind(Die1.getValue(), Die2.getValue(), Die3.getValue(), Die4.getValue(), Die5.getValue());
            }

            if (answer.equals("markFourOfAKind")) {
                successfulMark = sc.markFourOfAKind(Die1.getValue(), Die2.getValue(), Die3.getValue(), Die4.getValue(), Die5.getValue());
            }

            if (answer.equals("markFullHouse")) {
                successfulMark = sc.markFullHouse(Die1.getValue(), Die2.getValue(), Die3.getValue(), Die4.getValue(), Die5.getValue());
            }

            if (answer.equals("markSmallStraight")) {
                successfulMark = sc.markSmallStraight(Die1.getValue(), Die2.getValue(), Die3.getValue(), Die4.getValue(), Die5.getValue());
            }

            if (answer.equals("markLargeStraight")) {
                successfulMark = sc.markLargeStraight(Die1.getValue(), Die2.getValue(), Die3.getValue(), Die4.getValue(), Die5.getValue());
            }

            if (answer.equals("markYahtzee")) {
                successfulMark = sc.markYahtzee(Die1.getValue(), Die2.getValue(), Die3.getValue(), Die4.getValue(), Die5.getValue());
            }

            if (answer.equals("markChance")) {
                successfulMark = sc.markChance(Die1.getValue(), Die2.getValue(), Die3.getValue(), Die4.getValue(), Die5.getValue());
            }

        } else {
            answer = "Invalid Answer";
        }
        while (answer.equals("Invalid Answer") || successfulMark == false) {
            System.out.println("That answer is invalid, please type a correct answer.");
            answer = s.nextLine();
            if (answer.equals("markOnes")) {
                successfulMark = sc.markOnes(Die1.getValue(), Die2.getValue(), Die3.getValue(), Die4.getValue(), Die5.getValue());
            }
            if (answer.equals("markTwos")) {
                successfulMark = sc.markTwos(Die1.getValue(), Die2.getValue(), Die3.getValue(), Die4.getValue(), Die5.getValue());
            }
            if (answer.equals("markThrees")) {
                successfulMark = sc.markThrees(Die1.getValue(), Die2.getValue(), Die3.getValue(), Die4.getValue(), Die5.getValue());
            }
            if (answer.equals("markFours")) {
                successfulMark = sc.markFours(Die1.getValue(), Die2.getValue(), Die3.getValue(), Die4.getValue(), Die5.getValue());
            }
            if (answer.equals("markFives")) {
                successfulMark = sc.markFives(Die1.getValue(), Die2.getValue(), Die3.getValue(), Die4.getValue(), Die5.getValue());
            }
            if (answer.equals("markSixes")) {
                successfulMark = sc.markSixes(Die1.getValue(), Die2.getValue(), Die3.getValue(), Die4.getValue(), Die5.getValue());
            }
            if (answer.equals("markThreeOfAKind")) {
                successfulMark = sc.markThreeOfAKind(Die1.getValue(), Die2.getValue(), Die3.getValue(), Die4.getValue(), Die5.getValue());
            }
            if (answer.equals("markFourOfAKind")) {
                successfulMark = sc.markFourOfAKind(Die1.getValue(), Die2.getValue(), Die3.getValue(), Die4.getValue(), Die5.getValue());
            }
            if (answer.equals("markFullHouse")) {
                successfulMark = sc.markFullHouse(Die1.getValue(), Die2.getValue(), Die3.getValue(), Die4.getValue(), Die5.getValue());
            }
            if (answer.equals("markSmallStraight")) {
                successfulMark = sc.markSmallStraight(Die1.getValue(), Die2.getValue(), Die3.getValue(), Die4.getValue(), Die5.getValue());
            }
            if (answer.equals("markLargeStraight")) {
                successfulMark = sc.markLargeStraight(Die1.getValue(), Die2.getValue(), Die3.getValue(), Die4.getValue(), Die5.getValue());
            }
            if (answer.equals("markYahtzee")) {
                successfulMark = sc.markYahtzee(Die1.getValue(), Die2.getValue(), Die3.getValue(), Die4.getValue(), Die5.getValue());
            }
            if (answer.equals("markChance")) {
                successfulMark = sc.markChance(Die1.getValue(), Die2.getValue(), Die3.getValue(), Die4.getValue(), Die5.getValue());
            }

        }

    }

}