package Lab6;

import java.util.Random;

public class CompanySimulator {

	private int currentTime;
	
	public static final int DEFAULT_MAX_SIZE = 10;
	
    	private int numItems;

	private Employee[] company;

	private void initCompany() 
	{
		company = new Employee[DEFAULT_MAX_SIZE];	
		
		add(new Executive());
		
		for (int i = 0; i < 3; i++) {
			add(new SoftwareManager());
			for (int j = 0; j < 2; j++) {
				add(new SoftwareEngineer());
			}
		}
		
		for(int i = 0; i < this.numItems; i++)
			System.out.println(company[i]);
	}
	
	public void add(Employee em) 
	{
		if (numItems < DEFAULT_MAX_SIZE) {
	        company[numItems] = em;
	        numItems++;
	    } else {
	        System.out.println("Company is at full capacity.");
	    } 
    }

	public void run(int runTime) 
	{
		initCompany();
		
		Random timeGen = new Random();

		currentTime = 0;
		
		while (currentTime <= runTime) 
		{
			int scheduledTime = timeGen.nextInt(10) + 1;

			currentTime += scheduledTime;
			System.out.println("Current Time: " + currentTime);
			performWork();
			
			System.out.println("\n");
		}
	}

	private void performWork() 
	{		
		for (Employee emp : company) 
		{
			if (!emp.work())
				manageCrisis(emp);
		}
	}
	private void manageCrisis(Employee emp) 
	{
		if (emp instanceof SoftwareEngineer) 
		{
	        for (int i = 0; i < numItems; i++) 
	        {
	            if (company[i] == emp && i > 0) 
	            {
	                if (company[i - 1] instanceof Manager) 
	                {
	                    ((Manager) company[i - 1]).handleCrisis();
	                    break;
	                }
	            }
	        }
	    } else if (emp instanceof SoftwareManager) 
	    {
	        for (int i = 0; i < numItems; i++) 
	        {
	            if (company[i] == emp && i > 0) 
	            {
	                if (company[i - 1] instanceof Executive) 
	                {
	                    ((Executive) company[i - 1]).handleCrisis();
	                    break;
	                }
	            }
	        }
	    }
    }

	public static void main(String[] args) 
	{
		CompanySimulator sim = new CompanySimulator();
		sim.run(100);
	}
}