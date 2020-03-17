
public class PreviousCalculation implements RestorePreviousCalculation, PreviousCalculationOriginator
{
	private int firstNumber;
	private int secondNumber;
	
	public PreviousCalculation(int firstNumber, int secondNumber)
	{
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	
	@Override
	public int getNumber1() 
	{

		return firstNumber;
	}

	@Override
	public int getNumber2() 
	{
		
		return secondNumber;
	}

}
