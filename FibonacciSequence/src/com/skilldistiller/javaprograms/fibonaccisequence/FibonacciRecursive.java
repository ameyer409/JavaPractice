package com.skilldistiller.javaprograms.fibonaccisequence;

import java.util.Scanner;

public class FibonacciRecursive {

	public static void main(String[] args) {
		FibonacciRecursive fr = new FibonacciRecursive();
		fr.launch();
	}
	
	public void launch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sequence number: ");
		int num = sc.nextInt();
		System.out.println("the fibonacci number at place " + num + " is: " + fibonacciNum(num - 1));
	}
	
	public int fibonacciNum(int i) {
		if(i == 0) {
			return 0;
		}
		if (i == 1 || i == 2) {
			return 1;
		}
		else {
			return fibonacciNum(i - 1) + fibonacciNum(i - 2);
		}
	}

}
