package com.loginProject.rohit;

import java.util.Scanner;

public class Client extends ProductFactory {
	public static void main(String [] args){
		System.out.println("Enter site to open account in");
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println(str);
		ProductFactory proFct= ProductFactory.getinstance();
		Product p=  proFct.createProduct(str);
		if(p==null)
			System.out.println("Not exist");
		
		
	}
}


