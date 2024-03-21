package Lab5_Q2;

public class FixedPaidEmployee extends Employee 
{
	private double fixedSalary;

	public FixedPaidEmployee(String name, double fixedSalary) 
	{
		super(name);
		this.fixedSalary = fixedSalary;
	}

	@Override
	public String toString()
	{
		return super.toString() + " earn $" + String.format("%.2f", fixedSalary) + " per month.";
	}
}