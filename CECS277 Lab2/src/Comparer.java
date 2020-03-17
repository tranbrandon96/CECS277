import java.util.Comparator;

/** Comparer
 * 
 * @author Brandon Tran
 *
 */
public class Comparer implements Comparator<Employee>
{
	/**This will compare two employees ID of Employee objects 
	 * 
	 */
	public int compare(Employee o1, Employee o2) 
	{
		return o1.getID().compareTo(o2.getID());
	}

}