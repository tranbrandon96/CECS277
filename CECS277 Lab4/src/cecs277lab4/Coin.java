package cecs277lab4;
/** Coin Class
 * 
 * @author Brandon Tran
 *
 */
public class Coin 
{
	private double coinValue;
	private String coinName;
	
	/** Default Constructor
	 * 
	 */
	public Coin()
	{
		coinValue = 0;
		coinName = " ";
	}
	
	/** Constructor with multiple parameters
	 * 
	 * @param coinValue Value of the coin
	 * @param coinName Name of the coin
	 */
	public Coin(double coinValue, String coinName)
	{
		this.coinValue = coinValue;
		this.coinName = coinName;
	}
	
	/** Get Coin Value
	 * 
	 * @return Value of the coin
	 */
	public double getCoinValue()
	{
		return coinValue;
	}
	
	/** Get Coin Name
	 * 
	 * @return Name of the coin
	 */
	public String getCoinName()
	{
		return coinName;
	}
	
	/** Set Coin Value
	 * 
	 * @param coinValue Value of the coin
	 */
	public void setCoinValue(double coinValue)
	{
		this.coinValue = coinValue;
	}
	
	/** Set Coin Name
	 * 
	 * @param coinName Name of the coin
	 */
	public void setCoinName(String coinName)
	{
		this.coinName = coinName;
	}
	
	/** Print out the Coin Name and Coin Value
	 * 
	 */
	public String toString()
	{
		return coinName + " @ " + coinValue;
	}
}

