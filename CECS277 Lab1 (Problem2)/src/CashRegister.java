/** Class description for CashRegister
 * @author Brandon Tran
 */
public class CashRegister {
	private double purchasePrice;
	private double paymentAmount;
	
	/** Constructor description of CashRegister and initialization of variables
	 * 
	 */
	public CashRegister()
	{
		purchasePrice = 0.0;
		paymentAmount = 0.0;
	}
	
	/** This method records how much the purchase cost
	 * 
	 * @param purchasePrice This is the total purchase amount
	 */
	public void recordPurchase(double purchasePrice)
	{
		this.purchasePrice = purchasePrice;
	}
	
	/** This method calculates the total currency for the purchase
	 * 
	 * @param currencyCount This is the count of the currency
	 * @param currency This is the value of the currency by calling the MonetaryUnit class
	 */
	public void enterPayment(int currencyCount, MonetaryUnit currency)
	{
		paymentAmount += currencyCount * currency.getCurrencyAmount();
	}
	
	/** This method returns back the change that is given after the purchase was made 
	 * If the purchase is greater, return the payment. Other than that, take the payment amount and subtract the purchase price
	 * @return the calculated total after the payment amount is subtracted from the purchase price
	 */
	public double giveChange()
	{
		if(purchasePrice > paymentAmount)
		{
			System.out.println("You have insufficient funds to purchase!");
			return paymentAmount;
		}
		else	
			return paymentAmount - purchasePrice;
	}
}
