/** LineItem Class
 * 
 * @author Brandon Tran
 *
 */
public class LineItem extends Product
{
	private int quantity;
	private double totalPrice;
	private Product product;
	
	public LineItem(Product product, int quantity, double totalPrice)
	{
		this.product = product;
		this.quantity = quantity;
		this.product = product;
	}
	
	
	public void setTotalPrice(double totalPrice,int quantity, Product product)
	{
		this.totalPrice = totalPrice;
		this.quantity = quantity;
		this.product = product;
	}
	

	
	public double getTotalPrice()
	{
		return totalPrice;
	}
	
	public String toString()
	{
		
	}
	
}
