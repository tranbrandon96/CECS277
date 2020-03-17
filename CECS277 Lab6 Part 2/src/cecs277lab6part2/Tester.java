package cecs277lab6part2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Scanner;


public class Tester implements Serializable
{
	public static void main (String [] args) throws CloneNotSupportedException, FileNotFoundException, IOException, ClassNotFoundException
	{
		
		Scanner in = new Scanner(System.in);
		SingletonEmployeeFactory ef = SingletonEmployeeFactory.getSingletonFactory();
		ArrayList<Employee> el = new ArrayList<Employee>();
		
		boolean looper = true;
		while(looper)
		{
			System.out.println("\n1) Add employee" + 
							   "\n2) Read from file" +
							   "\n3) Quit");
			String usersChoice = in.next();
			if(usersChoice.equalsIgnoreCase("1"))
			{
				System.out.println("What type of Employee?" + 
								   "\n1) Staff" +
								   "\n2) PartTime" + 
								   "\n3) Faculty");
				String employeeChoice = in.next();
				el.add(ef.getEmployee(employeeChoice));
				try
				{
					ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream("EmployeePart2.dat"));
					objOutput.writeObject(el);
					objOutput.close();
				}
				
				catch(Exception e)
				{
					System.out.println("File is not saved.");
				}
			}

			else if(usersChoice.equalsIgnoreCase("2"))
			{
				try
				{
					ObjectInputStream objInput = new ObjectInputStream(new FileInputStream("EmployeePart2.dat"));
					el = (ArrayList<Employee>) objInput.readObject();
					if(el.isEmpty())
						System.out.println("There are no employees in the database!");
					else
					{
						
						for (int i = 0; i < el.size(); i++)
						{
							if (el.get(i) instanceof Staff)
							{
								System.out.println("Staff: " + el.get(i) + "\n");
							}
							else if (el.get(i) instanceof Faculty)
							{
								System.out.println("Faculty: " + el.get(i) + "\n");
							}
							
							else if (el.get(i) instanceof PartTime)
							{
							System.out.println("Part Time: " + el.get(i) + "\n");
							}
							
						}
						

						objInput.close();
					}
				}
				catch (Exception e)
				{
					System.out.println("File is empty!");
				}
				
			}
			
			else if (usersChoice.equalsIgnoreCase("3"))
			{
				looper = false;
			}
				
			else 
			{
				System.out.println("Invalid input, try again!");
			}
			
		}
		
		
	}
	

}
	


