package Lab5_Q1;

public class Test 
{

	public static void main(String[] args) 
	{
		System.out.println("The difference between count1 and count2");
		Point p1 = new Point(1);
        Point p2 = new Point(2);

        System.out.println("count1: " + Point.count1);
        System.out.println("p1.count2: " + p1.count2);  
        System.out.println("p2.count2: " + p2.count2);
		
		ThreeDPoint b = new ThreeDPoint (1,2,3);
	}
}
