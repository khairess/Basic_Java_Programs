package com.jbk;


class Test

{

static boolean check;

public static void main(String args[])
{
int i;
if(check == true)
i=1;
else
i=2;
if(i==2)
i=i+2;
else 
i=i+4;
System.out.println(i);
System.out.println(check);
}
}
