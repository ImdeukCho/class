package com.dto;

public class Product {
	String name;
	String id;
	int amount;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String name, String id, int amount) {
		super();
		this.name = name;
		this.id = id;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id + ", amount=" + amount + "]";
	}
	

	
}
