/** Invoice Class
 * 
 * @author Brandon Tran
 *
 */
public class Invoice extends LineItem
{
	Address ADDRESS;
	Product PRODUCT;
	
	
	private 
	
	public Invoice()
	{
		ADDRESS = null;
	}
	
	public Invoice(Address ADDRESS, LineItem LINEITEM, Product PRODUCT)
	{
		this.ADDRESS = ADDRESS;
	}
	
	public void add(Product product, int quantity)
	{
		
	}
	
	public String toString()
	{
		
	}
	
}
