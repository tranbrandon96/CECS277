package cecs277lab6;

import java.io.Serializable;
import java.util.Comparator;

/** Comparer
 * 
 * @author Brandon Tran
 *
 */
public class Comparer implements Comparator<Employee>, Serializable
{
	/**This will compare two employees ID of Employee objects 
	 * 
	 */
	public int compare(Employee o1, Employee o2) 
	{
		return o1.getID().compareTo(o2.getID());
	}

}