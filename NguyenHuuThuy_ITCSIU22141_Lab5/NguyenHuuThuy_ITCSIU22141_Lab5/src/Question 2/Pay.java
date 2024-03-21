package Lab5_Q2;

import java.util.Scanner;

public class Pay 
{
	
	static String name;
	static double hourlyPay;
	static double fixedSalary;
	
	static Scanner enter = new Scanner(System.in);

	public static void main(String[] args) 
	{      
		Employee[] employees = new Employee[3];
        
        employees[0] = new FixedPaidEmployee("Mary", 3600.0);
        employees[1] = new HourlyEmployee("John", 15.0, 50.0); 
        employees[2] = new Sales("Bob", 2000.0);

        for (int i = 0; i < employees.length; i++) 
        {
            System.out.println(employees[i].toString());
        }
	}
}