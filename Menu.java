/******************************************************************************
Chance Pickett hw7 4/29/24
The purpose of this programming assignment is to give students experience creating and using classes 
using Java’s class inheritance syntax. Your goal is to create a flexible menu-based user interface for 
customers to order meals at “Taco Restaurant”. This restaurant only serves dinner and has three types 
of food items on the menu: appetizers, main courses and desserts. Customers can select any 
combination of food items.
*******************************************************************************/
import java.util.Scanner;
import java.util.ArrayList;

public class Menu 
{
	// Private variable - dynamically sized ArrayList
	private ArrayList<Food> menu;
    
    //Scanner Object
    private Scanner scanner = new Scanner(System.in);
    
	// Constructor
	public Menu()
	{
		menu = new ArrayList<Food>();
	}

	// Add food item to menu
	public void addFood(Food food)
	{
		menu.add(food);
	}

	// Order food item and get price
	public double orderFood(int itemNum)
	{
		//valid item number chosen
		if ((itemNum > 0) && (itemNum <= menu.size()))
		{
			System.out.printf("\tOrdering: %s for $%3.2f\n", menu.get(itemNum-1).getName(), menu.get(itemNum-1).getPrice());
			return menu.get(itemNum-1).getPrice();
		}
		else
			return 0;
	}

	// Print all items on menu
	public void printMenu()
	{
		System.out.println("\t\t+-----------------------+");
		System.out.println("\t\t| Hotdog Restaurant Menu	|");
		System.out.println("\t\t+-----------------------+");
		for (int index = 0; index < menu.size(); index++)
		{
		   System.out.print("Item: " + (index+1) + ") ");
		   menu.get(index).print();
		   System.out.println();
		}
	}
	
	// Main program
	public static void main(String[] args) 
	{
		// Create and print menu
		Menu menu = new Menu();
		menu.addFood( new MainCourse("Veggie Dog Delight", "A plant-based hotdog topped with avocado slices and a splash of vegan mayo", 8.50, true, false));
		menu.addFood( new MainCourse("Frankfurter Fiesta", "A classic beef frank served in a gluten-free bun with jalapeño cheese sauce and crispy onions", 7.25, false, true));
		menu.addFood( new MainCourse("Monster Dog", "Triple meat hotdog with layers of bacon, beef, and pepperoni, smothered in BBQ sauce", 9.75, false, false));
        
        menu.addFood( new Appetizer("Mini Dog Bites", "Bite-sized hotdog rounds, deep-fried and served with a honey mustard dip", 5.99, 4, "hot"));
        menu.addFood( new Appetizer("Chili Dog Nachos", "Crispy tortilla chips topped with hotdog slices, warm chili, melted cheese, and a dollop of sour cream", 6.75, 3, "hot"));
        menu.addFood( new Appetizer("Cold Dog Salad", "Chopped cold hotdogs mixed with diced cucumbers, tomatoes, red onions, and a light vinaigrette dressing", 4.99, 2, "cold"));
        
        menu.addFood( new Dessert("Hotdog Bun Bread Pudding", "Sweet bread pudding made from leftover hotdog buns, soaked in vanilla custard and sprinkled with cinnamon", 3.99, 350, false));
        menu.addFood( new Dessert("Caramel Dog Delight", "Hotdog slices dipped in caramel and rolled in crushed peanuts, served chilled", 5.50, 450, true));
        menu.addFood( new Dessert("Banana Dog Split", "A playful twist on the classic banana split where a banana is served in a hotdog bun, topped with ice cream, chocolate syrup, and cherries", 6.25, 520, false));
        
		menu.printMenu();

		// Get user input
		double totalFoodPrice = 0;
		System.out.println("What would you like to order? (Enter -1 to exit)");
		int input;
		
		while (true){
		    input = menu.scanner.nextInt();
		    if (input == -1){
		        break;
		    }
		    
		    double price = menu.orderFood(input);
		    totalFoodPrice += price;
		}

		
		// Print bill for meal
		double taxPercent = 0.1;
		double tax = totalFoodPrice * taxPercent;
		double total = totalFoodPrice + tax;
		
		System.out.println("Bill\nFood cost: " + totalFoodPrice + "\nSales tax: " + tax + "\nTotal price: "+ total);
		
		
	}
}
