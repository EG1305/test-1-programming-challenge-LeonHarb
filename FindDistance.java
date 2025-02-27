// Exam #1 by Leon Harb
// Challenge that finds this distance between two points in a 2D coordinate system.

import java.util.Scanner; 
import java.lang.Math; 
import java.text.DecimalFormat;

public class FindDistance {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		// Get user input of x and y coordinates of the two points
		Scanner input = new Scanner(System.in);
		
		System.out.println("The program will calculate the distance between two points");
		
		// First Point
		System.out.println("Please enter the x and y values for the first point\nx: ");
		double xPoint1 = input.nextDouble();
		System.out.println("y: ");
		double yPoint1 = input.nextDouble();
		
		// Second Point
		System.out.println("Please enter the x and y values for the second point\nx: ");
		double xPoint2 = input.nextDouble();
		System.out.println("y: ");
		double yPoint2 = input.nextDouble();
		
		double distance = getDistance(xPoint1, yPoint1, xPoint2, yPoint2);
		System.out.println("The distance between these points is " + df.format(distance));
		classifyDistance(distance);
		
		input.close();
	}
	
	// This method uses the Euclidean formula to get the distance between the two points
	// It takes four parameters which are the x and y coordinates of the 2 points 
	// It returns the distance
	public static double getDistance(double x1, double y1, double x2, double y2) {
		double distance = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
		
		// The following two statements is a more readible way of doing it and it was my first try
		// double insideSqrt = (Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2));
		// double distance = Math.sqrt(insideSqrt);
		
		return distance;
	}
	
	// This method classifies the distance using if else statements 
	public static void classifyDistance(double distance) {
		if(distance < 5) {
			System.out.println("Classification: Short");
		}
		else if(distance >= 5 && distance <= 15) {
			System.out.println("Classification: Medium");
		}
		else if(distance > 15) {
			System.out.println("Classification: Long");
		}
	}

}
