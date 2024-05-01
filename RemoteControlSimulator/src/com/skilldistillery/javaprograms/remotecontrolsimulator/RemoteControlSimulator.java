package com.skilldistillery.javaprograms.remotecontrolsimulator;

import java.util.Scanner;

public class RemoteControlSimulator {

	public static void main(String[] args) {
		RemoteControlSimulator rcs = new RemoteControlSimulator();
		rcs.launch();
	}

	public void launch() {
		Scanner sc = new Scanner(System.in);
		String input = null;
		boolean on = false;
		System.out.println("To begin, turn on the remote control:");

		while (!on) {
			input = sc.nextLine();
			if (input.equals("ON") || input.equals("on")) {
				System.out.println("TURNING ON...");
				on = true;
			}
		}

		while (on) {
			System.out.println("Enter the button you want to press: ");
			input = sc.nextLine();
			if(input.equals("OFF") || input.equals("off")) {
				System.out.println("TURNING OFF...");
				break;
			}
			if(input.equals("0") || input.equals("1")  || input.equals("2") || input.equals("3") || input.equals("4") 
					|| input.equals("5") || input.equals("6") || input.equals("7") || input.equals("8") || input.equals("9") ) {
				buttonPress();
			}
			else {
				System.out.println("Command not recognized");
			}
		}
		
		sc.close();
	}

	public void buttonPress() {
		System.out.println("BOOP!");
	}

}
