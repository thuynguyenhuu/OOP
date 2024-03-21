package ObjectElements;

public class ObjectPairTest 
{
	
	public static void main(String[] args) 
	{
		ObjectPair[] stadiums = new ObjectPair[3];
		
		stadiums[0] = new ObjectPair("Bridgeforth Stadium", 25000);
		stadiums[1] = new ObjectPair("Michigan Stadium", 109901);
		stadiums[2] = new ObjectPair("Lane Stadium", "6623356");
		
		System.out.println(stadiums[0]);
		System.out.println("Largest Stadium: " + largestStadium(stadiums));
	}

	public static String largestStadium(ObjectPair[] stadiums)
	{
		String largestStadium = "";
	    int maxCapacity = 0;

	    for (ObjectPair stadium : stadiums) 
	    {
	        String name = (String) stadium.getFirst();
	        int capacity = (Integer) stadium.getSecond();

	        if (capacity > maxCapacity) 
	        {
	            maxCapacity = capacity;
	            largestStadium = name;
	        }
	    }   
	        
		return largestStadium;
	}
}