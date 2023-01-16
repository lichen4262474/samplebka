package samplekba3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class sampleKba {

	public static void divide() {
		boolean loopAgain = true;
		while (loopAgain) {
			Scanner input = new Scanner(System.in);
			System.out.println("Put two integers please");
			try {
				int firstNumber = input.nextInt();
				int secondNumber = input.nextInt();
				try {
					System.out.println(firstNumber / secondNumber);
					loopAgain = false;
				} catch (ArithmeticException ae) {
					System.out.println("Please do not use 0");
				}
			} catch (InputMismatchException ie) {
				System.out.println("Please put only integers");
			}
		} // close while
		System.out.println("Done!");
	}// close method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		divide();

	}// close main
}// close class
