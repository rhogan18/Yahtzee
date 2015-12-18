package Yahtzee.LevelFive;
import java.util.*;
public class YahtzeeSortDice2
{
	int first;
	int second;
	int third;
	int fourth;
	int fifth;

	/* constructor: initializes the private data by sorting the order of the dice */
	public YahtzeeSortDice2(int a, int b, int c, int d, int e) {

		if(a <= b && a <= c && a <= d && a <= e) { first = a; }
		else if(b <= a && b <= c && b <= d && b <= e) { first = b; }
		else if(c <= a && c <= b && c <= d && c <= e) { first = c; }
		else if(d <= a && d <= c && d <= b && d <= e) { first = d; }
		else if(e <= a && e <= c && e <= d && e <= b) { first = e; }

		if(a != first && a >= first ||(a <= b && a <= c && a <= d && a <= e)) { second = a; }
		else if(b != first && b > first || (b <= a && b <= c && b <= d && b <= e)) { second = b; }
		else if(c != first && c > first || (c <= a && c <= b && c <= d && c <= e)) { second = c; }
		else if(d != first && d > first || (d <= a && d <= c && d <= b && d <= e)) { second = d; }
		else if(e != first && e > first || (e <= a && e <= c && e <= d && e <= b)) { second = e; }

		if(a != first && a != second && a > second || (a <= b && a <= c && a <= d && a <= e)) { third = a; }
		else if(b != first && b != second && b > second || (b <= a && b <= c && b <= d && b <= e)) { third = b; }
		else if(c != first && c != second && c > second || (c <= a && c <= b && c <= d && c <= e)) { third = c; }
		else if(d != first && d != second && d > second || (d <= a && d <= c && d <= b && d <= e)) { third = d; }
		else if(e != first && e != second && e > second || (e <= a && e <= c && e <= d && e <= b)) { third = e; }

		if(a != first && a != second && a != third && a > third ||(a <= b && a <= c && a <= d && a <= e)) { fourth = a; }
		else if(b != first && b != second && b != third && b > third || (b <= a && b <= c && b <= d && b <= e)) { fourth = b; }
		else if(c != first && c != second && c != third && c > third || (c <= a && c <= b && c <= d && c <= e)) { fourth = c; }
		else if(d != first && d != second && d != third && d > third || (d <= a && d <= c && d <= b && d <= e)) { fourth = d; }
		else if(e != first && e != second && e != third && e > third || (e <= a && e <= c && e <= d && e <= b)) { fourth = e; }

		if(a != first && a != second && a != third && a != fourth ||(a <= b && a <= c && a <= d && a <= e)) { fifth = a; }
		else if(b != first && b != second && b != third && b != fourth || (b <= a && b <= c && b <= d && b <= e)) { fifth = b; }
		else if(c != first && c != second && c != third && c != fourth || (c <= a && c <= b && c <= d && c <= e)) { fifth = c; }
		else if(d != first && d != second && d != third && d != fourth || (d <= a && d <= c && d <= b && d <= e)) { fifth = d; }
		else if(e != first && e != second && e != third && e != fourth || (e <= a && e <= c && e <= d && e <= b)) { fifth = e; }

	}


	/* returns the minimum of the five numbers */
	public int getFirst()
	{
		return first;
	}

	/* returns the second smallest of the five number */
	public int getSecond()
	{
		return second;
	}

	/* returns the middle of the five numbers */
	public int getThird()
	{
		return third;
	}

	/* returns the second largest of the five numbers */
	public int getFourth()
	{
		return fourth;
	}

	/* returns the biggest of the five numbers */
	public int getFifth()
	{
		return fifth;
	}
}
