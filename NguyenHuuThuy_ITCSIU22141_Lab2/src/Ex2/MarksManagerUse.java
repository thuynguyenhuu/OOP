package Ex2;

import java.util.Scanner;

public class MarksManagerUse 
{
	static String courseName;
	static float[] marks;
	
	static Scanner enter = new Scanner(System.in);

	public static void main(String[] args) 
	{		
		System.out.println("Enter number of students: ");
		int number = enter.nextInt();
		
        MarksManager mManager = new MarksManager();

        mManager.initialize(number);
		
		mManager.addMarks();
		
		mManager.marks[0] = 30;
		
		mManager.showMarks();
	}
}