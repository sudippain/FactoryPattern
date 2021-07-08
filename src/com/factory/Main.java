package com.factory;

public class Main {
	
	public static void main(String[] args) {
//		Os o = new Android();
//		o.spec();
		
		//Insted of making each class object we use ObjectFactory class to create object
		ObjectFactory obj1 = new ObjectFactory();
		obj1.getInstace("Android").spec();
		obj1.getInstace("IOS").spec();
		obj1.getInstace("Anything").spec();
		
	}

}
