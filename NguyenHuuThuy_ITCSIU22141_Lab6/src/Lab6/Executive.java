package Lab6;

public class Executive extends Employee implements Manager 
{
    public Executive() 
    {
        super();
    }

    public Executive(String empName, int empId) 
    {
        super(empName, empId);
    }

    @Override
    public boolean work() 
    {
        System.out.println(this.toString() + " is playing golf.");
        return true;
    }

    @Override
    public void handleCrisis() 
    {
        System.out.println(this.toString() + " is handling a crisis.");
    }

    @Override
    public String toString() 
    {
        return "Executive " + super.toString();
    }
}