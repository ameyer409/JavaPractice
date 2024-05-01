package com.skilldistiller.javaprograms.fibonaccisequence;

public class FibonacciSequence {

	public static void main(String[] args) {
		FibonacciSequence fs = new FibonacciSequence();
		fs.launch();
	}
	
	public void launch() {
		int num2 = 1;
		int num1 = 0;
		for(int i = 1; i <= 20; i++) {
			int temp;
			if(i == 1) {
				System.out.println(i + ": 0");
			}
			else if (i == 2) {
				System.out.println(i + ": 1");
			}
			else {
				System.out.println(i + ": " + (num1 + num2));
				temp = num1 + num2;
				num1 = num2;
				num2 = temp;
			}
		}
	}

}
