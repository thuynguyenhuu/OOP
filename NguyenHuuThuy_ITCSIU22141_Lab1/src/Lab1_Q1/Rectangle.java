package Lab1_Q1;

import java.util.Scanner;


public class Rectangle 
{
	private int width;
	private int height;
	
	static Scanner enter = new Scanner(System.in);

	public Rectangle(int width, int height) 
	{
		System.out.println("Enter the width of rectangle:");
        this.width = enter.nextInt();
        
        System.out.println("Enter the height of rectangle:");
        this.height = enter.nextInt();
        
        if (this.width < 0) 
        {
            System.out.println("Warning: input width is negative!");
            this.width = 1;
        }
        
        if (this.height < 0) 
        {
            System.out.println("Warning: input height is negative!");
            this.height = 1;
        }
	}
	
	public int getWidth() 
    {
        return this.width;
    }
	
	public int getHeight() 
    {
        return this.height;
    }
	
	public void visualize(int width, int height) 
    {
        for (int i = 0; i < this.height; i++) 
        {
            for (int j = 0; j < this.width; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}