package com.loginProject.rohit;

public class LinkdIn implements Product{

	public LinkdIn createProduct(){
		System.out.println("LinkdIn account is created");
		return new LinkdIn();
	}
}
