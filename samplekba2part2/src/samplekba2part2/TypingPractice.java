package samplekba2part2;

import java.util.Scanner;

public class TypingPractice {

	public static void typeABC() throws MyException {
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();
		if (!inputString.equals("abc")) {
			throw new MyException("Incorrect input");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean tryAgain = true;
		while(tryAgain){
			try {
				typeABC();
				tryAgain = false;
			} 
			catch (MyException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				tryAgain = true;
			}
		}//close while
	}// close main runner
}// close class
