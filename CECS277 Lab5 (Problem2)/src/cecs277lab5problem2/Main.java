package cecs277lab5problem2;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;

/** Main Class
 * 
 * @author Brandon Tran
 *
 */

public class Main implements Serializable
{
	// Global scanner variable
	public static Scanner in = new Scanner(System.in);
	
	// Main
	public static void main (String[] args) throws IOException, ClassNotFoundException
	{
		// Map object as Integer is as the key and Employee is the value part of the mapping
		HashMap<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();
		
		// Map object as Employee is as the key and String is the value part of the mapping
		HashMap<Employee, String> gradeMap = new HashMap<Employee, String>();
		
		try
		{
			ObjectInputStream inputStream1 = new ObjectInputStream(new FileInputStream("Employee.dat"));
			ObjectInputStream inputStream2 = new ObjectInputStream(new FileInputStream("Performance.dat"));
			employeeMap = (HashMap<Integer, Employee>) inputStream1.readObject();
			gradeMap = (HashMap<Employee, String>) inputStream2.readObject();
			inputStream1.close();
			inputStream2.close();
		}
		
		catch (Exception e)
		{
			ObjectOutputStream outputStream1 = new ObjectOutputStream(new FileOutputStream("Employee.dat"));
			ObjectOutputStream outputStream2 = new ObjectOutputStream(new FileOutputStream("Performance.dat"));
			outputStream1.writeObject(employeeMap);
			outputStream2.writeObject(gradeMap);
			outputStream1.close();
			outputStream2.close();
		}
		

		
		// Create a variable choice
		int choice;
		
		// Loop Stopper
		boolean loop = true;
		while(loop)
		{
			// Store the value of the users input for the menu choice
			choice = printMenuAndGetChoice();
			
			// Create a switch statement to do certain stuff of the menu
			switch(choice)
			{
				// Add Employee
				case 1: 
						addEmployee(employeeMap,gradeMap);
						break;
				
				// Remove Employee
				case 2:
						removeEmployee(employeeMap, gradeMap);
						break;
						
				// Print Performance
				case 3: 
						printPerformance(employeeMap, gradeMap);
						break;
						
				// Modify Performance of Current Employee
				case 4:
						modifyPerformance(employeeMap,gradeMap);
						break;
						
				// Quit the program but at the same time store the employees into a text file to access 
				// once the program runs again
				case 5:
						
					ObjectOutputStream outputStream1 = new ObjectOutputStream(new FileOutputStream("Employee.dat"));
					ObjectOutputStream outputStream2 = new ObjectOutputStream(new FileOutputStream("Performance.dat"));
					
					outputStream1.writeObject(employeeMap);
					outputStream2.writeObject(gradeMap);
					outputStream1.close();
					outputStream2.close();
						
					// Loop Stopper
					loop = false;
					break;

			}
		}
		in.close();
		

	}
	
	/** Print the main menu and return users choice 
	 * 
	 * @return User's Choice
	 */
	public static int printMenuAndGetChoice()
	{
		// Create a variable choice
		int choice = 0;
		
		// Loop Stopper
		boolean input = true;
		
		// Menu 
		while(input)
		{
			
			System.out.println("\n1) Add an Employee");
			System.out.println("2) Remove an Employee");
			System.out.println("3) Print Performance");
			System.out.println("4) Modify Performance");
			System.out.println("5) Quit");
			try
			{
				// If the users input is an integer, store the value into choice
				choice = in.nextInt();
				
				// Stop the loop
				input = false;
			}
			catch (InputMismatchException ex)
			{
				// Catch statement that will check for invalid inputs such as letters instead of integers
				// Ask the user to enter the correct input
				System.out.println("Invalid input, try again!");
				
				// Store the updated user integer value if it is an integer
				in.nextLine();
			}
		
			
		}	
		return choice;
	}
	
