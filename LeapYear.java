package com.CoreJavaProgramming;

public class LeapYear {

	public static void main ( String args[]) {
		int year = 2020;
		if(year % 400 == 0) {
			System.out.println(year + " Is a leap year ");
			if(year % 4 == 0 && year % 100 != 0) {
				System.out.println( year + " is a leap year");
			}
			else
			{
				System.out.println(year + "Is not a leap year" );
			}
		}

	}
}
