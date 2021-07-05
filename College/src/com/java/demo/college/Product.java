package com.java.demo.college;

public class Product {
	private int prodQty;
	private double prodPrice;
	
	public Product(int prodQty, double prodPrice) {
		setProdQty(prodQty);
		setProdPrice(prodPrice);
	}
	
	
	
	public int getProdQty() {
		return prodQty;
	}


	public void setProdQty(int prodQty) {
		if(prodQty>0)
			this.prodQty = prodQty;
		else {
			System.out.println("Invalid Product qty---setting it to --1");
			this.prodQty = 1;
		}
	}

	public double getProdPrice() {
		return prodPrice;
	}



	public void setProdPrice(double prodPrice) {
		if(prodPrice>0) {
			this.prodPrice = prodPrice;
		}else {
			System.out.println("Invalid Product Price--setting it to -- 10.0");
			this.prodPrice = 10.0;
		}
	}



	@Override
	public String toString() {
		return "Product [prodQty=" + prodQty + ", prodPrice=" + prodPrice + "]";
	}
	
	
	
}
