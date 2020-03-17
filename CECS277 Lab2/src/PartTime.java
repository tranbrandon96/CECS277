import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/** Class PartTime
 * 
 * @author Brandon Tran
 *
 */
public class PartTime extends Staff
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
}