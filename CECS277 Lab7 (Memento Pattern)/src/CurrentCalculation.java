
public class CurrentCalculation implements Calculator
{
	private int numberOne;
	private int numberTwo;
	
	public CurrentCalculation()
	{
		numberOne = 0;
		numberTwo = 0;
	}
	public CurrentCalculation(int numberOne, int numberTwo)
	{
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
	}
	
	@Override
	public RestorePreviousCalculation backupPreviousCalculation()
	{
		return new PreviousCalculation(numberOne, numberTwo);
	}
	@Override
	public void restorePreviousCalculation(RestorePreviousCalculation memento) 
	{
		this.numberOne = ((PreviousCalculationOriginator)memento).getNumber1();
		this.numberTwo = ((PreviousCalculationOriginator)memento).getNumber2();
		
	}
	@Override
	public int getResult() 
	{
		return numberOne + numberTwo;
	}
	@Override
	public void setFirstNumber(int firstNumber) 
	{
		numberOne = firstNumber;
		
	}
	@Override
	public void setSecondNumber(int secondNumber) 
	{
		numberTwo = secondNumber;
		
	}
	
	
}
