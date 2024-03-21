package Lab3_Inheritance;

public class Person 
{
	
	private String firstName;
    private String lastName;
    private double height_feet;
    private double height_inches;
    
    public Person()
    {
    	this.firstName = "";
        this.lastName = "";
    }
    
    public Person(String firstName, String lastName)
    {    	
		this.firstName = firstName;
		this.lastName = lastName;
    }
    
    public String getLastName()
    {
    	return lastName;
    }
    
    public void Height(double height_feet, double height_inches)
    {	
        this.height_feet = height_feet;
        this.height_inches = height_inches;
    }

    public String toString() 
    {
        return "Name: " + firstName + " " + lastName + "\n" +
               "They are " + height_feet + "’ " + height_inches + "“\n";
    }
    
    public boolean equals(Object otherObject)
    {
    	if(otherObject instanceof Person)
    	{
    		Person toCompare = (Person) otherObject;
    		
    		if(toCompare.firstName.equals(this.firstName) && toCompare.lastName.equals(this.lastName))
    		{
    			return true;
            }
    	}
    	return false;
    }
}