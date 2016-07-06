package com.loginProject.rohit;

public class Twitter implements Product{

	public Twitter createProduct(){
		System.out.println("Twitter account is created");
		return new Twitter();
	}
}