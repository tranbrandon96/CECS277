package cecs277lab5problem2;

import java.io.Serializable;

/** Employee Class
 * 
 * @author Brandon Tran
 *
 */
public class Employee implements Comparable <Employee>, Serializable
{
	// Private Data Variables
	private String fName;
	private String lName;
	private int ID;
	
	
	/** Default Constructor
	 * 
	 */
	public Employee()
	{
		fName = "";
		lName = "";
		ID = 0;
	}
	
	/** Type Conversion Constructor
	 * 
	 * @param fName Employee's First Name
	 * @param lName Employee's Last Name
	 * @param ID Employee's ID
	 */
	public Employee(String fName, String lName, int ID)
	{
		this.fName = fName;
		this.lName = lName;
		this.ID = ID;
	}
	
	/** Get First Name
	 * 
	 * @return Employee's First Name
	 */
	public String getFirstName()
	{
		return fName;
	}
	
	/** Get Last Name
	 * 
	 * @return Employee's Last Name
	 */
	public String getLastName()
	{
		return lName;
	}
	
	/** Get ID
	 * 
	 * @return Employee's ID
	 */
	public int getID()
	{
		return ID;
	}
	
	/** Set First Name
	 * 
	 * @param fName Employee's First Name
	 */ 
	public void setFirstName(String fName)
	{
		this.fName = fName;
	}
	
	/** Set Last Name
	 * 
	 * @param lName Employee's Last Name
	 */
	public void setLastName(String lName)
	{
		this.lName = lName;
	}
	
	/** Set ID
	 * 
	 * @param ID Employee's ID
	 */
	public void setID(int ID)
	{
		this.ID = ID;
	}
	
	/** Calculates a hashcode by combining the hashcodes of the instance variables
	 * 
	 * @return A hashcode dependant on the instance variables
	 */
	public int hashCode()
	{
		final int HASH_MULTIPLIER = 29;
		int h = HASH_MULTIPLIER * fName.hashCode() + lName.hashCode();
		h = HASH_MULTIPLIER * h + ((Integer)ID).hashCode();
		return h;
	}
	
	/** Print Employee Information
	 * 
	 */
	public String toString()
	{
		return ("First Name: " + fName + "\tLast Name: " + lName + "\t" + "\tID: " + ID + "\t" + "Performance: " );
	}
	
	
	/** Calculates the hashcode by combining in hashcode os the instances
	 * 
	 * @return A Hashcode Dependent on the instance variables
	 */
	public int compareTo(Employee a) 
	{

		if(lName.compareTo(a.lName) == 0)
		{
			if(fName.compareTo(a.lName) == 0)
				return ID - a.ID;
			
			return fName.compareTo(a.fName);
		}
		return lName.compareTo(a.lName);


	}
	
	public boolean equals(Employee obj)
	{
		if(lName.equals(obj.lName) && fName.equals(obj.lName) && ID==obj.ID) 
			return true;
		
		return false;
	}

}
