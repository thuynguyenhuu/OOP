package Lab1_Q1;

public class TestRectangle 
{
	static int width;
	static int height;

	public static void main(String[] args) 
	{
		
		for (int i = 0; i < 5; i++) 
        {
            Rectangle rectangle = new Rectangle(width, height);
            rectangle.visualize(rectangle.getWidth(),rectangle.getHeight());
           
        }
	}
}