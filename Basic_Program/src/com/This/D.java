package com.This;

public class D extends C {
//int a=40;
void m1()
{
	//int a=50;
	System.out.println("This is java by kiran class");
	System.out.println(a);
	System.out.println(this.a);
	System.out.println(super.a);
	B b=new B();
	System.out.println(b.a);
	A a1=new A();
	System.out.println(a1.a);
}
public static void main(String[] args)
{
	D b=new D();
	b.m1();
}
}
