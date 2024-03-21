package Lab1_Q3;

import java.util.Scanner;

public class DistanceTest {

	public static void main(String[] args) 
	{
		Scanner enter = new Scanner(System.in);
		
		System.out.println("Enter the first point x and y:");
		double x1 = enter.nextDouble();
		double y1 = enter.nextDouble();
		
		System.out.println("Enter the second point x and y:");
		double x2 = enter.nextDouble();
		double y2 = enter.nextDouble();
		
		Point X = new Point(x1, y1);
		Point Y = new Point(x2, y2);
		
		System.out.println("The distance between the two points is: " + X.distance(Y));
		
		enter.close();
	}
}