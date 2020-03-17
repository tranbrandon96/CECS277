/** Product Class
 * 
 * @author Brandon Tran
 *
 */
public class Product 
{
	private String itemDescription;
	private double unitPrice;
	
	public Product()
	{
		itemDescription = null;
		unitPrice = 0;
	}
	
	public Product(String itemDescription, double unitPrice)
	{
		this.itemDescription = itemDescription;
		this.unitPrice = unitPrice;
	}
	
	public void setItemDescription(String itemDescription)
	{
		this.itemDescription = itemDescription;
	}
	
	public void setUnitPrice(double unitPrice)
	{
		this.unitPrice = unitPrice;
	}
	
	public String getItemDescription()
	{
		return itemDescription;
	}
	
	public double getUnitPrice()
	{
		return unitPrice;
	}
}
