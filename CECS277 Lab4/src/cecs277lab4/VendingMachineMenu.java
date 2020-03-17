package cecs277lab4;
import java.util.Scanner;

/** Vending Machine Menu Class
 * 
 * @author Brandon Tran
 *
 */
public class VendingMachineMenu 
{
	private Scanner in;
	private static Coin[] coins = {new Coin(0.05, "Nickel"),
								   new Coin(0.10, "Dime"),
								   new Coin(0.25, "Quarter"),
								   new Coin(1.00, "Dollar")};
	/** Default Constructor
	 * 
	 */
	public VendingMachineMenu()
	{
		in = new Scanner(System.in);
	}
	
	/** Menu for Vending Machine
	 * 
	 * @param user Vending Machine object
	 */
	public void Menu(VendingMachine user)
	{
		String choice = " ";
		
		while(choice != "q")
		{
			
			System.out.println("\nS)how products I)nsert coin B)uy A)dd product R)emove coins Q)uit");
			choice = in.next();
			
			switch(choice)
			{
				// Show products
				case "S":
				case "s":
						user.showProducts();
						break;
				
				// Insert coin
				case "I":
				case "i":
						int ASCII = 65;
						for (int index = 0; index < coins.length; index ++)
						{
							System.out.println((((char) ASCII++) + ") " + coins[index].getCoinName() + " @ " + coins[index].getCoinValue()));
						}
						
						String input = in.next();
						if (input.equals("a") || input.equals("A"))
							user.setUsersCoins(coins[0]);
						else if(input.equals("b") || input.equals("B"))
							user.setUsersCoins(coins[1]);
						else if(input.equals("c") || input.equals("C"))
							user.setUsersCoins(coins[2]);
						else if(input.equals("d") || input.equals("D"))
							user.setUsersCoins(coins[3]);
						else 
							System.out.println("Invalid choice, pick another option.");
						
						break;
					
				// Buy
				case "B":
				case "b":
						ASCII = 65;
						for(int index = 0; index < user.getProductNames().size(); index++)
						{
							System.out.println((char)(ASCII++) +") "+ user.getProductNames().get(index).toString());
						}
						char products = in.next().charAt(0);
						int option = Character.toUpperCase(products) - 65;
						user.buyProduct(option);	
						break;
						
				// Add Product
				case "A":
				case "a":
						System.out.println("Description: ");
						String description = in.next();
						System.out.println("Price: ");
						double price = in.nextDouble();
						System.out.println("Quantity: ");
						int quantity = in.nextInt();
						user.addProduct(new Product(price, description, quantity));
						break;
						
				// Remove coins
				case "R":
				case "r":
						user.removeCoins();
						break;
				
			    // Quit
				case "Q":
				case "q":
						choice = "q";
						break;
						
				// Invalid choice
				default:
						System.out.println("Invalid choice, pick another option.");
						break;
				
			}
		}
	}
}
