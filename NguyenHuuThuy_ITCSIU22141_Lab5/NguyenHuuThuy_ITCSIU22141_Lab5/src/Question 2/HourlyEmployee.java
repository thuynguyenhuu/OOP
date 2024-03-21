package Lab5_Q2;

public class HourlyEmployee extends Employee 
{
    private double hourlyPay;
    private double hours;

    public HourlyEmployee(String name, double hourlyPay, double hours) 
    {
        super(name);
        this.hourlyPay = hourlyPay;
        this.hours = hours;
    }
    
    public double getHourlyPay() 
    {
        return hourlyPay;
    }
    
    public void setHourlyPay(double hourlyPay) 
    {
        this.hourlyPay = hourlyPay;
    }
    
    public double getHours() 
    {
        return hours;
    }

    public void setHours(double hours) 
    {
        this.hours = hours;
    }
    
    public double payDay(double hours) 
    {
        if (hours > 40) {
            return 40 * hourlyPay + (hours - 40) * hourlyPay * 1.5;
        } else {
            return hours * hourlyPay;
        }
    }
    
    @Override
    public String toString() 
    {
        return super.toString() + " earn $" + String.format("%.2f", payDay(hours)) + " this month.";
    }
}