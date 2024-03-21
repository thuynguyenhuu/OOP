package Ex1;

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

        float[] marks = mManager.initialize(number);

        mManager.addMarks(marks);

        mManager.showMarks(marks);

        float mean = mManager.mean(marks);
        System.out.println("The mean mark is: " + mean);

        System.out.println("Change the mark of student number: ");
        int index = enter.nextInt();
        System.out.println("Mark: ");
        float newMarks = enter.nextFloat();
        mManager.modifyMark(index - 1, newMarks);

        mManager.showMarks(marks);
        
        enter.close();
	}
}