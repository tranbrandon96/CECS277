
public class ExtraCheese extends FoodDecorator
{

	private String pizzaWithExtraCheese()
	{
		return " Extra Cheese";
	}
	
	public ExtraCheese(Food newFood) 
	{
		super(newFood);
	}
	
	public String prepareFood()
	{
		return super.prepareFood() + pizzaWithExtraCheese();
	}
	
	public double foodPrice()
	{
		return super.foodPrice() + 22.50;
	}

}
