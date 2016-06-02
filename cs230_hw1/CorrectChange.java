package cs230_hw1;
/**
 * 
 */

/**
 * @author celia
 * 
 */
import java.util.Scanner;



public class CorrectChange {
	
	public static int makeChangeWithOneDenomination(int total, String denominationName, int denomination) {
		if (total/denomination > 0) {
			System.out.println( total/denomination + denominationName);
			total = total - (total/denomination * denomination);
		}
		return total;
	}
	
	public static void makeChange(double d) {
		int sum = (int)(d * 100.0);
		sum = makeChangeWithOneDenomination(sum, " $20 bills", 2000);
		sum = makeChangeWithOneDenomination(sum, " $10 bills", 1000);
		sum = makeChangeWithOneDenomination(sum, " $5 bills", 500);
		sum = makeChangeWithOneDenomination(sum, " $1 bills", 100);
		sum = makeChangeWithOneDenomination(sum, " quarters", 25);
		sum = makeChangeWithOneDenomination(sum, " dimes", 10);
		sum = makeChangeWithOneDenomination(sum, " nickles", 5);
		sum = makeChangeWithOneDenomination(sum, " pennies", 1);
	}
	
	public static void main(String[] args) {	 
	    Scanner in = new Scanner(System.in);
    	System.out.println("How much money shall I make change for?");
    	double d = in.nextDouble();
	    System.out.println("Here is the change for : " + d);
	    makeChange(d);
	    in.close();
	}
}
