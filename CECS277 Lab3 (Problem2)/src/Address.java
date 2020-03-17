/** Address Class
 * 
 * @author Brandon Tran
 *
 */
public class Address extends Invoice
{
	private String name;
	private String street;
	private String city;
	private String state;
	private String zip;
	
	public Address()
	{
		
	}
	
	public Address(String name, String street, String city, String state, String zip)
	{
		
	}
	
	public String toString()
	{
		return ("Shipping Address: " + shippingAddress +
				"\nBilling Address: " + billingAddress);
	}
}
