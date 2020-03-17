/** Class description for MonetaryUnit
 * @author Brandon Tran
 */
public class MonetaryUnit {
	private double currencyAmount;
	private String currencyName;
	
	/** Constructor description of MonetaryUnit that has two parameters
	 * @param currencyAmount This is the value of what the currency holds
	 * @param currencyName This is the name of the currency
	 */
	public MonetaryUnit(double currencyAmount, String currencyName)
	{
		this.currencyAmount = currencyAmount;
		this.currencyName = currencyName;
	}
	
	/** This method is assigned to retrieve the currency amount
	 * @return This returns the value of the currency
	 */
	public double getCurrencyAmount()
	{
		return currencyAmount;
	}
	
	/** This method is assigned to retrieve the name of the currency
	 * @return This returns the name of the currency
	 */
	public String getCurrencyName()
	{
		return currencyName;
	}
}
