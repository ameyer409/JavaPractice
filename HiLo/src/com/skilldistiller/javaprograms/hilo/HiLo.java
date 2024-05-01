package com.skilldistiller.javaprograms.hilo;

import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		HiLo hl = new HiLo();
		hl.launch();
	}

	public void launch() {
		int answer = (int) (Math.random() * 20) + 1;
		int guess;
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the High-Low game!");
		System.out.println("You are guessing a number between 1 and 20");
		System.out.println("What is your first guess?: ");
		guess = sc.nextInt();

		do {
			if (guess == answer) {
				System.out.println("That is correct, you win!");
				break;
			} else if (guess < answer) {
				System.out.println("Your guess is too low!");
			} else {
				System.out.println("Your guess is too high!");
			}
			System.out.println("What is your next guess?: ");
			guess = sc.nextInt();
		} while (true);
		
		System.out.println("Thanks for playing!");
		sc.close();
	}

}
