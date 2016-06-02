package cs230_hw1;
import java.util.Scanner;
import java.lang.Math;

/**
 * 
 */

/**
 * @author celia
 *
 */
public class AreaTriangle {
	
	public static void findIsosceles(double one, double two, double three){
		if (one == two || two == three || one == three) {
			System.out.println("Triangle is isoceles.");
		} else {
			System.out.println("Triangle is NOT isoceles.");
		}
	}
	
	public static double findArea(double one, double two, double three) {
		double s = (one+two+three)/2;
		return Math.sqrt(s*(s-one)*(s-two)*(s-three));
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the first side of a triangle: ");
		double one = in.nextDouble();
		System.out.println("Please enter the second side of a triangle: ");
		double two = in.nextDouble();
		System.out.println("Please enter the third side of a triangle: ");
		double three = in.nextDouble();
		findIsosceles(one,two,three);
		System.out.println("The area of the triangle is "+findArea(one,two,three));
		in.close();
	}

}
