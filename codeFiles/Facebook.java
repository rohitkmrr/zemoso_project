package com.loginProject.rohit;

public class Facebook implements Product{
	
	public Facebook createProduct(){
		System.out.println("Facebook account is created");
		return new Facebook();
	}
}
