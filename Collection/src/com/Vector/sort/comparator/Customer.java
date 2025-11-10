package com.Vector.sort.comparator;

public class Customer 
{
	private Integer customerNumber;
	private String customerName;
	private Double customerBill;
	
	
	public Integer getCustomerNumber() {
		return customerNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public Double getCustomerBill() {
		return customerBill;
	}
	
	public Customer(Integer customerNumber, String customerName, Double customerBill) {
		super();
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.customerBill = customerBill;
	}
	
	@Override
	public String toString() {
		return "Customer [customerNumber=" + customerNumber + ", customerName=" + customerName + ", customerBill="
				+ customerBill + "]";
	}
	
	
}
