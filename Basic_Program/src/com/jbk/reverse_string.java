package com.jbk;

public class reverse_string {

	public static void main(String args[])
	{
		String str="java by kiran";
		int strlen=str.length();
		char[] strtemp=str.toCharArray();
		
		System.out.println(strlen);
		//System.out.println(strtemp[0]);
		
		for(int i=strlen-1;i>=0;i--)
		{
			
			System.out.print(strtemp[i]);
		}
		
		
	}
	
}
