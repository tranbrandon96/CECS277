/** Credit Class
 * 
 * @author Brandon Tran
 *
 */
public class Credits extends Courses
{
	private double ATTEMPTED;
	private double EARNED;
	private String GRADE;
	private double POINTS;
	
	public enum gradevalue {A,B,C,D,F};
	gradevalue GRADEVALUE;
	
	
	/** Default Constructor
	 * 
	 */
	public Credits()
	{
		ATTEMPTED = 0.000;
		EARNED = 0.000;
		GRADE = "";
		POINTS = 0.000;
		GRADEVALUE = null;
	}
	
	/** Constructor with multiple parameters
	 * 
	 * @param ATTEMPTED Student's Attempted Units
	 * @param EARNED Student's Earned Units
	 * @param GRADE Student's Grade
	 * @param POINTS Student's Points
	 * @param GRADEVALUE Student's Grade Value
	 */ 
	public Credits(double ATTEMPTED, double EARNED, String GRADE, double POINTS, gradevalue GRADEVALUE)
	{
		this.ATTEMPTED = ATTEMPTED;
		this.EARNED = EARNED;
		this.GRADE = GRADE;
		this.POINTS = POINTS;
		this.GRADEVALUE = GRADEVALUE;
	}
	
	/** Get Attempted Units
	 * 
	 * @return Student's Attempted Units
	 */
	public double getAttempted()
	{
		return ATTEMPTED;
	}
	
	/** Get Earned Units
	 * 
	 * @return Student's Earned Units
	 */
	public double getEarned()
	{
		return EARNED;

	}
	/** Get Grade
	 * 
	 * @return Student's Grade
	 */
	public String getGrade()
	{
		return GRADE;
	}
	
	/** Get Grade Value
	 * 
	 * @return Student's Grade Value
	 */
	public double getGradeValue()
	{
		if (GRADE == "A")
			return 4;
		else if (GRADE == "B")
			return 3;
		else if (GRADE == "C")
			return 2;
		else if (GRADE == "D")
			return 1;
		else 
			return 0;
	}
	
	/** Get Points
	 * 
	 * @return Student's Points
	 */
	public double getPoints()
	{
		return POINTS;
	}
	
	/** Set Attempted Units
	 * 
	 * @param ATTEMPTED Student's Attempted Units
	 */
	public void setAttempted(double ATTEMPTED)
	{
		this.ATTEMPTED = ATTEMPTED;
	}
	
	/** Set Earned Units
	 * 
	 * @param EARNED Student's Earned Units
	 */
	public void setEarned(double EARNED)
	{	
		this.EARNED = EARNED;
	}
	
	/**  Set Grade
	 * 
	 * @param GRADE Student's Grade Units
	 */
	public void setGrade(String GRADE)
	{
		this.GRADE = GRADE;
	}
	
	/** Set Grade Value 
	 * 
	 * @param GRADEVALUE Student's Grade Value
	 */
	public void setGradeValue(gradevalue GRADEVALUE)
	{
		this.GRADEVALUE = GRADEVALUE;
	}
	
	/** Set Points 
	 * 
	 * @param POINTS Student's Points
	 */
	public void setPoints(double POINTS)
	{
		this.POINTS = POINTS;
	}
	
	/** Print Attempted Units, Earned Units, Grade and Points
	 * 
	 */
	public String toString()
	{
		return (ATTEMPTED + "\t\t" + EARNED + "\t" + GRADE + "\t" + POINTS);
	}
	
}
