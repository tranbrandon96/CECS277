import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/** Class Staff
 * 
 * @author Brandon Tran
 *
 */
public class Staff extends Employee 
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
	public Staff(String LASTNAME, String FIRSTNAME, String ID, String GENDER, GregorianCalendar BIRTHDATE, double HOURLYRATE) {
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
	public void setHourlyRate(int HOURLYRATE) 
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
	
}