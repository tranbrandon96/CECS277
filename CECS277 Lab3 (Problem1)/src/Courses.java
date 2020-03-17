/** Courses Class
 * 
 * @author Brandon Tran
 *
 */
public class Courses 
{
	private String COURSE;
	private String DESCRIPTION;
	
	/** Default Constructor
	 * 
	 */
	public Courses()
	{
		COURSE = "";
		DESCRIPTION = "";
	
	}
	
	/** Constructor with multiple parameters
	 * 
	 * @param COURSE Student's Courses
	 * @param DESCRIPTION Student's Description
	 */
	public Courses(String COURSE, String DESCRIPTION)
	{
		this.COURSE = COURSE;
		this.DESCRIPTION = DESCRIPTION;
	
	}
	
	/** Get Course
	 * 
	 * @return Student's Courses
	 */
	public String getCourse() 
	{
		return COURSE;
	}
	
	/** Get Description
	 * 
	 * @return Student's Course Description
	 */
	public String getDescription()
	{
		return DESCRIPTION;
	}
	
	/** Set Course
	 * 
	 * @param COURSE Student's Course
	 */
	public void setCourse(String COURSE)
	{
		this.COURSE = COURSE;
	}
	
	/** Set Description
	 * 
	 * @param DESCRIPTION Student's Description
	 */
	public void setDescription(String DESCRIPTION)
	{
		this.DESCRIPTION = DESCRIPTION;
	}

	/** Print out Student's Course and Course Description
	 * 
	 */
	public String toString()
	{
		return (COURSE + "\t" + DESCRIPTION);
				
	}
	

	
	
}
