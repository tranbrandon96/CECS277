/**
 * @author Brandon Tran
 */

import java.util.Scanner; 

/** Class Description of Rational */
public class Rational {
	private int numerator;
	private int denominator;
	
	/** Constructor description of Rational and initialization of variables */
	public Rational()
	{
		numerator = 0;
		denominator = 1;
	}
	
	/** A Constructor that utilizes two parameters to the numerator and denominator 
	 * @param numerator A parameter where the numerator is being replaced with a value
	 * @param denominator A parameter where the denominator is being replaced with a value
	 */
	public Rational(int numerator, int denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	/** This method is assigned to retrieve the numerator
	 * @return numerator This returns an integer value for numerator
	 */
	public int getNumerator()
	{
		return numerator;
	}
	
	/** This method is assigned to retrieve the denominator
	 * @return denominator This returns an integer value for denominator
	 */
	public int getDenominator()
	{
		return denominator;
	}
	
	/** This method changes the value of the numerator to a new value
	 * @param value This is the new value that will be updating the numerator 
	 */
	public void setNumerator(int value)
	{
		numerator = value;
	}
	
	/** This method changes the value of the denominator to a new value
	 * @param value This is the new value that will be updating the denominator
	 */
	public void setDenominator(int value)
	{
		denominator = value;
	}
	
	/** This method is called upon in the main to ask the user for a numerator and denominator */
	public void inputRational() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number for the numerator: ");
		numerator = in.nextInt();
		System.out.print("Enter a number for the denominator: ");
		denominator = in.nextInt();
	}
	
	/** This method converts the numerator and denominator into a string in which it returns the string into a format of numerator/denominator
	 */
	public String toString()
	{
		return numerator + "/" + denominator;
	}
	
	/** This method returns the greatest common denominator 
	 * @param m This is the numerator
	 * @param n This is the denominator
	 * @return This will return the greatest common denominator
	 */
	private int gcd(int m, int n)
	{
		int r;
		while(n != 0)
		{
			r = m % n;
			m = n;
			n = r;
		}
		return m;
	}
	
	/** This method performs addition for two rational numbers
	 * @param r1 This is the first rational number that is given by the user
	 * @param r2 This is the second rational number that is given by the user
	 */
	public void add(Rational r1, Rational r2)
	{
		numerator = r1.numerator * r2.denominator + r2.numerator * r1.denominator;
		denominator = r1.denominator*r2.denominator;
		int GCD= gcd(numerator,denominator);
		numerator = numerator/GCD;
		denominator = denominator/GCD;
	}
	
	/** This method performs subtraction for two rational numbers
	 * @param r This is the value that will be subtracted from
	 * @return This will return the results of subtraction
	 */
	public Rational sub(Rational r)
	{
		int tempNumerator = numerator * r.denominator - denominator * r.numerator;
		int tempDenominator = denominator * r.denominator;
		
		tempNumerator = tempNumerator / gcd(numerator,denominator);
		tempDenominator = tempDenominator / gcd(numerator,denominator);
		return new Rational(tempNumerator, tempDenominator);
	}
	
	/** This method performs multiplication for two rational numbers
	 * @param r1 This is the first rational number that is given by the user
	 * @param r2 This is the second rational number that is given by the user
	 */
	public void mul(Rational r1, Rational r2)
	{
		numerator = r1.numerator * r2.numerator;
		denominator = r1.denominator * r2.denominator;
		
		numerator = numerator / gcd(numerator,denominator);
		denominator = denominator / gcd(numerator, denominator);
	}
	
	/** This method performs division for two rational numbers 
	 * @param R This is the value that will be divided from
	 * @return This will return the results of division
	 */
	public Rational div(Rational R)
	{
		
		int tempNumerator = numerator * R.denominator;
		int tempDenominator = denominator * R.numerator;
		
		int temp = tempNumerator;
		tempNumerator = tempNumerator / gcd(tempNumerator, tempDenominator);
		tempDenominator = tempDenominator / gcd(temp, tempDenominator);
		
		return new Rational(tempNumerator, tempDenominator);
	}
	
	/** This method will perform division as well as display the result as a double
	 * @param r1 This is the first rational number that is given by the user
	 * @param r2 This is the second rational number that is given by the user
	 * @return This will return a double as the result for division instead of the String format numerator/denominator
	 */
	public static double divToDouble(Rational r1, Rational r2)
	{
		Rational r3 = r1.div(r2);
		double n = r3.numerator;
		return n / r3.denominator;
	}
	
	/** This is the main method where it will call all other methods
	 * @param args Empty array of string data type
	 */
	public static void main(String [] args) 
	{
		
		Rational r1 = new Rational();
		Rational r2 = new Rational();
		Rational r3 = new Rational();
		
		System.out.println("For the first Rational number,");
		r1.inputRational();
		System.out.println("\nFor the second Rational number,");
		r2.inputRational();
		
		r3.add(r1, r2);
		System.out.println();
		System.out.println("Addition");
		System.out.println(r1.toString() + " + " + r2.toString() + " = " + r3.toString());
		
		r3 = new Rational();
		r3 = r1.sub(r2);
		System.out.println();
		System.out.println("Subtraction");
		System.out.println(r1.toString() + " - " + r2.toString() + " = " + r3.toString());
		
		r3 = new Rational();
		r3.mul(r1, r2);
		System.out.println();
		System.out.println("Multplication");
		System.out.println(r1.toString() + " * " + r2.toString() + " = " + r3.toString());
		
		r3 = new Rational();
		r3=r1.div(r2);
		System.out.println();
		System.out.println("Division");
		System.out.println(r1.toString() + " / " + r2.toString() + " = " + r3.toString());
		
		double convert = divToDouble(r1, r2);
		System.out.println();
		System.out.println("Real value for Division");
		System.out.println(r1.toString()+" / "+r2.toString()+" = "+ convert);
		
		r1.setNumerator(2);
		r2.setDenominator(5);
		System.out.println();
		System.out.println("Numerator of r1: "+ r1.getNumerator());
		System.out.println("Denominator of r2: "+ r2.getDenominator());
	}
}
