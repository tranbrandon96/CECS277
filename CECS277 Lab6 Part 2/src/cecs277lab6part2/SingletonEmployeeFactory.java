package cecs277lab6part2;

import java.util.GregorianCalendar;

public class SingletonEmployeeFactory 
{
	private static SingletonEmployeeFactory singletonFactory;
	
	private SingletonEmployeeFactory()
	{
		
	}
	
	// Providing Global point of access

	public static SingletonEmployeeFactory getSingletonFactory() {

	if (null == singletonFactory)
	{

		singletonFactory = new SingletonEmployeeFactory();

	}
	return singletonFactory;
	}

	// Staff
	public Employee getEmployee(String type)
	{   
		Employee e = null;
		if("1".equalsIgnoreCase(type))
	        e = new Staff();
		
		else if("2".equalsIgnoreCase(type))
			e = new PartTime();
		
		else if("3".equalsIgnoreCase(type))
	        e = new Faculty();
	 
	     e.employeeInput();
	     return e;
	}
	
}

