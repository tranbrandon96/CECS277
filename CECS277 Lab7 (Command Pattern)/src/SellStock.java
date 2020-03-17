
public class SellStock implements Order
{
	private Stock stock;
	private int quantity;
	
	public SellStock(Stock stock, int quantity)
	{
		this.stock = stock;
		this.quantity = quantity;
	}
	@Override
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	@Override
	public int getQuantity()
	{
		return quantity;
	}
	
	public void execute()
	{
		stock.sell(quantity);
	}

}
