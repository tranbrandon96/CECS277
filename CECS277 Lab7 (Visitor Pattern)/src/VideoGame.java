
public class VideoGame implements Visitable
{
	private String model;
	private double price;
	private int quantity;
	
	/** Type Conversion Constructor
	 * 
	 * @param model Laptop model
	 * @param price Laptop price
	 * @param quantity Laptop Price
	 */
	public VideoGame(String model, double price, int quantity)
	{

		this.model = model;
		this.price = price;
		this.quantity = quantity;
	}
	
	/** Get Laptop Model
	 * 
	 * @return Laptop Model
	 */
	public String getModel()
	{
		return model;
	}
	
	/** Get Laptop Price
	 * 
	 * @return Laptop Price
	 */
	public double getPrice()
	{
		return price;
	}
	
	/** Get Laptop Quantity
	 * 
	 * @return Laptop Quantity
	 */
	public int getQuantity()
	{
		return quantity;
	}
	
	/** Set Laptop Price
	 * 
	 */
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	/** Accept the updated price
	 * 
	 */
	@Override
	public double accept(Visitor visitor) 
	{
		return visitor.visit(this);
		
	}
	
	/** Display the Laptop
	 * 
	 */
	public void display()
	{
		System.out.println("\nModel: " + model + 
						   "\nPrice: " + price + 
						   "\nQuantity: " + quantity);
	}

}
