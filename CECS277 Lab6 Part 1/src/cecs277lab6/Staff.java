package cecs277lab6;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.io.Serializable;
import java.text.DecimalFormat;

public class Staff extends Employee implements Serializable
{
	private double HOURLYRATE;
	
	/** Default Constructor
	 * 
	 */
	public Staff() 
	{
		super();
		HOURLYRATE = 0.0;
	}
	
	/** Constructor with Multiple Parameters
	 * 
	 * @param LASTNAME Employee's Last Name
	 * @param FIRSTNAME Employee's First Name
	 * @param ID Employee's ID
	 * @param GENDER Employee's Gender
	 * @param BIRTHDATE Employee's Birth Date
	 * @param HOURLYRATE Employee's Hourly Rate
	 */
	public Staff(String LASTNAME, String FIRSTNAME, String ID, String GENDER, GregorianCalendar BIRTHDATE, double HOURLYRATE) 
	{
		super(LASTNAME, FIRSTNAME, ID, GENDER, BIRTHDATE);
		this.HOURLYRATE = HOURLYRATE;
	}
	
	/** Get Hourly Rate
	 * 
	 * @return Employee's Hourly Rate
	 */
	public double getHourlyRate() 
	{
		return HOURLYRATE;
	}
	
	/** Set Hourly Rate
	 * 
	 * @param HOURLYRATE Employee's Hourly Rate
	 */
	public void setHourlyRate(double HOURLYRATE) 
	{
		this.HOURLYRATE = HOURLYRATE;
	}
	
	/** Return Employee Monthly Earnings
	 * 
	 */
	public double monthlyEarnings() 
	{
		return HOURLYRATE * STAFF_MONTHLY_HOURS_WORKED;
	}
	
	
	/** Return Employee's Information for Staff
	 * 
	 */
	public String toString()
	{
		DecimalFormat DF = new DecimalFormat("####00.00");
		return (super.toString() +
					"\nHourly Rate: $" + DF.format(HOURLYRATE) + 
					"\nMonthly Salary: $" + DF.format(monthlyEarnings()));
	}

	@Override
	public void employeeInput() 
	{
		Scanner in = new Scanner(System.in);
		super.employeeInput();
		System.out.print("Enter Hourly Rate: ");
		double HR = in.nextDouble();
		setHourlyRate(HR);

	}
	
	
}
