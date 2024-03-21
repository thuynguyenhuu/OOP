package Lab6;

public class SoftwareManager extends SoftwareEngineer implements Manager 
{
	public SoftwareManager() 
    {
        super();
    }
	
    public SoftwareManager(String empName, int empId) 
    {
        super(empName, empId);
    }

    @Override
    public boolean work() 
    {
        System.out.println(this.toString() + " is programming and managing.");
        return crisis();
    }

    @Override
    public void handleCrisis() 
    {
        System.out.println(this.toString() + " is handling a crisis.");
    }

    @Override
    public String toString() 
    {
        return "SoftwareManager " + super.toString();
    }
}
