package com.factory;

public class ObjectFactory {
	
	public  Os getInstace(String os) {
		
		if(os.equals("Android"))
			return new Android();
		else if(os.equals("IOS"))
			return new Ios();
		else
			return new Windows();
	}

}
