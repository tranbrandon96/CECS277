
public class PartChecker implements Visitor
{

	@Override
	public double visit(Visitable product) 
	{
		if(product instanceof Laptop)
		{
			Laptop laptop = (Laptop) product;
			if(laptop.getModel().equalsIgnoreCase("Microsoft Surface"))
			{
				System.out.println("Since you purchased a Microsoft Surface on Black Friday, here is a 20% discount!");
				laptop.setPrice(laptop.getPrice() * 0.8);
				System.out.println("Updated Price: $" + laptop.getPrice());
			}
			return laptop.getPrice() * laptop.getQuantity();
		}
		
		else if (product instanceof MobilePhone)
		{
			MobilePhone mobilePhone = (MobilePhone) product;
			if (mobilePhone.getModel().equalsIgnoreCase("Apple Phone") && mobilePhone.getPrice() > 400.00)
			{
				System.out.println("Since you purchased an Apple Phone on Black Friday, here is $30 discount!");
				mobilePhone.setPrice(mobilePhone.getPrice() - 30.0);
				System.out.println("Updated Price: $" + mobilePhone.getPrice());
			}
			else if(mobilePhone.getModel().equalsIgnoreCase("Samsung S8") )
			{
				System.out.println("Since you purchased an Samsung S8 on Black Friday, here is a 20% discount!");
				mobilePhone.setPrice(mobilePhone.getPrice() * 0.8);
				System.out.println("Updated Price: $" + mobilePhone.getPrice());
			}
			return mobilePhone.getPrice() * mobilePhone.getQuantity();
		}
		
		else if (product instanceof VideoGame)
		{
			VideoGame videoGame = (VideoGame) product;
			if (videoGame.getModel().equalsIgnoreCase("Sony Playstation"))
			{
				System.out.println("Since you purchased an Sony Playstation on Black Friday, here is 20% discount!");
				videoGame.setPrice(videoGame.getPrice() * 0.8);
				System.out.println("Updated Price: $" + videoGame.getPrice());
			}
			else if (videoGame.getModel().equalsIgnoreCase("Microsoft Xbox One") && videoGame.getQuantity() == 2)
			{
				System.out.println("Since you purchased an Microsoft Xbox One on Black Friday, here is 30% discount!");
				videoGame.setPrice(videoGame.getPrice() * 0.7);
				System.out.println("Updated Price: $" + videoGame.getPrice() * videoGame.getQuantity());
			}
			return videoGame.getPrice() * videoGame.getQuantity();
		}
		return 0;
	}


	
}
