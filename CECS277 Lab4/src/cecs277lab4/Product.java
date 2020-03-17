package cecs277lab4;

/** Product Class
 * 
 * @author Brandon Tran
 *
 */
public class Product 
{
	private double price;
	private String description;
	private int quantity;
	
	/** Default Constructor
	 * 
	 */
	public Product()
	{
		price = 0;
		description = " ";
		quantity = 0;
	}
	
	/** Constructor with multiple parameters
	 * 
	 * @param price Price of the product
	 * @param description Description of the product
	 * @param quantity Quantity of the product
	 */
	public Product(double price, String description, int quantity)
	{
		this.price = price;
		this.description = description;
		this.quantity = quantity;
	}
	
	/** Get Price of the Product
	 * 
	 * @return Price of the product
	 */
	public double getPrice()
	{
		return price;
	}
	
	/** Get Description of the Product
	 * 
	 * @return Description of the product
	 */
	public String getDescription()
	{
		return description;
	}
	
	/** Get Quantity of the Product
	 * 
	 * @return Quantity of the product
	 */
	public int getQuantity()
	{
		return quantity;
	}
	/** Set Price of the Product
	 * 
	 * @param price Price of the product
	 */
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	/** Set Description of the Product
	 * 
	 * @param description Description of the product
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	/** Set Quantity of the Product
	 * 
	 * @param quantity Quantity of the product 
	 */
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	
	/** Compares the product description 
	 * 
	 * @param product Product
	 * @return true or false
	 */
	public boolean isEqual(Product product)
	{
		if(product.description.equals(this.description))
			return true;
		return false;
	}
	
	/** Print out the Description and Price
	 * 
	 */
	public String toString()
	{
		return description + " @ " + price;
	}
	
}
