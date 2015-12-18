public class YahtzeeScorecard {
	/* instance data given */
	private int ones;
	private int twos;
	private int threes;
	private int fours;
	private int fives;
	private int sixes;
	private int threeKind;
	private int fourKind;
	private int fiveKind;
	private int chance;
	private int fullHouse;
	private int smStraight;
	private int lgStraight;
	private boolean bonus;


	/* Sets up a new game.  Sets all instance data to incomplete (-1). Sets bonus to false */
	public YahtzeeScorecard() {
		ones = -1;
		twos = -1;
		threes = -1;
		fours = -1;
		fives = -1;
		sixes = -1;
		threeKind = -1;
		fourKind = -1;
		fiveKind = -1;
		chance = -1;
		fullHouse = -1;
		smStraight = -1;
		lgStraight = -1;
		bonus = false;
	}

	/* 1. If the field is already full, return false
	   2. Set data value ones equal to number of ones rolled multiplied by one.
	   3. Update the bonus (call updateBonus())
	   4. Return true   */
	public boolean markOnes(int die1, int die2, int die3, int die4, int die5) {
		if (ones == -1) {
            ones = 0;
			if (die1 == 1) {
				ones += 1;
			}
			if (die2 == 1) {
				ones += 1;
			}
			if (die3 == 1) {
				ones += 1;
			}
			if (die4 == 1) {
				ones += 1;
			}
			if (die5 == 1) {
				ones += 1;
			}
			updateBonus();
			return true;
		} else {
			return false;
		}
	}

	/* 1. If the field is already full, return false
	   2. Set data value twos equal to number of twos rolled multiplied by two.
	   3. Update the bonus (call updateBonus())
	   4. Return true   */
	public boolean markTwos(int die1, int die2, int die3, int die4, int die5) {
		if (twos == -1) {
            twos = 0;
			if (die1 == 2) {
				twos += 1;
			}
			if (die2 == 2) {
				twos += 1;
			}
			if (die3 == 2) {
				twos += 1;
			}
			if (die4 == 2) {
				twos += 1;
			}
			if (die5 == 2) {
				twos += 1;
			}
			twos = twos * 2;
			updateBonus();
			return true;
		} else {
			return false;
		}

	}

	/* 1. If the field is already full, return false
	   2. Set data value threes equal to number of threes rolled multiplied by three.
	   3. Update the bonus (call updateBonus())
	   4. Return true  */
	public boolean markThrees(int die1, int die2, int die3, int die4, int die5) {
		if (threes == -1) {
            threes = 0;
			if (die1 == 3) {
				threes += 1;
			}
			if (die2 == 3) {
				threes += 1;
			}
			if (die3 == 3) {
				threes += 1;
			}
			if (die4 == 3) {
				threes += 1;
			}
			if (die5 == 3) {
				threes += 1;
			}
			threes = threes * 3;
			updateBonus();
			return true;
		} else {
			return false;
		}

	}

	/* 1. If the field is already full, the method returns false
	   2. Sets data value fours equal to number of fours rolled multiplied by four.
	   3. Update the bonus (call updateBonus())
	   4. Returns true   */
	public boolean markFours(int die1, int die2, int die3, int die4, int die5) {
		if (fours == -1) {
            fours = 0;
			if (die1 == 4) {
				fours += 1;
			}
			if (die2 == 4) {
				fours += 1;
			}
			if (die3 == 4) {
				fours += 1;
			}
			if (die4 == 4) {
				fours += 1;
			}
			if (die5 == 4) {
				fours += 1;
			}
			fours = fours * 4;
			updateBonus();
			return true;
		} else {
			return false;
		}

	}

	/* 1. If the field is already full, the method returns false
	   2. Sets data value fives equal to number of fives rolled multiplied by five.
	   3. Update the bonus (call updateBonus())
	   4. Returns true   */
	public boolean markFives(int die1, int die2, int die3, int die4, int die5) {
		if (fives == -1) {
            fives = 0;
			if (die1 == 5) {
				fives += 1;
			}
			if (die2 == 5) {
				fives += 1;
			}
			if (die3 == 5) {
				fives += 1;
			}
			if (die4 == 5) {
				fives += 1;
			}
			if (die5 == 5) {
				fives += 1;
			}
			fives = fives * 5;
			updateBonus();
			return true;
		} else {
			return false;
		}
	}

	/* 1. If the field is already full, the method returns false
	   2. Sets data value sixes equal to number of sixes rolled multiplied by six.
	   3. Update the bonus (call updateBonus())
	   4. Returns true */
	public boolean markSixes(int die1, int die2, int die3, int die4, int die5) {
		if (sixes == -1) {
            sixes = 0;
			if (die1 == 6) {
				sixes += 1;
			}
			if (die2 == 6) {
				sixes += 1;
			}
			if (die3 == 6) {
				sixes += 1;
			}
			if (die4 == 6) {
				sixes += 1;
			}
			if (die5 == 6) {
				sixes += 1;
			}
			sixes = sixes * 6;
			updateBonus();
			return true;
		} else {
			return false;
		}
	}

	/* 	1. If the field is already full, return false
		2. Check to see if there are actually three of the same value.
		   If there are, set the data value threeKind to the value of all five dice.
		   If there aren't set the value to 0.
	   	   (Hint: use YahtzeeSortDice2 class!)
	   	4. Return true   */
	public boolean markThreeOfAKind(int die1, int die2, int die3, int die4, int die5) {
		YahtzeeSortDice sd = new YahtzeeSortDice(die1, die2, die3, die4, die5);
		if (threeKind == -1) {
			if (sd.getFirst() == sd.getSecond() && sd.getSecond() == sd.getThird()) {
				threeKind = sd.getFirst()+sd.getSecond()+sd.getThird()+sd.getFourth()+sd.getFifth();
				return true;
			} else if (sd.getSecond() == sd.getThird() && sd.getThird() == sd.getFourth()) {
				threeKind = sd.getFirst()+sd.getSecond()+sd.getThird()+sd.getFourth()+sd.getFifth();
				return true;
			} else if (sd.getThird() == sd.getFourth() && sd.getFourth() == sd.getFifth()) {
				threeKind = sd.getFirst()+sd.getSecond()+sd.getThird()+sd.getFourth()+sd.getFifth();
				return true;
			}
			threeKind=0;
            return true;
		}
		return false;
	}


	/* 	1. If the field is already full, return false
		2. Check to see if there are actually four of the same value.
		   If there are, set the data value fourKind to the value of all five dice.
		   If there aren�t set the value to 0;
		   (Hint: use YahtzeeSortDice2 class!)
		4. Return true  */
	public boolean markFourOfAKind(int die1, int die2, int die3, int die4, int die5)
	{
		YahtzeeSortDice sd = new YahtzeeSortDice(die1,die2,die3,die4,die5);
		if(fourKind==-1) {
			if (sd.getFirst() == sd.getSecond() && sd.getSecond() == sd.getThird() && sd.getThird() == sd.getFourth()) {
				fourKind = sd.getFirst() + sd.getSecond() + sd.getThird() + sd.getFourth() + sd.getFifth();
				return true;
			} else if (sd.getSecond() == sd.getThird() && sd.getThird() == sd.getFourth() && sd.getFourth() == sd.getFifth()) {
				fourKind = sd.getFirst() + sd.getSecond() + sd.getThird() + sd.getFourth() + sd.getFifth();
				return true;
			}
			fourKind=0;
            return true;
		}
			return false;
	}

	/* 1. If the field is already full, return false
	   2. Check to see if there are actually three die with the same value, and two with another value.
	      If there are, set the data value fullHouse to 25.
	      If there aren�t set the value to 0.
	      (Hint: Use YahtzeeSortedDice class!)
       3. Return true   */
	public boolean markFullHouse(int die1, int die2, int die3, int die4, int die5)
	{
		YahtzeeSortDice sd = new YahtzeeSortDice(die1,die2,die3,die4,die5);
		boolean isThreeKind = false;
		boolean isTwoKind = false;
		if(fullHouse==-1){
			if (sd.getFirst() == sd.getSecond() && sd.getSecond() == sd.getThird()) {
				isThreeKind = true;
				if(sd.getFourth()==sd.getFifth()) { isTwoKind = true; }
			} else if (sd.getSecond() == sd.getThird() && sd.getThird() == sd.getFourth()) {
				isThreeKind = true;
				if(sd.getFirst()==sd.getFifth()) { isTwoKind = true; }
			} else if (sd.getThird() == sd.getFourth() && sd.getFourth() == sd.getFifth()) {
				isThreeKind = true;
				if(sd.getFirst()==sd.getSecond()) {isTwoKind = true; }
			}
			fullHouse = 0;
            return true;
		}
		if(isTwoKind&&isThreeKind) {fullHouse = 25; return true;} else {fullHouse = 0; return false;}

	}

	/* 	1. If the field is already full, return false
		2. Check to see if there are actually four consecutive dice numbers.
		   If there are, set the data value smStraight to 30.
		   If there aren�t set the value to 0.
		   (Hint: Use YahtzeeSortedDice class)
		4. Return true  */
	public boolean markSmallStraight(int die1, int die2, int die3, int die4, int die5)
	{
		YahtzeeSortDice sd = new YahtzeeSortDice(die1,die2,die3,die4,die5);
		if(smStraight==-1) {

			if(sd.getSecond()!=sd.getFirst() && sd.getSecond()==sd.getFirst()+1 && sd.getThird()!=sd.getSecond() && sd.getThird()==sd.getSecond()+1 && sd.getFourth() != sd.getThird() && sd.getFourth()==sd.getThird()+1) {
				smStraight=30;
				return true;
			} else if(sd.getThird() != sd.getSecond() && sd.getThird()==sd.getSecond()+1 && sd.getFourth() != sd.getThird() && sd.getFourth()==sd.getThird()+1 && sd.getFifth() != sd.getFourth() && sd.getFifth()==sd.getFourth()+1) {
				smStraight =30;
				return true;
			}
			smStraight = 0;
            return true;
		}

		return false;
	}

	/* 	1. If the field is already full, return false
		2. Check to see if there are actually five consecutive dice numbers.
		   If there are, set the data value lgStraight to 40.
		   If there aren�t set the value to 0;
		   (Hint: use YahtzeeSortDice2 class!)
		3. Return true  */
	public boolean markLargeStraight(int die1, int die2, int die3, int die4, int die5)
	{
		YahtzeeSortDice sd = new YahtzeeSortDice(die1,die2,die3,die4,die5);
		if(lgStraight==-1) {
			if (sd.getSecond() == sd.getFirst() + 1 && sd.getThird() == sd.getSecond() + 1 && sd.getFourth() == sd.getThird() + 1 && sd.getFifth() == sd.getFourth() + 1) {
				lgStraight = 40;
				return true;
			}
			lgStraight = 0;
            return true;
		}

		return false;
	}

	/* 1. If the field is already full, return false
	   2. Checks to see if there are actually five of the same value.  If there are, set the data value fiveKind to 50.  If there aren�t set the value to 0;
       3. Return true   */
	public boolean markYahtzee(int die1, int die2, int die3, int die4, int die5)
	{
		if(fiveKind==-1) {
			if(die1==die2 && die2==die3 && die3==die4 && die4==die5) {
				fiveKind = 50;
				return true;
			}
			fiveKind = 0;
            return true;
		}

		return false;
	}

	/* 1. If the field is already full, return false
	   2. Set the data value chance to the value of all five dice.
	   3. Return true  */
	public boolean markChance(int die1, int die2, int die3, int die4, int die5)
	{
		if(chance==-1) {
			chance = die1 + die2 + die3 + die4 + die5;
			return true;
		}
		return false;
	}

	/* 	1. If the bonus has already been assigned, do nothing
		2. If the upper section�s total is 63 or greater, set the data value bonus to true */
	private void updateBonus()
	{
		int bonusValue = 0;
		if(bonus==false) {
			if (ones != -1) {
				bonusValue += ones;
			}
			if (twos != -1) {
				bonusValue += twos;
			}
			if (threes != -1) {
				bonusValue += threes;
			}
			if (fours != -1) {
				bonusValue += fours;
			}
			if (fives != -1) {
				bonusValue += fives;
			}
			if (sixes != -1) {
				bonusValue += sixes;
			}
		}
		if(bonusValue>=63) {bonus=true;} else {bonus=false;}
	}

	/* 	returns the upper total, remember incompletes (-1s) should not be factored in! */
	public int getUpperTotal()
	{
		int upperTotal = 0;
		if (ones != -1) {
			upperTotal += ones;
		}
		if (twos != -1) {
			upperTotal += twos;
		}
		if (threes != -1) {
			upperTotal += threes;
		}
		if (fours != -1) {
			upperTotal += fours;
		}
		if (fives != -1) {
			upperTotal += fives;
		}
		if (sixes != -1) {
			upperTotal += sixes;
		}
		return upperTotal;
	}


	/* 	returns the lower total, remember incompletes (-1s) should not be factored in! */
	public int getLowerTotal()
	{
		int lowerTotal = 0;
		if(threeKind!=-1) {lowerTotal+=threeKind;}
		if(fourKind!=-1) {lowerTotal+=fourKind;}
		if(fullHouse!=-1) {lowerTotal+=fullHouse;}
		if(smStraight!=-1) {lowerTotal+=smStraight;}
		if(lgStraight!=-1) {lowerTotal+=lgStraight;}
		if(fiveKind!=-1) {lowerTotal+=fiveKind;}
		if(chance!=-1) {lowerTotal+=chance;}
		return lowerTotal;
	}

	public int getThreeKind() {
		return threeKind;
	}

	/* 	returns the grand total, remember incompletes (-1s) should not be factored in! */
	public int getGrandTotal()
	{
		int grandTotal = 0;
		if (ones != -1) { grandTotal += ones; }
		if (twos != -1) { grandTotal += twos; }
		if (threes != -1) { grandTotal += threes; }
		if (fours != -1) { grandTotal += fours; }
		if (fives != -1) { grandTotal += fives; }
		if (sixes != -1) { grandTotal += sixes; }
		if(threeKind!=-1) {grandTotal+=threeKind;}
		if(fourKind!=-1) {grandTotal += fourKind;}
		if(fullHouse!=-1) {grandTotal += fullHouse;}
		if(smStraight!=-1) {grandTotal += smStraight;}
		if(lgStraight!=-1) {grandTotal += lgStraight;}
		if(fiveKind!=-1) {grandTotal += fiveKind;}
		if(chance!=-1) {grandTotal += chance;}
		return grandTotal;
	}

	/*	Prints a scorecard with the current total, using "__" to mark uncompleted fields and a number to mark filled fields
		Sample:
		**********************************
		*  	    Yahtzee Score Card		 *
		*  					`		  	 *
		* 	Ones:				__		 *
		* 	Twos:				__		 *
		* 	Threes:				__		 *
		* 	Fours:				__		 *
		* 	Fives:				25		 *
		* 	Sixes:				__		 *
		*								 *
		*	Upper Bonus:		 0		 *
		* 	Upper Total:   		25		 *
		*								 *
		*	3 of Kind:			__		 *
		* 	4 of Kind:			__		 *
		* 	Full House:			25		 *
		* 	Sm Straight:		__		 *
		* 	Lg  Straight:		__		 *
		* 	Yahtzee:	  		 0		 *
		* 	Chance:				__		 *
		*								 *
		* 	Lower Total:		25		 *
		*								 *
		* 	Grand Total:		50		 *
		**********************************
		already implemented
	*/
	public void printScoreCard()
	{
		System.out.println();
		System.out.println("*********************************");
		System.out.println("*      Yahtzee Score Card       *");
		System.out.println("*                               *");
		System.out.print("*  Ones:\t\t");
		if(ones==-1)System.out.print("__");
		else System.out.print(ones);
		System.out.println("\t*");
		System.out.print("*  Twos:\t\t");
		if(twos==-1)System.out.print("__");
		else System.out.print(twos);
		System.out.println("\t*");
		System.out.print("*  Threes:\t\t");
		if(threes==-1)System.out.print("__");
		else System.out.print(threes);
		System.out.println("\t*");
		System.out.print("*  Fours:\t\t");
		if(fours==-1)System.out.print("__");
		else System.out.print(fours);
		System.out.println("\t*");
		System.out.print("*  Fives:\t\t");
		if(fives==-1)System.out.print("__");
		else System.out.print(fives);
		System.out.println("\t*");
		System.out.print("*  Sixes:\t\t");
		if(sixes==-1)System.out.print("__");
		else System.out.print(sixes);
		System.out.println("\t*");
		System.out.println("*\t\t\t\t*");
		System.out.print("*  Upper Bonus:\t\t");
		if(bonus)System.out.print("35");
		else System.out.print("0");
		System.out.println("\t*");
		System.out.print("*  Upper Total:\t\t");
		System.out.print(this.getUpperTotal());
		System.out.println("\t*");
		System.out.println("*                               *");
		System.out.print("*  3 of Kind:\t\t");
		if(threeKind==-1)System.out.print("__");
		else System.out.print(threeKind);
		System.out.println("\t*");
		System.out.print("*  4 of Kind:\t\t");
		if(fourKind==-1)System.out.print("__");
		else System.out.print(fourKind);
		System.out.println("\t*");
		System.out.print("*  Full House:\t\t");
		if(fullHouse==-1)System.out.print("__");
		else System.out.print(fullHouse);
		System.out.println("\t*");
		System.out.print("*  Sm Straight:\t\t");
		if(smStraight==-1)System.out.print("__");
		else System.out.print(smStraight);
		System.out.println("\t*");
		System.out.print("*  Lg Straight:\t\t");
		if(lgStraight==-1)System.out.print("__");
		else System.out.print(lgStraight);
		System.out.println("\t*");
		System.out.print("*  Yahtzee:\t\t");
		if(fiveKind==-1)System.out.print("__");
		else System.out.print(fiveKind);
		System.out.println("\t*");
		System.out.print("*  Chance:\t\t");
		if(chance==-1)System.out.print("__");
		else System.out.print(chance);
		System.out.println("\t*");
		System.out.println("*                               *");
		System.out.print("*  Lower Total:\t\t");
		System.out.print(this.getLowerTotal());
		System.out.println("\t*");
		System.out.println("*                               *");
		System.out.print("*  Grand Total:\t\t");
		System.out.print(this.getGrandTotal());
		System.out.println("\t*");
		System.out.println("**********************************");
		System.out.println();
	}


}