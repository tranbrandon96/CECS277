import java.util.Scanner;
import java.util.InputMismatchException;
public class Tester 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("PRODUCT LIST");
		System.out.println("------------------------------------------");
		Stock Apple = new Stock("Apple Stocks", 200);
		Stock Disney = new Stock("Disney Stocks", 300);
		Stock Amazon = new Stock("Amazon Stocks", 400);
		System.out.println(Apple.toString());
		System.out.println(Disney.toString());
		System.out.println(Amazon.toString());
		
		int choice = 0;
		Order b1 = new BuyStock(Apple, 0);
		Order b2 = new BuyStock(Disney, 0);
		Order b3 = new BuyStock(Amazon, 0);
		
		Order s1 = new SellStock(Apple, 0);
		Order s2 = new SellStock(Disney, 0);
		Order s3 = new SellStock(Amazon, 0);
	
		while(choice != 4)
		{
			System.out.println("\n1) Buy Stocks " + 
							   "\n2) Sell Stocks " +
							   "\n3) Current Purchased Stocks" +
							   "\n4) Quit");
			choice = in.nextInt();
			switch(choice)
			{
			case 1:
				System.out.print("What stock would you like to purchase? ");
				System.out.println("\n1) Apple Stocks" + 
								   "\n2) Disney Stocks" +
								   "\n3) Amazon Stocks");
				int stock = in.nextInt();
				switch(stock)
				{
				case 1:
					System.out.print("\nHow much Apple stock would you like to purchase? ");
					int quantity = in.nextInt();
					b1 = new BuyStock(Apple,quantity);
					b1.execute();
					break;
				case 2:
					System.out.print("\nHow much Disney stock would you like to purchase? ");
					quantity = in.nextInt();
					b2 = new BuyStock(Disney,quantity);
					b2.execute();
					break;
				case 3:
					System.out.print("\nHow much Amazon stock would you like to purchase? ");
					quantity = in.nextInt();
					b3 = new BuyStock(Amazon,quantity);
					b3.execute();
					break;
				}
				break;
			case 2:
				
				System.out.print("What stock would you like to sell? ");
				System.out.println("\n1) Apple Stocks" + 
								   "\n2) Disney Stocks" +
								   "\n3) Amazon Stocks");
				stock = in.nextInt();
				switch(stock)
				{
				case 1:
					System.out.print("\nHow much Apple stock would you like to sell? ");
					int quantity = in.nextInt();
					s1 = new SellStock(Apple,quantity);
					if(quantity > b1.getQuantity())
					{
						System.out.print("\nExceeded amount of stock, try again! ");
						quantity = in.nextInt();
						s1 = new SellStock(Apple,quantity);
					}
					s1.execute();
					break;
				case 2:
					System.out.print("\nHow much Disney stock would you like to sell? ");
					quantity = in.nextInt();
					s2 = new SellStock(Disney,quantity);
					if(quantity > b2.getQuantity())
					{
						System.out.print("\nExceeded amount of stock, try again! ");
						quantity = in.nextInt();
						s2 = new SellStock(Apple,quantity);
					}
					s2.execute();
					break;
				case 3:
					System.out.print("\nHow much Amazon stock would you like to sell? ");
					quantity = in.nextInt();
					s3 = new SellStock(Amazon,quantity);
					if(quantity > b3.getQuantity())
					{
						System.out.print("\nExceeded amount of stock, try again! ");
						quantity = in.nextInt();
						s3 = new SellStock(Apple,quantity);
					}
					s3.execute();
					break;
				}
				break;
			case 3:
				System.out.println("Apple Stocks Quantity: " + (b1.getQuantity() - s1.getQuantity()));
				System.out.println("Disney Stocks Quantity: " + (b2.getQuantity() - s2.getQuantity()));
				System.out.println("Amazon Stocks Quantity: " + (b3.getQuantity() - s3.getQuantity()));
				break;
			case 4:
				choice = 4;
				break;
			}
			
		}
		
	}
}