	/** Adds a employee based on user input. Prints an error if a employee is added that already exists in the map
	 * 
	 * @param employeeMap The Map to associate Employee's object performance
	 * @param gradeMap the map to associate employee ID with an employee
	 */
	public static void addEmployee(Map<Integer, Employee> employeeMap, Map<Employee, String> gradeMap)
	{
		// Ask the user for the first name and store it to fName
		System.out.print("\nEnter the first name of the Employee: ");
		String fName = in.next();
		
		// Ask the user for the last name and store it to lName
		System.out.print("Enter the last name of the Employee: ");
		String lName = in.next();
		
		// Create a variable ID
		int ID = 0;
		
		// While Loop Stopper
		boolean duplicateCheck = false;
		while(!duplicateCheck)
		{
			// Ask the user for ID and make sure it is an integer
			System.out.println("Enter the ID number of the Employee: ");
			try
			{
				// Store the ID into variable ID
				ID = in.nextInt();
				
				// If the ID exists, run the while loop again and ask for the ID again
				if(employeeMap.containsKey(ID))
				{
					System.out.println("Employee ID already exists");
				}
				
				// If the ID is new, stop the loop
				else
				{
					duplicateCheck = true;
				}
			}
			
			// Catch statement that will check for invalid inputs such as letters instead of integers
			// Ask the user to enter the correct input
			catch (InputMismatchException ex)
			{
				System.out.println("Invalid input, try again!");
				in.nextLine();
			}
			
		}
		
		// Create a new employee object with initialized first name, last name and ID
		Employee newEmployee = new Employee(fName, lName, ID);
		
		// Put the following object into the associated key such as ID.
		employeeMap.put(ID, newEmployee);
		
		// Create a variable ID
		int performance = 0;
		
		// Loop stopper
		boolean invalidInput = false;
		while (!invalidInput)
		{
			// Ask the user for the performance of the Employee
			System.out.println("Enter the performance of the Employee: (1-5)");
			try
			{
				// Store the value of the performance 
				performance = in.nextInt();
				
				// Loop Stopper
				invalidInput = true;
			}
			catch (InputMismatchException ex)
			{
				// If the user enter an invalid input that is not an integer, it will continue to 
				// ask the user to enter an integer again
				System.out.println("Invalid input, try again!");
				
				// Store the updated user integer value if it is an integer
				in.nextLine();
			}
		
		}
		
		// Performance Ratings to put rating numbers for employee
		switch (performance)
		{
		case 1:
			gradeMap.put(newEmployee, "1");
			break;
		case 2:
			gradeMap.put(newEmployee, "2");
			break;
		case 3:
			gradeMap.put(newEmployee, "3");
			break;
		case 4:
			gradeMap.put(newEmployee, "4");
			break;
		case 5:
			gradeMap.put(newEmployee, "5");
			break;
		}
		in.nextLine();
		
	
	}
	
	/** Removes an employee from the map based on user input
	 * 
	 * @param employeeMap The Map to associate Employee's object performance
	 * @param gradeMap the map to associate employee ID with an employee
	 */
	public static void removeEmployee(Map<Integer, Employee> employeeMap, Map<Employee, String> gradeMap)
	{
		// New Employee Object
		Employee employee = new Employee();
		
		// Create a variable ID
		int ID;
		
		// Ask the user for the ID that they want to remove
		System.out.println("\nEnter the ID number of the employee you want to remove: ");
		ID = in.nextInt();
		
		// Remove the ID from the employee map
		if (employeeMap.containsKey(ID))
		{
			employeeMap.remove(ID);
		}
		
		// Use entry set
		for(Map.Entry<Employee, String> entry : gradeMap.entrySet())
		{
			
			if(entry.getKey().getID() == ID)
			{
				employee = entry.getKey();
				gradeMap.remove(employee);
				break;
			}
		}
		
		// Print out the ID that has been removed
		System.out.println("\nEmployee ID number " + ID + " has been removed.");
		
		
	}
	
