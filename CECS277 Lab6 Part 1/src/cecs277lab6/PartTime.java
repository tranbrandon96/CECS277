package cecs277lab6;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class PartTime extends Staff implements Serializable
{
private int HOURSWORKED;
	
	/** Default Constructor
	 * 
	 */
	public PartTime() 
	{
		super();
		HOURSWORKED = 0;
	}
	
	/** Constructor with multiple parameters
	 * 
	 * @param LASTNAME Employee's Last Name
	 * @param FIRSTNAME Employee's First Name
	 * @param ID Employee's ID
	 * @param GENDER Employee's Gender
	 * @param BIRTHDATE Employee's Birth Date
	 * @param HOURLYRATE Employee's Hourly Rate
	 * @param HOURSWORKED Employee's Hours Worked
	 */
	
	
	public PartTime(String LASTNAME, String FIRSTNAME, String ID, String GENDER, GregorianCalendar BIRTHDATE, double HOURLYRATE, int HOURSWORKED) 
	{
		super(LASTNAME, FIRSTNAME, ID, GENDER, BIRTHDATE, HOURLYRATE);
		this.HOURSWORKED = HOURSWORKED;
	}
	
	/** Get Hours Worked
	 * 
	 * @return Employee's Hours Worked
	 */
	public int getHoursWorked() 
	{
		return HOURSWORKED;
	}
	
	/** Set Hours Worked
	 * 
	 * @param HOURSWORKED Employee's Hours Worked
	 */
	public void setHoursWorked(int HOURSWORKED) 
	{
		this.HOURSWORKED = HOURSWORKED;
	}
	
	/** Return Part Time Monthly Earnings
	 * 
	 */
	public double monthlyEarnings() 
	{
		return super.getHourlyRate() * HOURSWORKED * 4;
	}
	
	/** Return Part Time Information
	 * 
	 */
	public String toString() 
	{
		DecimalFormat DF = new DecimalFormat("####00.00");
		return (super.toString() +
				"\nHours worked per month: " + HOURSWORKED * 4 );
	}
	
	@Override
	public void employeeInput() 
	{
		Scanner in = new Scanner(System.in);
		super.employeeInput();
		System.out.print("Enter Hours Worked per week: ");
		int HPW = in.nextInt();
		setHoursWorked(HPW);
	} 
}
