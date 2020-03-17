
public class Student 
{
	private String NAME;
	private String PROGRAM;
	private String MAJOR;

	
	/** Default Constructor
	 * 
	 */
	public Student()
	{
		NAME = "";
		PROGRAM = "";
		MAJOR = "";
		
		
	}
	
	/** Constructor with multiple parameters
	 * 
	 * @param NAME Student's Name
	 * @param PROGRAM Student's Program
	 * @param MAJOR Student's Major
	 */
	public Student(String NAME,String PROGRAM, String MAJOR)
	{
		this.NAME = NAME;
		this.PROGRAM = PROGRAM;
		this.MAJOR = MAJOR;
		
	}
	
	
	/** Get Name
	 * 
	 * @return Student's Name
	 */
	public String getName()
	{
		return NAME;
	}
	
	/** Get Program
	 * 
	 * @return Student's Program
	 */
	public String getProgram()
	{
		return PROGRAM;
	}
	
	/** Get Major
	 * 
	 * @return Student's Major
	 */
	public String getMajor()
	{
		return MAJOR;
	}
	
	
	/** Set Name
	 * 
	 * @param NAME Student's Name
	 */
	public void setName(String NAME)
	{
		this.NAME = NAME;
	}
	
	/** Set Program
	 * 
	 * @param PROGRAM Student's Program
	 */
	public void setProgram(String PROGRAM)
	{
		this.PROGRAM = PROGRAM;
	}
	
	/** Set Major
	 * 
	 * @param MAJOR Student's Major
	 */
	
	public void setMajor(String MAJOR)
	{
		this.MAJOR = MAJOR;
	}
	
	/** Print out Name, Program and Major
	 * 
	 */
	public String toString()
	{
		return ("\nName: " + NAME +
				"\nProgram: " + PROGRAM +
				"\nMajor: " + MAJOR );
	}
}
