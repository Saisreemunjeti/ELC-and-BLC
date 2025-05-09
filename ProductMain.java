package com.elc.blc;

public class ProductMain {

	public static void main(String[] args) {
		Product obj=new Product();
		obj.setProductDetails("Laptop", 501, 76500.0);
		String res=obj.getProductDetails();
		System.out.println(res);
		

	}

}
