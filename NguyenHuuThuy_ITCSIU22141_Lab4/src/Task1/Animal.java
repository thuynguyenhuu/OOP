package Task1;

public class Animal 
{
	private String name;
    private int numLegs;

    public Animal(String name, int numLegs) 
    {
        this.name = name;
        this.numLegs = numLegs;
    }

    public String getName() 
    {
        return this.name;
    }

    public int getNumLegs() 
    {
        return this.numLegs;
    }

    public boolean isSleeping(int hour, int minute) 
    {
        if (hour > 24 || hour < 0 || minute > 60 || minute < 0) 
        {
            throw new IllegalArgumentException("invalid time specified");
        }

        return (hour >= 22 || hour <= 5);
    }

    public String toString() 
    {
        return this.name;
    }
    
    public String Noise()
    {
    	return "";
    }
    
    public boolean equals(Object otherObject)
    {
    	if(otherObject instanceof Animal)
    	{
    		Animal toCompare = (Animal) otherObject;
    		
    		if(toCompare.Noise().equals(this.Noise()))
    		{
    			return true;
            }
    	}
    	return false;
    }
}
