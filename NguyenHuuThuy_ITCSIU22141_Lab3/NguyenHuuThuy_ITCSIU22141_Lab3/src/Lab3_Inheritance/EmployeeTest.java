package Lab3_Inheritance;

import java.util.Scanner;

public class EmployeeTest 
{
	
	static String firstName;
	static String lastName;
	static int id;
	static double hourlyPay;
	
	static Scanner enter = new Scanner(System.in);
	
    public static void main(String[] args) 
    {  
    	System.out.println("Enter the number of persons: ");
        int num = enter.nextInt();

        Employee[] employees = new Employee[num];
        
        for (int index = 0; index < num; index++)
        {
        	System.out.println("Enter details for employee " + (index + 1) + ": ");
        	
        	System.out.println("Enter first name: ");
    		firstName = enter.next();
    		
    		System.out.println("Enter last name: ");
    		lastName = enter.next();
    		
    		System.out.println("Enter height in feet: ");
            Double height_feet = enter.nextDouble();
            
            System.out.println("Enter height in inches: ");
            Double height_inches = enter.nextDouble();
            
            System.out.println("Enter employee ID: ");
            int id = enter.nextInt();
            
            System.out.println("Enter hourly pay: ");
            double hourlyPay = enter.nextDouble();
            
            System.out.println("Enter hours of work: ");
            int hours = enter.nextInt();
            
            employees[index] = new Employee(firstName, lastName, id, hourlyPay);
            employees[index].Height(height_feet, height_inches);
            double total = employees[index].payDay(hours);
            System.out.println("Total earn: " + total + "\n");
        }
        
        for (Employee employee : employees)
        {
        	employee.getRaise();
        	System.out.println(employee.toString());  
        }
        
        for(int i = 0; i < num; i++)
        {
        	for(int j = i + 1; j < num; j++)
        	{
        		if(employees[i].equals(employees[j]))
        		{
        			System.out.println("Employee " + (i+1) + " and Employee " + (j+1) + " are equal.");
        		} else 
        		{
        			System.out.println("Employee " + (i+1) + " and Employee " + (j+1) + " are not equal.");
        		}
        	}
        }
    	
    	enter.close();
    }
}