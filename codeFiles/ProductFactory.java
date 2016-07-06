package com.loginProject.rohit;

import java.util.HashMap;

public  class ProductFactory {
	private static ProductFactory instance= new ProductFactory();
	
	protected static HashMap<String, Product> m_RegisteredProducts = new HashMap<String, Product>();
	
	public Product createProduct(String productID){
		Product pro=null;
		Register r=new Register();
		System.out.println("Reached upto here");
		
		pro=((Product)m_RegisteredProducts.get(productID)).createProduct();
		if(pro==null)
			System.out.println("Not exist");
		return pro;
	}

	public static ProductFactory getinstance() {
		// TODO Auto-generated method stub
		return instance;
		
	}
}


