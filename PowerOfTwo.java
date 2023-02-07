package com.CoreJavaProgramming;

public class PowerOfTwo {
	public static void main(String args[]) {
		int a , b=2;
		int n = Integer.parseInt(args[0]);
		for(a = 1; a <= n; a++)
		{
			b = b * a;

		}
		System.out.println("Power of the 2 : " + b);
	}

}
