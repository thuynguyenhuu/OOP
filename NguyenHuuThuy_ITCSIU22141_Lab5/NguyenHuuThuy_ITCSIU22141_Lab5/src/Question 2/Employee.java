package Lab5_Q2;

public class Employee 
{
	private String name;

	public Employee()
	{
		this.name = "";
	}
	
	public Employee(String name) 
	{
		this.name = name;
	}

	public String getName() 
    {
        return name;
    }
	
	public String toString()
	{
		return "Employee " + name;
	}
}