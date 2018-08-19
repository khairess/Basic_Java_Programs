package com.jbk;
//import java.util.Scanner;
public class fabonicc_series
{
	public static void main(String args[])
	{
		//Scanner sc=new Scanner(System.in);
		//int limit=sc.nextInt();
		int num=3;
		int[] a=new int[num];
		a[0]=0;
		a[1]=1;
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		for(int i=2;i<num;i++)
		{
			a[i]=a[i-1]+a[i-2];
			System.out.println(a[i]);
		}
		
	}

}
