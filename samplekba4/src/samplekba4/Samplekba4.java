package samplekba4;

import java.util.ArrayList;
import java.util.Collections;

public class Samplekba4 {


	public static void printUsingLambda() {
		ArrayList<String> names = new ArrayList<>();

		String[] firstName = { "Harold", "Luciano", "Tyree", "Nyla", "Natalie", "Quincy", "Devyn", "Aliana" };

		Collections.addAll(names, firstName);

		// Print every item in the list using lambda expressions.
		names.stream().forEach(e -> System.out.println(e));
		names.stream().forEach(e -> System.out.println(e.toUpperCase()));
		names.stream().forEach(e -> System.out.println(names.indexOf(e) + " " + e));

	}










}


