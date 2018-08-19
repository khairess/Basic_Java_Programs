package com.jbk;

public class DupinArray {
	public static void main(String args[])
	{
		int a[]={1,4,4,5,0,11};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}
	

}
