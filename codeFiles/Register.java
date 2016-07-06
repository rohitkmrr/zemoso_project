package com.loginProject.rohit;

public class  Register extends ProductFactory {
	public Register(){
		m_RegisteredProducts.put("Facebook", new Facebook());
		m_RegisteredProducts.put("twitter", new Twitter());
		m_RegisteredProducts.put("Google", new Google());
		m_RegisteredProducts.put("LinkdIn", new LinkdIn());
		
	}
}
