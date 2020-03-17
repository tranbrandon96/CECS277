import java.util.GregorianCalendar;
import java.text.DecimalFormat;
import java.util.Calendar;

/** Class Faculty
 * 
 * @author Brandon Tran
 *
 */
public class Faculty extends Employee implements Cloneable
{
	Education ED;
	public enum Level {AS,AO,FU}
	Level LEVEL;
	
	/** Default Constructor
	 * 
	 */
	public Faculty() {
		super();
		ED = new Education();
		LEVEL = null;
	}
	
	/** Constructor with multiple parameters
	 * 
	 * @param LASTNAME Employee's Last Name
	 * @param FIRSTNAME Employee's First Name
	 * @param ID Employee's ID
	 * @param GENDER Employee's Gender
	 * @param BIRTHDATE Employee's Birth Date
	 * @param LEVEL Employee's Level
	 * @param DEGREE Employee's Degree
	 * @param MAJOR Employee's Major
	 * @param RESEARCH Employee's Research
	 */
	public Faculty(String LASTNAME, String FIRSTNAME, String ID, String GENDER, GregorianCalendar BIRTHDATE, Level LEVEL, String DEGREE, String MAJOR, int RESEARCH) 
	{
		super(LASTNAME, FIRSTNAME, ID, GENDER, BIRTHDATE);
		this.LEVEL = LEVEL;
		ED = new Education(DEGREE, MAJOR, RESEARCH);
	}
	
	/** Get Level
	 * 
	 * @return Employee's Level
	 */
	public String getLevel() 
	{
		switch(LEVEL) 
		{
			case AS:
				return "Assistant Professor";
			case AO:
				return "Associate Professor";
			case FU:
				return "Full Time Professor";
			default:
				return " ";	
		}
	}
	
	/** Get Education
	 * 
	 * @return
	 */
	public Education getEducation() 
	{
		return ED;
	}
	
	/** Set Education
	 * 
	 * @param ED Employee's Education
	 */
	public void setEducation(Education ED) 
	{
		this.ED = ED;
	}
	
	/** Set Level
	 * 
	 * @param LEVEL Employee's Level
	 */
	public void setLevel(Level LEVEL) 
	{
		this.LEVEL = LEVEL;
	}
	
	/** Return Monthly Earnings of Faculty Employee's
	 * 
	 */
	public double monthlyEarnings() 
	{
		switch(LEVEL) 
		{
			case AS:
				return FACULTY_MONTHLY_SALARY;
			case AO:
				return FACULTY_MONTHLY_SALARY * 1.5;
			case FU:
				return FACULTY_MONTHLY_SALARY * 2;
			default:
				return 0;
		}
	}
	
	
	/** Return Faculty Information
	 * 
	 */
	public String toString() 
	{
		DecimalFormat DF = new DecimalFormat("####00.00");
		return (super.toString() + 
				"\nLevel: " + getLevel() +
				"\nDegree: " + ED.getDegree() +
				"\nMajor: " + ED.getMajor() + 
				"\nResearch: " + ED.getResearch() +
				"\nMonthly Salary: $" + DF.format(monthlyEarnings()));
	}
	
	/**Returns The Clone object of Faculty 
	 * 
	 */
	public Object clone() throws CloneNotSupportedException
	{
		Faculty clone1 = (Faculty)super.clone();
		ED = (Education) ED.clone();
		clone1.setEducation(ED);
		return clone1;
	}
}