import java.util.Scanner;
public class Tester 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int choice = 0;
		do
		{
			System.out.print("========= Food Menu ============ \n");
			System.out.println(" 1. Pepperoni Pizza");
			System.out.println(" 2. Sausage Pizza");
			System.out.println(" 3. Extra Cheese Pizza");
			System.out.println(" 4. Combination Pizza");
			System.out.println(" 5. Exit");
			System.out.println("Enter your choice: ");
			choice = in.nextInt();
			
			switch(choice)
			{
			case 1:
				Food f1 = new Pepperoni((Food) new Pizza());
				System.out.println(f1.prepareFood()); 
				System.out.println( f1.foodPrice());
				break;
			case 2:
				Food f2 = new Sausage((Food) new Pizza());
				System.out.println(f2.prepareFood()); 
				System.out.println( f2.foodPrice());
				break;
			case 3:
				Food f3 = new ExtraCheese((Food) new Pizza());
				System.out.println(f3.prepareFood()); 
				System.out.println( f3.foodPrice());
				break;
			case 4:
				Food f4 = new Pepperoni(new Sausage(new ExtraCheese(new Pizza())));
				System.out.println(f4.prepareFood()); 
				System.out.println( f4.foodPrice());
				break;
			}
		} while (choice != 5);
	}
}
