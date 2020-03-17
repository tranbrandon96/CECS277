
public class Pepperoni extends FoodDecorator
{

	private String pizzaWithPepperoni()
	{
		return " Pepperoni";
	}
	
	public Pepperoni(Food newFood) 
	{
		super(newFood);
	}
	
	public String prepareFood()
	{
		return super.prepareFood() + pizzaWithPepperoni();
	}
	
	public double foodPrice()
	{
		return super.foodPrice() + 20.00;
	}

}
