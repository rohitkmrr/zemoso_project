package com.loginProject.rohit;

public class Google implements Product{

	public Google createProduct(){
		System.out.println("Google account is created");
		return new Google();
	}
}

