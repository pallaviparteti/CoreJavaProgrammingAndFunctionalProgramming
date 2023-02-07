package com.CoreJavaProgramming;

public class FactorOfPrimeNumber {
	public static void primeFactor(int n)
	{ int c =2;
	while( n > 1) {
		if ( n% c == 0) {
			System.out.println(c + " ");
			n /= c ;
		}
		else {
			c++;
		}
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 234;
		primeFactor(n);


	}

}
