
public interface Calculator 
{
	public RestorePreviousCalculation backupPreviousCalculation();
	public void restorePreviousCalculation(RestorePreviousCalculation memento);
	public int getResult();
	public void setFirstNumber(int firstNumber);
	public void setSecondNumber(int secondNumber);
	
}
