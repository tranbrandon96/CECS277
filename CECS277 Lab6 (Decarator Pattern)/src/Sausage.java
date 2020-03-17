
public class Sausage extends FoodDecorator

{

	private String pizzaWithSausage()
	{
		return " Sausage";
	}
	
	public Sausage(Food newFood) 
	{
		super(newFood);
	}
	
	public String prepareFood()
	{
		return super.prepareFood() + pizzaWithSausage();
	}
	
	public double foodPrice()
	{
		return super.foodPrice() + 25.00;
	}

}
