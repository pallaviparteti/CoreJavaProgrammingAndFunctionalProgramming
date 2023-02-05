package com.CoreJavaProgramming;
import java.util.Scanner;
public class OddEvenNumbers {
 public static void main (String args[]) {
	  System.out.println("Enter number ");
        Scanner scanner = new 	Scanner (System.in);
			 int num = scanner.nextInt();
	  if ( num % 2 == 0) {
		  System.out.println("Enter number is Even");
	  }
	  else {
		  System.out.println("Enter number is Odd");

		  
	  }
 }
}
