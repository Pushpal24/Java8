package groups.java8.interviews;

import java.util.regex.Pattern;

public class CheckIfVowelPresent {

	public static void main(String[] args) {

		checkIfVowelPresent("Pushpal");

	}

	private static void checkIfVowelPresent(String input) {

		String regex = ".*[aeiou].*";

		if(Pattern.compile(regex).matcher(input).matches()) {
			System.out.println("Vowel is present");
		}
		else
			System.out.println("Vowels are not present");
	}
}
