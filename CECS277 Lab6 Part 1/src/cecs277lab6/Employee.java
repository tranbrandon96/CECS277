package cecs277lab6;

import java.util.GregorianCalendar;
import java.util.Scanner;
import java.io.Serializable;
import java.util.Calendar;

/** Abstract Class Employee
 * 
 * @author Brandon Tran
 *
 */
public abstract class Employee implements EmployeeInfo, Comparable<Employee>, Serializable{
	private String LASTNAME;
	private String FIRSTNAME;
	private String ID;
	private String GENDER;
	private GregorianCalendar BIRTHDATE;
	
	/** Default Constructor 
	 * 
	 */
	public Employee()
	{
		LASTNAME = " ";
		FIRSTNAME = " ";
		ID = " ";
		GENDER = " ";
		BIRTHDATE = new GregorianCalendar(0000, 0, 00);
	}
	
	/** Constructor with multiple parameters
	 * 
	 * @param LASTNAME Employee's Last Name
	 * @param FIRSTNAME Employee's First Name
	 * @param ID Employee's ID
	 * @param GENDER Employee's Gender
	 * @param BIRTHDATE Employee's Birth Date
	 */
	public Employee(String LASTNAME, String FIRSTNAME, String ID, String GENDER, GregorianCalendar BIRTHDATE) {
		this.LASTNAME = LASTNAME;
		this.FIRSTNAME = FIRSTNAME;
		this.ID = ID;
		this.GENDER = GENDER;
		this.BIRTHDATE = BIRTHDATE;
	}
	
	/** Get Last Name
	 * 
	 * @return Employee's Last Name
	 */
	public String getLastName() {
		return LASTNAME;
	}
	
	/** Get First Name
	 * 
	 * @return Employee's First Name
	 */
	public String getFirstName() {
		return FIRSTNAME;
	}
	
	/** Get ID
	 * 
	 * @return Employee's ID
	 */
	public String getID() {
		return ID;
	}
	
	/** Get Gender 
	 * 
	 * @return Employee's Gender
	 */
	public String getGENDER() {
		return GENDER;
	}
	
	/** Get Birth Date
	 * 
	 * @return Employee's Birth Date
	 */
	public Calendar getBIRTHDATE(){
		return BIRTHDATE;
	}
	
	/** Set Last Name
	 * 
	 * @param LASTNAME Employee's Last Name
	 */
	public void setLastName(String LASTNAME) {
		this.LASTNAME = LASTNAME;
	}
	
	/** Set FirstName
	 * 
	 * @param FIRSTNAME Employee's First Name
	 */
	public void setFirstName(String FIRSTNAME) {
		this.FIRSTNAME = FIRSTNAME;
	}
	
	/** Set ID
	 * 
	 * @param ID Employee's ID
	 */
	public void setID(String ID) {
		this.ID = ID;
	}
	
	/** Set Gender
	 * 
	 * @param GENDER Employee's Gender
	 */
	public void setGender(String GENDER) {
		this.GENDER = GENDER;
	}
	
	/** Set Birth Date
	 * 
	 * @param BIRTHDATE Employee's Birth Date
	 */
	public void setBirthDate(GregorianCalendar BIRTHDATE) {
		this.BIRTHDATE = BIRTHDATE;
	}
	
	/** Returns Employee's Information
	 * 
	 */
	public String toString() {
		return "\nLast name: " + LASTNAME +
			   "\nFirst Name: " + FIRSTNAME +
			   "\nID: " + ID + 
			   "\nSex: " + GENDER +
			   "\nBirth date: " + BIRTHDATE.get(Calendar.MONTH) + "/" + BIRTHDATE.get(Calendar.DAY_OF_MONTH) + "/" + BIRTHDATE.get(Calendar.YEAR);
	}
	
	/**Abstract method will Calculate and Return Employee's Monthly Earning
	 *
	 * @return Employee's Monthly Earnings
	 */
	public abstract double monthlyEarnings();
	
	/**Method Used to Compare Two Objects by Last Name
	 * 
	 */
	public int compareTo(Employee obj)
	{ 
		if(LASTNAME.compareTo(obj.LASTNAME) == 0)
			return 0;
		else if(LASTNAME.compareTo(obj.LASTNAME) > 0)
			return -1;
		else 
			return 1;
		
	}
	
	public void employeeInput()
	{
		Scanner in = new Scanner(System.in);
		Employee temp = null;
		
		
		System.out.print("Enter Last Name: ");
		String LASTNAME = in.next();
		System.out.print("Enter First Name: ");
		String FIRSTNAME = in.next();
		System.out.print("Enter ID: ");
		String ID = in.next();
		System.out.print("Enter Sex: ");
		String GENDER = in.next();
		System.out.print("Enter Birth Date: ");
		System.out.print("\nMonth: ");
		int MONTH = in.nextInt();
		System.out.print("Day: ");
		int DAY = in.nextInt();
		System.out.print("Year: ");
		int YEAR = in.nextInt();
		
		setLastName(LASTNAME);
		setFirstName(FIRSTNAME);
		setID(ID);
		setGender(GENDER);
		setBirthDate(new GregorianCalendar(YEAR,MONTH,DAY));
		
	}
}