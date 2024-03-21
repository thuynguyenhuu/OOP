package Lab6;

import java.util.Random;

public class SoftwareEngineer extends Employee 
{
	public SoftwareEngineer() 
	{
        super();
    }
	
	public SoftwareEngineer(String empName, int empId) 
	{
        super(empName, empId);
    }

	public boolean crisis() 
	{
	    Random crisisGen = new Random();
	    if (crisisGen.nextInt(10) == 0) 
	    {
	        return false; 
	    } else 
	    {
	        return true;
	    }
	}
	
	@Override
    public boolean work() 
	{
        System.out.println(this.toString() + " is programming.");
        return crisis();
    }
	
	@Override
    public String toString() 
	{
        return "SoftwareEngineer " + super.toString();
    }
}
