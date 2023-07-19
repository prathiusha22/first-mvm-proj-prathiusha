package com.fssa.prathiusha.day20.holiday_homework;

public class Product {
	String productname;
	String productimage;
	int price;
	int ratings;
	float quantity;
	
	public String getProductName() {
		return productname;
	}
	public void setProductName(String productname) {//prathiusha
		this.productname = productname;//this.global=local
	}
	
	public String getProductImage() {
		return productimage;
	}
	public void setProductImage(String productimage) {
		this.productimage = productimage;
	}
	public int getProductPrice() {
		return price;
	}
	public void setProductPrice(int price) {
		this.price = price;
	}
	public int getProductRatings() {
		return ratings;
	}
	public void setProductRatings(int ratings) {
		this.ratings = ratings;
	}
	public float getProductQuantity() {
		return quantity;
	}
	public void setProductQuantity(float quantity) {
		this.quantity = quantity;
	}

}
