package Lab1_Q2;

public class Triangle 
{
	private int side1;
	private int side2;
	private int side3;
	
	public Triangle(int side1, int side2, int side3)
	{
		
		this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
	}
	
	public int getSide1() 
    {
        return this.side1;
    }
	
	public int getSide2() 
    {
        return this.side2;
    }
	
	public int getSide3() 
    {
        return this.side3;
    }
	
	public String verify() 
	{
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) 
        {
            return "Not Triangle";
        } else if (side1 == side2 && side2 == side3) 
        {
            return "Equilateral Triangle";
        } else if (side1 == side2 || side2 == side3 || side1 == side3) 
        {
            return "Isosceles Triangle";
        } else 
        {
            return "Scalene Triangle";
        }
    }

}
