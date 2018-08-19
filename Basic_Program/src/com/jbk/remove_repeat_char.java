package com.jbk;

public class remove_repeat_char 
{

	public static void main(String args[])
	{
		String str="sudheer";
		int strlen=str.length();
		String output = new String();
		//char[] strtemp1=str.toCharArray();
		//char[] strtemp2=str.toCharArray();
		
		System.out.println(strlen);
		//System.out.println(strtemp[0]);
		
		for(int i=0;i<strlen;i++)
		{
			for(int j=0;j<output.length();j++)
			{
			if(str.charAt(i)!=output.charAt(j))
			{
				output = output + str.charAt(i);
			}
			}
		}
		System.out.println(output);
		
	}
	
}
