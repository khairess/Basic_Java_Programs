package com.jbk;

public class DataType_Int {
int a=15000;
int b=-20000;
void add()
{
	int c=a+b;
	System.out.println("int value is " +c);
}
}
class MainClass1
{
public static void main(String[] args)
{
DataType_Int obj=new DataType_Int();
obj.add();
}
}