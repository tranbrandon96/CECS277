package cecs277lab6;

import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.Scanner;



public class EmployeeFactory implements Serializable
{
	public static Employee getEmployee(String type)
	{
		Employee e = null;
		
		Scanner in = new Scanner(System.in);
			
		if("1".equalsIgnoreCase(type))
		{
			System.out.println("Input Employee Staff Information");
			e = new Staff();
			
		}
		else if("2".equalsIgnoreCase(type))
		{
			System.out.println("Input Employee PartTime Information");
			e = new PartTime();
			
		}
		else if("3".equalsIgnoreCase(type))
		{
			System.out.println("Input Employee Faculty Information");
			e = new Faculty();
		}

		e.employeeInput();
		return e;
			
	}
}

