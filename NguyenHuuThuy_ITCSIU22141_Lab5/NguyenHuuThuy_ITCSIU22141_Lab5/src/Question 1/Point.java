package Lab5_Q1;

public class Point 
{
	
    private int x;
    public static int count1 = 0;
    public int count2 = 0;
    
    public Point(int x) 
    {
        this.x = x;
        System.out.println("Ctor of Point");
        Point.count1++;
        this.count2++;
    }
}