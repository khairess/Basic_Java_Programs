package com.jbk;

public class TestString {
	String str="Welcome to Java by Kiran";
	char[] chars=str.toCharArray();
	char tempchar;
	int count=0;
	void test()
	{
	
	//int count=0;
	for(int i=0;i<=chars.length-1;i++)
	{
		for(int j=0;j<chars.length-1;j++)
		{
			if(i!=j)
			{
		if(str.charAt(i)==str.charAt(j))
		{
			tempchar=str.charAt(i);
			System.out.print(tempchar);
			//System.out.println(str.charAt(j));
		}
		else
		{
			char tempchar1=str.charAt(i);
			System.out.print(tempchar1);
		}
		}
		
		}
	}
	}
	void test1()
	{
		System.out.println("String length with space"+chars.length);
		for(int p=0;p<chars.length;p++)
		{
			System.out.print(str.charAt(p));
		}
		System.out.println();
		for(int q=chars.length-1;q>=0;q--)
		{
			System.out.print(str.charAt(q));
		}
		System.out.println();
		for(int r=0;r<chars.length;r++)
		{
			if(str.charAt(r)==' ')
				count++;
		}
		System.out.println("String length without space" +(chars.length-count));
		
	}
	 
public static void main(String args[]) {
	
	
	TestString obj1=new TestString();
	//TestString obj2=new TestString();
	obj1.test();
	//obj2.test1();
}
}
