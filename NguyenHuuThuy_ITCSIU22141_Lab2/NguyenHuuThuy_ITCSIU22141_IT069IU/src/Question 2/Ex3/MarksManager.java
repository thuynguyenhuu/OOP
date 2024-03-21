package Ex3;

import java.util.Scanner;

public class MarksManager 
{
	private String courseName;
	private float[] marks;
	
	public MarksManager()
	{
		courseName = "Object-oriented programming";
	}
	
	public MarksManager(String name)
	{	
		courseName = name;
	}
	
	public String getName()
	{
		return courseName;
	}
	
    public float[] initialize(int numberStudent) 
    {
        this.marks = new float[numberStudent];
        return marks;
    }
    
    public void showMarks() 
    {
    	for (float mark: marks)
    	{
        	System.out.println(mark);
    	}	
    }
    
    public void addMarks() 
    {  
    	Scanner enter = new Scanner(System.in);
        for (int index = 0; index < marks.length; index++) 
        {
            System.out.println("Enter mark for student " + (index + 1) + ":");
            marks[index] = enter.nextFloat();
        }
    }

    public float mean(float[] marks) 
    {
        float sum = 0;
        
        for (float mark : marks) 
        {
            sum += mark;
        }
        return sum / marks.length;
    }

    public void modifyMark(int index, float mark) 
    {
        if (index >= 0 && index < marks.length) 
        {
            marks[index] = mark;
        } 
        else 
        {
            System.out.println("Invalid student index");
        }
    }
}