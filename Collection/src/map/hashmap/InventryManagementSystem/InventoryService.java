package map.hashmap.InventryManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class InventoryService 
{
	private HashMap<Integer,Product> inventory;

	public InventoryService()
	{
		super();
		inventory = new HashMap<>();
	}
	
	public void addProduct(Product product)
	{
		if(!(product==null))
		{
		if(inventory.containsKey(product.productId()))
		{
			throw new IllegalArgumentException("Product with this ID already exists");
		}
		else
		{
			inventory.put(product.productId(),product);
			System.out.println("Product Added Successfully....");
			System.out.println("---------------------------------------------");
		}
		}
		else
		{
			throw new IllegalArgumentException("Product Can't be Null");
		}
	}
	
	public Product getProductById(int productId)
	{
	    if(inventory.containsKey(productId))
	    {
	    	return inventory.get(productId);
	    }
	    else
	    {
	    	return null;
	    }
	}
	
	public boolean updateStock(int productId,int newQuantity)
	{
		if(inventory.containsKey(productId))
		{
			if(newQuantity>0)
			{
			inventory.computeIfPresent(productId, (id,p) -> new Product(p.productId(),p.productName(),p.category(),p.price(),newQuantity,p.supplier()));
			return true;
			}
			else
			{
				throw new IllegalArgumentException("Quantity Can't be Negetive or Zero...");
			}
		}
		else
		{
			return false;
		}
	}
	
	public boolean removeProduct(int productId)
	{
		if(inventory.containsKey(productId))
		{
			inventory.remove(productId);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public List<Product> sortProductsByPrice()
	{
		if(!inventory.isEmpty())
		{
		List<Product> product = new ArrayList<Product>(inventory.values());
		Collections.sort(product,(p1,p2)-> Double.compare(p1.price(), p2.price()));
		return product;
		}
		else
		{
			throw new IllegalArgumentException("Product Inventory is Empty...");
		}
	}
	
	public List<Product> sortProductsByName()
	{
		if(!inventory.isEmpty())
		{
		List<Product> product = new ArrayList<Product>(inventory.values());
		Collections.sort(product, (n1,n2)-> n1.productName().compareTo(n2.productName()));
		return product;
		}
		else
		{
			throw new IllegalArgumentException("Product Inventory is Empty...");
		}
	}
	
	public List<Product> sortProductsByCategoryThenPrice()
	{
		if(!inventory.isEmpty())
		{
		List<Product> product = new ArrayList<Product>(inventory.values());
		Collections.sort(product,(p1,p2)->
		{
			int cmp = p1.category().compareTo(p2.category());
			return (cmp!=0) ? cmp : Double.compare(p1.price(), p2.price());
			});
		return product;
		}
		else
		{
			throw new IllegalArgumentException("Product Inventory is Empty...");
		}
	}
	
	public void generateInventoryReport()
	{
		if(!inventory.isEmpty())
		{
			System.out.println("---------------------------------------------");
			inventory.forEach((k,v)->System.out.println(k+" | "+v));
			System.out.println("---------------------------------------------");
		}
		else
		{
			throw new IllegalArgumentException("Product Inventory is Empty...");
		}
	}
}
