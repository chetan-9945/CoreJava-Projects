package com.equal_hashcode;

public class Employee
{
	
		private int productId;
		private String productName;
		
		public Employee(int productId, String productName)
		{
			super();
			this.productId = productId;
			this.productName = productName;
		}

		public int getProductId() 
		{
			return productId;
		}

		public void setProductId(int productId)
		{
			this.productId = productId;
		}

		public String getProductName() 
		{
			return productName;
		}

		public void setProductName(String productName) 
		{
			this.productName = productName;
		}
		
//		@Override
//		public boolean equals(Object obj)
//		{
//			if(obj instanceof Product)
//			{
//				Product p2 = (Product) obj;
//				
//				if(this.getProductId()==p2.getProductId() && this.getProductName()==p2.getProductName())
//				{
//					return true;
//				}
//				else
//				{
//					return false;
//				}
//			}
//			else 
//			{
//				System.err.println("Comparsion is not possible...");
//				return false;
//			}
//		}
//		
//		@Override
//		public int hashCode()
//		{
//			return this.getProductId();
//		}
		
	}

