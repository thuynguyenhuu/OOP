package Task1;

public class Abyssinian extends Cat
{
	public Abyssinian (String name)
	{
		super(name, true, true);
	}
	
	@Override
	public boolean isExtroverted() 
	{
        return true;
    }
}
