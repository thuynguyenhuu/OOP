package Lab5_Q2;

public class Sales extends Employee 
{
    private double fixedSalary;

    public Sales(String name, double fixedSalary) 
    {
        super(name);
        this.fixedSalary = fixedSalary;
    }

    public double getRaise() 
    {
        this.fixedSalary *= 1.02;
        return this.fixedSalary;
    }

    @Override
    public String toString() 
    {
        return super.toString() + " earn $" + String.format("%.2f", getRaise()) + " this month.";
    }
}