package Task1;

public class Dog extends Animal 
{
	private boolean isLongHaired;
    private boolean isSmall;
    
    public Dog(String name, boolean isLongHaired, boolean isSmall) 
    {
        super(name, 4);
        this.isLongHaired = isLongHaired;
        this.isSmall = isSmall;
    }
    
    public boolean isLongHaired() 
	{
        return this.isLongHaired;
    }

    public boolean isSmall() {
        return this.isSmall;
    }
    
    @Override
	public String toString() {
        return super.toString() + (isLongHaired ? " (short-haired)" : " (long-haired)");
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
        return true;
    }
    
    public String bark() 
    {
        if (this.isSmall) 
        {
            return "yip";
        } else 
        {
            return "woof";
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