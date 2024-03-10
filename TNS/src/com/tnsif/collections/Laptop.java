package com.tnsif.collections;

public class Laptop implements Comparable<Laptop>{
	
	private String brand;
	private int price;
	private int Thanesh;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getThanseh() {
		return Thanesh;
	}
	public void setThanesh(int thanesh) {
		this.Thanesh = thanesh;
	}
	public Laptop(String brand, int price, int ram) {
		super();
		this.brand = brand;
		this.price = price;
		this.Thanesh = Thanesh;
	}
	
	
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", thanesh=" + Thanesh + "]";
	}
	@Override
	public int compareTo(Laptop o) 
	{
		if(this.getPrice()>o.getPrice())
		return 1;
	
	else {
		return -1;
	}
	
	}
}




