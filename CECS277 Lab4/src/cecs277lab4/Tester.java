package cecs277lab4;

/** Tester Class
 * 
 * @author Brandon Tran
 *
 */
public class Tester
{
	public static void main(String[] args)
	{
		VendingMachine vendingmachine = new VendingMachine();
		VendingMachineMenu vendingmenu = new VendingMachineMenu();
		vendingmenu.Menu(vendingmachine);
		
	}
}
