/**
 * 
 */
package cs230_hw2;

import java.util.Scanner;

/**
 * @author celia
 *
 */
public class Point {
	
	final double TOLARANCE = 0.01;
	private double x; 
	private double y;
	
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public void setX(double x1){
		x = x1;
	}
	public void setY(double y1){
		y = y1;
	}
	public Point(double x1, double y1) {
		x = x1;
		y = y1;
	}
	
	public double findDistance(Point p){
		return Math.sqrt(Math.pow(this.getX()-p.getX(),2)+Math.pow(this.getY()-p.getY(),2));
	}
	public boolean areEquidistant(Point one, Point two) {
		if (this.findDistance(one) - this.findDistance(two) < TOLARANCE ) {
			return true;
		}
		return false;
	}
	public String toString() {
		return "<" + getX() + ", " + getY() + ">";
	} 
	
	public static Point readPoint() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the x coordinate: ");
		double x = in.nextDouble();
		System.out.println("Please enter the y coordinate: ");
		double y = in.nextDouble();
		in.close();
		return new Point(x,y);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Point one = readPoint();
		Point two = readPoint();
		Point three = readPoint();
		System.out.println("Two of the points are equidistant: " + (one.areEquidistant(two,three) || two.areEquidistant(one,three))); 

	}

}
