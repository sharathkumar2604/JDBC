package com.xworkz.yjuiy;

public class Number {
	
	int a;
	int b;
	
	int sum(int c,int d)
	{
	 a=c;
	 b=d;
	 System.out.println(c+" "+d);
	 return a+b;
	}
	public static void main(String[] args) {
		Number n = new Number();
		
		System.out.println(n.sum(10, 20));
		
		
	}

}
