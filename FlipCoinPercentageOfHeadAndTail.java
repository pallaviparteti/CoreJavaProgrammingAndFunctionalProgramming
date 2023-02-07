package com.CoreJavaProgramming;

public class FlipCoinPercentageOfHeadAndTail {
	public static void main ( String args[]) {
		int head = 0, tail =0;
		for(int i =1; i<=100; i++) {
			if(Math.random() < 0.5)
			{
				System.out.println("Head");
				head++;
				double percent = (head/10)*100;
				System.out.println(percent);
				double percentTail = (tail/10)*100;
				System.out.println(percentTail);
			}
			else {
				tail++;
			}

		}

	}
}
