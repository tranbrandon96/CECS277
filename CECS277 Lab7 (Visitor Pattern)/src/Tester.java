import java.util.ArrayList;
import java.util.Scanner;

public class Tester 
{
	public static double calculatePrice(ArrayList<Visitable> myList)
	{
		Visitor visitor = new PartChecker();
		double sum = 0;
		for (Visitable items: myList)
		{
			items.display();
			sum += items.accept(visitor);
		}
		return sum;
	}
	public static void main(String [] args)
	{
		ArrayList<Visitable> myList = new ArrayList<Visitable>();
		Scanner in = new Scanner(System.in);
		
		int choice = 0;

		while(choice != 3)
		{
			System.out.println("1) Buy Product " +
							   "\n2) Total Cost of Shopping Cart" + 
							   "\n3) Quit");

			choice = in.nextInt();
			switch(choice)
			{
			case 1:
				System.out.print("\nWhat product would you like to purchase? ");
				System.out.print("\n1) Laptop" +
								 "\n2) Mobile Phone" +
								 "\n3) Video Game System");
				int product = in.nextInt();
			
				switch(product)
				{
				case 1:
					System.out.println("\n1) Microsoft Surface: $1000.00" + 
									   "\n2) Macbook Pro: $2500.00");
					product = in.nextInt();
					if(product == 1)
					{
						System.out.println("How many Microsoft Surface would you like to purchase? ");
						int quantity = in.nextInt();
						myList.add(new Laptop("Microsoft Surface", 1000.00, quantity));
					}
					
					else if (product == 2)
					{
						System.out.println("How many Macbook Pro would you like to purchase? ");
						int quantity = in.nextInt();
						myList.add(new Laptop("Macbook Pro", 2500.00, quantity));
					}
					break;
				case 2:
					System.out.println("\n1) Apple Phone: $1000.00" + 
							   		   "\n2) Samsung S8: $1000.00");
					product = in.nextInt();
					if(product == 1)
					{
						System.out.println("How many Apple Phone would you like to purchase? ");
						int quantity = in.nextInt();
						myList.add(new MobilePhone("Apple Phone", 1000.00, quantity));
					}
					
					else if (product == 2)
					{
						System.out.println("How many Samsung S8 would you like to purchase? ");
						int quantity = in.nextInt();
						myList.add(new MobilePhone("Samsung S8", 1000.00, quantity));
					}
					break;
				case 3:
					System.out.println("\n1) Sony Playstation: $350.00" + 
					   		   		   "\n2) Microsoft Xbox One: $300.00");
					product = in.nextInt();
					if(product == 1)
					{
						System.out.println("How many Sony Playstation would you like to purchase? ");
						int quantity = in.nextInt();
						myList.add(new VideoGame("Sony Playstation", 350.00, quantity));
					}
					
					else if (product == 2)
					{
						System.out.println("How many Microsoft Xbox One would you like to purchase? ");
						int quantity = in.nextInt();
						myList.add(new VideoGame("Microsoft Xbox One", 300.00, quantity));
					}
					break;
				}
				break;
			case 2:
				double total = calculatePrice(myList);
				System.out.println("\nTotal Price of all items: $" + total);
				break;
			case 3:
				choice = 3;
				break;
			}
		}
			
	}
}
