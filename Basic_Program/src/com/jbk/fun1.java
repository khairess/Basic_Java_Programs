package com.jbk;

public class fun1 {

	public static void main(String args[])
	{
		System.out.println(fun());
	}
	
	static int fun() // require static b'coz main is static method [Cannot make a static reference to the non-static method fun() from the type fun71]
	{
		return 20;
	}
}
