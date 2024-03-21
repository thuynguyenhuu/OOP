package Task1;

public class Cat extends Animal 
{
	private boolean isShortHaired;
	private boolean isSmall;

	public Cat(String name, boolean isShortHaired, boolean isSmall) 
	{
		super(name, 4);
        this.isShortHaired = isShortHaired;
        this.isSmall = isSmall;
	}
	
	public boolean isShortHaired() 
	{
        return this.isShortHaired;
    }
	
	public boolean isSmall() 
	{
        return this.isSmall;
    }
	
	@Override
	public String toString() {
        return super.toString() + (isShortHaired ? " (short-haired)" : " (long-haired)");
    }
	
	@Override
	public boolean isSleeping(int hour, int minute) {
        if (hour > 24 || hour < 0 || minute > 60 || minute < 0) {
            throw new IllegalArgumentException("invalid time specified");
        }
        return true;
    }
	
	public boolean isExtroverted() 
	{
        return false;
    }
	
	public String bark() 
    {
        if (this.isSmall) 
        {
            return "mew";
        } else 
        {
            return "meow";
        }
    }
	
	public boolean equals(Object otherObject)
    {
    	if(otherObject instanceof Cat)
    	{
    		Cat toCompare = (Cat) otherObject;
    		
    		if(toCompare.getName().equals(this.getName()))
    		{
    			return true;
            }
    	}
    	return false;
    }
}
