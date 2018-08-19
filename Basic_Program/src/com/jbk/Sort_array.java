package com.jbk;

public class Sort_array 
{
public static void main(String[] args) 
{
	int[] mainarray=new int[]{2,35,4,6,12,55,8,0,-1,7};
	int temp;
	for(int i=0;i<10;i++)
	{
		for(int j=0;j<10;j++)
		{
			if(mainarray[i]<mainarray[j])
			{
				temp=mainarray[i];
				mainarray[i]=mainarray[j];
				mainarray[j]=temp;
			}
		}
	}
	for(int k=0;k<10;k++)
	{
	System.out.println(mainarray[k]);
}
}	
}
