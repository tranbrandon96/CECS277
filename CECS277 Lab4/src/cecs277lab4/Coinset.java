package cecs277lab4;
import java.util.ArrayList;

/** Coinset Class
 * 
 * @author Brandon Tran
 *
 */
public class Coinset
{
	private ArrayList <Coin> set;
	
	/** Default Constructor
	 * 
	 */
	public Coinset()
	{
		set = new ArrayList <Coin>();
	}
	
	/** Constructor with multiple parameters
	 * 
	 * @param set Array List Object
	 */
	public Coinset(ArrayList <Coin> set)
	{
		this.set = set;
	}
	
	/** Add Coins to the Array List
	 * 
	 * @param coin Coin object
	 */
	public void addCoin(Coin coin)
	{
		set.add(coin);
	}
	
	/** Add All Coins to the Array List
	 * 
	 * @param coins ArrayList of coins
	 */
	public void addAllCoins(Coinset coins)
	{
		set.addAll(coins.set);
	}
	
	/** Get the total value of the coins in the vending machine
	 * 
	 * @return Total amount of coins 
	 */
	public double getTotalValue()
	{
		double total = 0.0;
		for (Coin coin : set)
		{
			total += coin.getCoinValue();
		}
		
		return total;
	}
	
	/** Remove all the coins from the vending machine
	 * 
	 */
	public void removeAllCoins()
	{
		set.clear();
	}
	
}
