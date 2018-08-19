package com.jbk;

public class revrsstring 
{
	
	String revstr(String str1)
	{
	//String str="Java by kiran";
	
	int strlen=str1.length()-1;
	char[] charstr=str1.toCharArray();
	char[] charstr1=new char[strlen];
	
	for(int i=strlen, j=0;i>=0 && j<=strlen;i--,j++)
	{
		charstr1[j]=charstr[i];
		//System.out.print(charstr[i]);
	}
	String str=String.valueOf(charstr1);
	return str;
	}
	public static void main(String args[]) {
		revrsstring obj1=new revrsstring();
		String opstr=obj1.revstr("sudhir");
		System.out.println(opstr);
	}
}