	/** Prints the employees and performances
	 * 
	 * @param gradeMap The Map to Print
	 * 
	 */
	public static void printPerformance(Map<Integer, Employee> employeeMap, Map<Employee, String> gradeMap) 
	{
		
		// New Employee Object
		Employee employee = new Employee();
		
		// Arraylist of Employees
		ArrayList<Employee> temp = new ArrayList<Employee>(gradeMap.keySet());
		
		// Sort the employee
		Collections.sort(temp);
		
		// If the database is empty, tell the user that there is not any employees in the database
		if (temp.isEmpty())
		{
			System.out.println("There are no employees.");
		}
		
		// Print the database
		else 
		{
			for (int i = 0; i < temp.size(); i++) 
			{
				System.out.print(temp.get(i));
				System.out.println(gradeMap.get(temp.get(i)));
			
			}
			
		}
		
		// New Line
		System.out.println();
		
		
	}
	
	/** Modifies an entry based on user input. Prints an error if an invalid employee is modified
	 * 
	 * @param employeeMap The Map to associate Employee's object performance
	 * @param gradeMap the map to associate employee ID with an employee
	 */
	public static void modifyPerformance(Map<Integer, Employee> employeeMap, Map<Employee, String> gradeMap)
	{
		// Ask the user to enter the ID number of the employee they want to modify
		System.out.print("\nEnter the ID number of the employee you want to modify: ");
		
		// Loop Stopper
		boolean usersInput = true;
		
		// Create a variable ID
		int currentID = 0;
		
		while (usersInput) 
		{
			try 
			{
				// Store the value of ID they wish to modify
				currentID = in.nextInt();
				
				// Stop the loop
				usersInput = false;
			} 
			
			catch (InputMismatchException ex) 
			{
				// If the user enter an invalid input that is not an integer, it will continue to 
				// ask the user to enter an integer again
				System.out.println("Employee ID number does not exist\n");
				
				// Store the updated user integer value if it is an integer
				in.nextLine();
			}
			
		}
		
		// Loop Stopper
		usersInput = true;
		
		// Create a variable choice
		int modifiedID = 0;

		while (usersInput) 
		{
			// Ask the user to enter the modified performance of the employee
			System.out.println("Enter the modified performance: ");

			try 
			{
				// Store the value of the modified ID if they enter an integer successfully
				modifiedID = in.nextInt();
				
				// Loop Stopper
				usersInput = false;
				
			} 
			
			catch (InputMismatchException ex) 
			{
				// If the user enter an invalid input that is not an integer, it will continue to 
				// ask the user to enter an integer again				
				System.out.println("Invalid Selection");
				
				// Store the updated user integer value if it is an integer
				in.nextLine();
			}
		}
		
		// Performance Ratings to put rating numbers for employee
		String modifiedPerformance = "";
		switch (modifiedID) 
		{
		case 1:
			modifiedPerformance = "1";
			break;
		case 2:
			modifiedPerformance = "2";
			break;
		case 3:
			modifiedPerformance = "3";
			break;
		case 4:
			modifiedPerformance = "4";
			break;
		case 5:
			modifiedPerformance = "5";
			break;
		}
		in.nextLine();
		
		// New Employee Object
		Employee employee = new Employee();
		
		// Utilize Map Entry
		for(Map.Entry<Employee, String> entry : gradeMap.entrySet())
		{
			
			if(entry.getKey().getID() == modifiedID)
			{
				employee = entry.getKey();
				gradeMap.put(employee, modifiedPerformance);				
				break;
			}
		}
		
		// Return the value associated with employeeMap
		Employee modifiedEmployee = employeeMap.get(currentID);
		
		// Replace the ID
		gradeMap.replace(modifiedEmployee, modifiedPerformance);
		
		// Print the modified performance
		System.out.println("Changed " + modifiedEmployee.toString() + modifiedPerformance + "\n");
	}
	
	
	
	
	
	
	

}
