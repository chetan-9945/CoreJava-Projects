package map.hashmap.InventryManagementSystem;

public record Product(Integer productId,String productName,String category,Double price,Integer quantity,String supplier) 
{
	public Product
	{
		if(productId<=0
		|| productName==null
		|| productName.isBlank()
		|| category==null
		|| category.isBlank()
		|| price<0
		|| quantity <=0
		|| supplier==null
		|| supplier.isBlank()
				)
		{
			throw new IllegalArgumentException("Product Id Must be positive...");
		}
	}
	
	@Override
	public String toString() {
	    return String.format(
	        "PRODUCT => | %-20s | %-15s | %15.2f | %8d | %-15s |",
	        productName, category, price, quantity, supplier
	    );
	}

}
