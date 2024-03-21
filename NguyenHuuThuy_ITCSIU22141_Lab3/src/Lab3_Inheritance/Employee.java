package Lab3_Inheritance;

public class Employee extends Person
{
	
	private int id;
	private double hourlyPay;
	
	public Employee(String firstName, String lastName, int id, double hourlyPay) 
	{
        super(firstName, lastName);       
        this.id = id;        
        this.hourlyPay = hourlyPay;
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public double getHourlyPay() 
    {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) 
    {
        this.hourlyPay = hourlyPay;
    }

    public double getRaise() 
    {
        this.hourlyPay *= 1.15;
        return this.hourlyPay;
    }

    public double payDay(int hours) 
    {
        if (hours > 40) {
            return 40 * hourlyPay + (hours - 40) * hourlyPay * 1.5;
        } else {
            return hours * hourlyPay;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
               "They make $" + String.format("%.2f", hourlyPay) + "\n" +
               "They have the employee ID " + id + "\n";
    }

    @Override
    public boolean equals(Object otherObject)
    {
    	if(otherObject instanceof Employee)
    	{
    		Employee toCompare = (Employee) otherObject;
    		
    		if(toCompare.id == this.id && toCompare.getLastName().equals(this.getLastName()))
    		{
    			return true;
            }
    	}
    	return false;
    }
}
