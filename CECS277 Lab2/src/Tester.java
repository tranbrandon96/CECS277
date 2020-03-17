 import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Calendar;



public class Tester 
{
	/**Main method that will throw CloneNotSupportedException
	 * @param args Empty array of string data type 
	 * @throws CloneNotSupportedException
	 */
	public static void main(String [] args) throws CloneNotSupportedException 
	{
		
		Employee employee[]= new Employee[9];
		// Staff
		employee[0] = new Staff("Allen","Paita","123","M",new GregorianCalendar(1959, 2, 23), 50.00);
		employee[1] = new Staff("Zapata","Steven","456","F",new GregorianCalendar(1964, 7, 12), 35.00);
		employee[2] = new Staff("Rios","Enrique","789","M",new GregorianCalendar(1970, 6, 2), 40.00);
		
		// Faculty
		employee[3] = new Faculty("Johnson", "Anne", "243", "F", new GregorianCalendar(1962, 4, 27), Faculty.Level.FU, "Ph.D", "Engineering", 3);
		employee[4] = new Faculty("Bouris", "William", "791", "F", new GregorianCalendar(1975, 3, 14), Faculty.Level.AO, "Ph.D", "English", 1);
		employee[5] = new Faculty("Andrade", "Christopher", "623", "F", new GregorianCalendar(1980, 5, 22), Faculty.Level.AS, "MS", "Physical Education", 0);
		
		//Part Time
		employee[6] = new PartTime("Guzman", "Augusto", "455", "F", new GregorianCalendar(1977, 8, 10), 35.00, 30);
		employee[7] = new PartTime("Depirro", "Martin", "678", "F", new GregorianCalendar(1987, 9, 15), 30.00, 15);
		employee[8] = new PartTime("Aldaco", "Marque", "945", "M", new GregorianCalendar(1988, 11, 24), 20.00, 35);
	
		System.out.println("Part A: Employee information using the method toString");
		for (int i = 0; i < 6; i++)
		{
			if (employee[i] instanceof Staff)
			{
				System.out.println("Staff: " + employee[i].toString() + "\n");
			}
			else if (employee[i] instanceof Faculty)
			{
				System.out.println("Faculty: " + employee[i].toString() + "\n");
			}
			
		}
		
		for (int i = 0; i < employee.length; i++)
		{
			if (employee[i] instanceof PartTime)
			{
			System.out.println("Part Time: " + employee[i].toString() + "\n");
			}
		}
		System.out.println("---------------------------------------------------------");
		
		// Total Monthly Salary for All the Part-Time Staff
		int partTimeTotal = 0;
		for (int i = 0; i < 9; i++)
		{
			if (employee[i] instanceof PartTime)
			{
				partTimeTotal += employee[i].monthlyEarnings();
			}
		}
	
		System.out.println("\nPart B: Total monthly salary for all the part-time staff: $" + partTimeTotal);
		System.out.println("---------------------------------------------------------");
		
		// Total Monthly Salary for All Employees
		int total = 0;
		for (int i = 0; i < 9; i++)
		{
			total += employee[i].monthlyEarnings();
		}
		System.out.println("\nPart C: Total monthly salary for all employees: $" + total);
		System.out.println("---------------------------------------------------------");
		
		// Sort ID in Ascending Order
		System.out.println("\nPart D: Display all employee information ascending by employee id using interface Comparer: \n");
		Arrays.sort(employee,new Comparer());
		int temp = 0;
		while(temp < 9) 
		{
			Employee object1 = (Employee) employee[temp++];
			System.out.println(object1.toString());
		}
		System.out.println("---------------------------------------------------------");
		
		// Sort Last Name in Descending Order
		System.out.println("\nPart E: Display all employee information descending by last name using interface Comparable: \n");
		Arrays.sort(employee);
		int foo = 0;
		while(foo < 9)
		{
			Employee object2 = (Employee) employee [foo++];
			System.out.println(object2.toString());
		}
		System.out.println("---------------------------------------------------------");
		
		// Duplicating a faculty object
		System.out.println("\nPart F: Duplicate a faculty object using clone: \n");
		Faculty originalFaculty = new Faculty("Andrade", "Christopher", "623", "F", new GregorianCalendar(1980, 5, 22), Faculty.Level.AS, "MS", "Physical Education", 0);
		Faculty cloneFaculty = (Faculty)originalFaculty.clone();
		System.out.println(originalFaculty.toString() +
						  "\n\nCloned Faculty Information: \n" + cloneFaculty.toString() +
						  "\nVerify The Duplication: \n" + 
						  "\nOriginal Faculty Information\n" + originalFaculty.toString() + 
						  "\n\nCloned Faculty Information: \n");
		cloneFaculty.setFirstName("Stephen");
		cloneFaculty.setLastName("Hawking");
		cloneFaculty.setBirthDate(new GregorianCalendar(1942, 1, 8));
		cloneFaculty.setGender("M");
		cloneFaculty.setID("420");
		cloneFaculty.setLevel(Faculty.Level.FU);
		System.out.println(cloneFaculty.toString());
		}

}