package Task1;

public class AbyssinianTest 
{

	public static void main(String[] args) 
	{
		Abyssinian a = new Abyssinian("Abby");
		
		System.out.println("Name: " + a.getName()); 
        System.out.println("Number of Legs: " + a.getNumLegs());
        System.out.println("Sleep all of the time: " + a.isSleeping(10, 30));
        System.out.println("Short Haired: " + a.isShortHaired());
        System.out.println("Extroverted: " + a.isExtroverted()); 
        System.out.println("Small: " + a.isSmall());
        System.out.println("String: " + a.toString());
        System.out.println("Equal: " + a.equals(a));
	}

}
