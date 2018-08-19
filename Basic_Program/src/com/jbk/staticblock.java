package com.jbk;

public class staticblock {
staticblock()
{
	System.out.println("This is constructor");
}
{
	System.out.println("Non Static");
}
static{
	System.out.println("Static 0");
	int a=10;
	System.out.println(a);
}

static
{
	System.out.println("Static 1");
}

public static void main(String[] args) {
	staticblock s=new staticblock();
	staticblock s1=new staticblock();
	
}
}
