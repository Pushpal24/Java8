package groups.java8.programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstCharacterOfEachWord {

	public static void main(String[] args) {
		
		String input = "Geeks for Geeks";
		extractFirstCharacter(input);

	}

	private static void extractFirstCharacter(String input) {
		
		Pattern p = Pattern.compile("\\b[A-Za-z]");
		Matcher m = p.matcher(input);
		while(m.find())
		System.out.printf(m.group());
	}

}
