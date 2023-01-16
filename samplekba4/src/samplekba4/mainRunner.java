package samplekba4;

public class mainRunner {

	public static void main(String[] args) {

		TestStaticMethod myTestStaticMethod = new TestStaticMethod() {
		};
		// myTestStaticMethod.methodOne();
		myTestStaticMethod.methodTwo();
		StaticMethods.methodOne();

		Samplekba4.printUsingLambda();

		AddTwoNumbers numbers = (a, b) -> a + b;
		System.out.println(numbers.add(2, 3));

	}// close main
}// close class
