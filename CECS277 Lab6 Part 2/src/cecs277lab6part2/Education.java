package cecs277lab6part2;

import java.io.Serializable;

/** Class Education
 * 
 * @author Brandon Tran
 *
 */
public class Education implements Cloneable, Serializable
{
	private String DEGREE;
	private String MAJOR;
	private int RESEARCH;
	
	/** Default Constructor
	 * 
	 */
	public Education() 
	{
		DEGREE = " ";
		MAJOR = " ";
		RESEARCH = 0;
	}
	
	/** Constructor with multiple parameters
	 * 
	 * @param DEGREE Employee's Degree
	 * @param MAJOR Employee's Major
	 * @param RESEARCH Employee's Research
	 */
	public Education(String DEGREE, String MAJOR, int RESEARCH) 
	{
		this.DEGREE = DEGREE;
		this.MAJOR = MAJOR;
		this.RESEARCH = RESEARCH;
	}
	
	/** Get Degree
	 * 
	 * @return Employee's Degree
	 */
	public String getDegree() 
	{
		return DEGREE;
	}
	
	/** Get Major
	 * 
	 * @return Employee's Major
	 */
	public String getMajor() 
	{
		return MAJOR;
	}
	
	/** Get Research
	 * 
	 * @return Employee's Research
	 */
	public int getResearch() 
	{
		return RESEARCH;
	}
	
	/** Set Degree
	 * 
	 * @param DEGREE Employee's Degree
	 */
	public void setDegree(String DEGREE) 
	{
		this.DEGREE = DEGREE;
	}
	
	/** Set Major
	 * 
	 * @param MAJOR Employee's Major
	 */
	public void setMajor(String MAJOR) 
	{
		this.MAJOR = MAJOR;
	}
	
	/** Set Research
	 * 
	 * @param RESEARCH Employee's Research
	 */
	public void setResearch(int RESEARCH) 
	{
		this.RESEARCH = RESEARCH;
	}
	
	/**Returns the Clone Object of Faculty 
	 * 
	 */
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}