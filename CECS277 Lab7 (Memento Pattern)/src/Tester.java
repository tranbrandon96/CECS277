import java.util.Scanner;

public class Tester 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int numberOne;
		int numberTwo;
		Calculator c = new CurrentCalculation();
		
		System.out.println("Please enter two numbers to add: ");
		numberOne = in.nextInt();
		numberTwo = in.nextInt();
		c.setFirstNumber(numberOne);
		c.setSecondNumber(numberTwo);
		System.out.println("Result: " + c.getResult());
		
		RestorePreviousCalculation memento = c.backupPreviousCalculation();
		
		int numberThree;
		int numberFour;
		System.out.println("\nPlease enter two numbers to add: ");
		numberThree = in.nextInt();
		numberFour = in.nextInt();
		c.setFirstNumber(numberThree);
		c.setSecondNumber(numberFour);
		System.out.println("Result: " + c.getResult());
		
		System.out.println("\nPrevious Calculation: ");
		c.restorePreviousCalculation(memento);
		System.out.println(c.getResult());
		
		
	}
}
