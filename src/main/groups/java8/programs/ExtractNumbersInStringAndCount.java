package groups.java8.interviews;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNumbersInStringAndCount {

	public static void main(String[] args) {

		String input = "Wor2ld0Cup2India3";
		
		Pattern pattern = Pattern.compile("[0-9]");
		Matcher matcher = pattern.matcher(input);
		int sum =0;
		
			while(matcher.find()) {
				sum =sum+Integer.parseInt(matcher.group());
		}
			
			System.out.println("Final Sum: "+sum);
	}

}
