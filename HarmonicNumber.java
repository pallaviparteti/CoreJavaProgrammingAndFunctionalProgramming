package com.CoreJavaProgramming;
import java.util.Scanner;
public class HarmonicNumber {
public static void main (String args[]) {
	System.out.println("Enter n number");
	Scanner scanner = new Scanner(System.in);
	int num = scanner.nextInt();
	int n = 0;
	System.out.println("The harmonic series is : ");
	double result = 0.0;
      while( num > 0) {
		result = result + (double) + 1 / num;
		num--;
		System.out.println(result + " ");	
	}
	System.out.println(" ");
	System.out.println("The harmonic series is : " + result);
}
}
