package com.jbk;

public class CharPresentOnlyOnce {
public static void main(String[] args) {
	String str="sudhir khaire";
	int count;
	for(int i=0;i<=str.length()-1;i++)
	{
		count=0;
		for(int j=0;j<=str.length()-1;j++)
		{
			if(str.charAt(i)==str.charAt(j))
				count++;
				}
		if(count==1)
			System.out.print(str.charAt(i));
		
		
	}
}
}
