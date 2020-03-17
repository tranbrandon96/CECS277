package cecs277lab4;
import java.util.ArrayList;

/** Vending Machine Class
 * 
 * @author Brandon Tran
 *
 */


public class VendingMachine 
{
	private ArrayList<Product> products;
	private ArrayList<Product> productNames;
	private Coinset coins;
	private Coinset usersCoins;
	
	double totalBuy = 0;
	double totalChange = 0;
	
	/** Default Constructor
	 * 
	 */
	public VendingMachine()
	{
		products = new ArrayList <Product>();
		productNames = new ArrayList <Product> ();
		coins = new Coinset();
		usersCoins = new Coinset();
	}
	
	public VendingMachine(ArrayList <Product> products, ArrayList <Product> productNames, Coinset coins, Coinset usersCoins)
	{
		this.products = products;
		this.productNames = productNames;
		this.coins = coins;
		this.productNames = productNames;
	}
	
	/** Get the Products Array
	 * 
	 * @return Products
	 */
	public ArrayList <Product> getProducts()
	{
		return products;
	}
	
	/** Get the Products Name of the Array
	 * 
	 * @return Products Name
	 */
	public ArrayList <Product> getProductNames()
	{
		return productNames;
	}
	
	/** Get the Coins Array
	 * 
	 * @return Coins
	 */
	public Coinset getCoins()
	{
		return coins;
	}
	
	/** Get the Users Coins
	 * 
	 * @return Users Coins
	 */
	public Coinset getUsersCoins()
	{
		return usersCoins;
	}
	
	/** Set the Products Array
	 * 
	 * @param products Products
	 */
	public void setProducts(ArrayList <Product> products)
	{
		this.products = products;
	}
	
	/** Set the Products Names Array
	 * 
	 * @param productNames Products Names
	 */
	public void setProductNames(ArrayList <Product> productNames)
	{
		this.productNames = productNames;
	}
	
	/** Set Coins 
	 * 
	 * @param coins Coins
	 */
	public void setCoins(Coinset coins)
	{
		this.coins = coins;
	}
	
	/** Set Users Coins
	 * 
	 * @param usersCoins Users Coins
	 */
	public void setUsersCoins(Coin users)
	{
		usersCoins.addCoin(users);
	}
	
	/** Add the products into productNames ArrayList that will keep track of products in the Vending Machine
	 * 
	 * @param product Product name
	 * @param quantity Quantity size
	 */
	public void addProduct(Product product)
	{
		for(int index = 0; index < product.getQuantity(); index++)
		{
			products.add(product);
		}
		
		for(Product p: productNames)
		{
			if(p.isEqual(product))
				return;
		}
		productNames.add(product);
	}
	
	/** Show the products in the Vending Machine
	 * 
	 */
	public void showProducts()
	{
		if(productNames.isEmpty())
			System.out.println("Vending Machine is Empty!");
		else
			for (int index = 0; index < productNames.size(); index++)
			{
				System.out.println(productNames.get(index).toString());
			}
	}
	
	/** Remove all the coins from the vending machine
	 * 
	 */
	public void removeCoins()
	{
		System.out.println("Removed: $" + coins.getTotalValue());
		System.out.printf("Change: $%.2f", (coins.getTotalValue()) - totalBuy);
		coins.removeAllCoins();
	}
	
	/** Buy products from the vending machine
	 * 
	 */
	public void buyProduct(int index)
	{
		Product productObj = productNames.get(index);
		if(products.contains(productObj)) 
		{
			
			if(productObj.getPrice() <= usersCoins.getTotalValue()) 
			{
				totalBuy += productObj.getPrice();
				products.remove(productObj);
				coins.addAllCoins(usersCoins); 
				usersCoins.removeAllCoins();
				System.out.println("Purchased: " + productObj.toString());
			}
			else
			{
				System.out.println("Insufficient money");
			}
		}
		else
		{
			System.out.println("Product out of stock");
			System.out.println("Amount returned: "+ usersCoins.getTotalValue());
			usersCoins.removeAllCoins();
		}
	}
	
}
