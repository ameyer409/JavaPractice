package com.skilldistillery.javaprograms.fizzbuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		FizzBuzz fb = new FizzBuzz();
		fb.launch();
	}
	
	public void launch() {
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("fizzbuzz");
			}
			else if(i % 3 == 0) {
				System.out.println("fizz");
			}
			else if(i % 5 == 0) {
				System.out.println("buzz");
			}
			else {
				System.out.println(i);
			}
		}
	}

}

