package Lab1_Q2;

import java.util.Scanner;

public class TriangleVerification 
{

	public static void main(String[] args) 
	{
		Scanner Enter = new Scanner(System.in);
		
		System.out.println("Please enter 3 numbers for the sides of a triangle:");
		int side1 = Enter.nextInt();
		int side2 = Enter.nextInt();
		int side3 = Enter.nextInt();
		
		Triangle triangle = new Triangle(side1, side2, side3);
		String result = triangle.verify();
		
		System.out.println(result);
		
		Enter.close();
	}
}