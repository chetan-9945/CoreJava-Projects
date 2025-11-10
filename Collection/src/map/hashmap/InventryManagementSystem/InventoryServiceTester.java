package map.hashmap.InventryManagementSystem;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class InventoryServiceTester
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		InventoryService inventoryService = new InventoryService();
		
		while(true)
		{
		System.out.print(
				"""
				1. Add Product 
				2. View Product
				3. Update Stock
				4. Remove Product
				5. Sort Product
				6. View All Products
				7. Exit.
				   Enter the Choice    :- 
				"""
				);
		int choice = Integer.parseInt(sc.nextLine());
		try {
		switch(choice)
		{
		
		case 1 :
			System.out.print("Enter the Product Id :-");
			int productId = Integer.parseInt(sc.nextLine());
			System.out.print("Enter the Product Name :-");
			String productName = sc.nextLine();
			System.out.print("Enter the category :-");
			String category = sc.nextLine();
			System.out.print("Enter the price :-");
			double price = Double.parseDouble(sc.nextLine());
			System.out.print("Enter the quantity :-");
			int quantity= Integer.parseInt(sc.nextLine());
			System.out.print("Enter the Supplier :-");
			String Supplier = sc.nextLine();
			inventoryService.addProduct(new Product(productId,productName,category,price,quantity,Supplier));
		break;
		
		case 2:
			System.out.print("Enter the Product Id : ");
			productId = Integer.parseInt(sc.nextLine());
			Product productById = inventoryService.getProductById(productId);
			System.out.println("Product Id : | Product Name\tCategory\tPrice\tQuantity\tSupplier");
			System.out.println(productById);
			System.out.println("---------------------------------------------");
			break;
			
		case 3:
			System.out.print("Enter the Product Id :-");
			productId = Integer.parseInt(sc.nextLine());
			System.out.print("Enter the new Stock :");
			quantity= Integer.parseInt(sc.nextLine());
			if(inventoryService.updateStock(productId, quantity))
			{
				System.out.println("Successfully Stock Updated...");
				System.out.println("---------------------------------------------");
			}
			else
			{
				System.out.println("product is Not Available!");
				System.out.println("---------------------------------------------");
			}
			break;
			
		case 4: 
			System.out.print("Enter the Product Id :-");
			productId = Integer.parseInt(sc.nextLine());
			if(inventoryService.removeProduct(productId))
			{
				System.out.println("Product successfully remove...");
				System.out.println("---------------------------------------------");
			}
			else
			{
				System.out.println("Product Not removed..");
				System.out.println("---------------------------------------------");
			}
			break;
			
		case 5:
			System.out.println(
					"""
								Sorting Product Based on 
								1. Price
								2. Name
								3. Category And Price
								   Enter the choice :-
					"""
					);
			int sortOp = Integer.parseInt(sc.nextLine());
			switch(sortOp)
			{
			case 1: 
				List<Product> sortProductsByPrice = inventoryService.sortProductsByPrice();
				Iterator<Product> itr = sortProductsByPrice.iterator();
				System.out.println("Product Id : | Product Name\tCategory\tPrice\tQuantity\tSupplier");
				itr.forEachRemaining(p -> System.out.println(p));
				System.out.println("---------------------------------------------");
				break;
				
			case 2:
				List<Product> sortProductsByName = inventoryService.sortProductsByName();
				Iterator<Product> itr1 = sortProductsByName.iterator();
				System.out.println("Product Id : | Product Name\tCategory\tPrice\tQuantity\tSupplier");
				itr1.forEachRemaining(p -> System.out.println(p));
				System.out.println("---------------------------------------------");
				break;
				
			case 3:
				List<Product> sortProductsByCategoryThenPrice = inventoryService.sortProductsByCategoryThenPrice();
				Iterator<Product> itr2 = sortProductsByCategoryThenPrice.iterator();
				System.out.println("Product Id : | Product Name\tCategory\tPrice\tQuantity\tSupplier");
				itr2.forEachRemaining(p -> System.out.println(p));
				System.out.println("---------------------------------------------");
				break;
			}
			break;
			
		case 6:
			System.out.println("Product Id : | Product Name\tCategory\tPrice\tQuantity\tSupplier");
			inventoryService.generateInventoryReport();
			break;
			
		case 7: 
			System.out.println("Thank you for Using...");
			System.out.println("---------------------------------------------");
			System.out.println("---------------------------------------------");
			sc.close();
			System.exit(0);
		}
			}
			catch(Exception e )
			{
					System.out.println(e.getMessage());
					System.out.println("---------------------------------------------");
			}
		}
	}		
}
