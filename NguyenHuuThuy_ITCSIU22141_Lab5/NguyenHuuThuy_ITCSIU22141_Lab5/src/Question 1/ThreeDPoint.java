package Lab5_Q1;

public class ThreeDPoint extends Point 
{
	
    protected int y;
    private int z;
    
    public ThreeDPoint(int x, int y, int z) 
    {
    	super(x);  
        this.y = y;  
        this.z = z;
        System.out.println("Ctor of ThreeDPoint");
    }
}