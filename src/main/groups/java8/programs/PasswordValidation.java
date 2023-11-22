package groups.java8.interviews;

import java.util.regex.Pattern;

public class PasswordValidation {

	public static void main(String[] args) {
		
		String input = "AS2ee&uw@";
		checkPasswordValidation(input);

	}

	private static void checkPasswordValidation(String input) {
		
		String regex = "[a-zA-Z0-9$&+,:;=?@#|'<>.-^*()%!]*";
		boolean pattern = false;
		pattern =  Pattern.compile(regex).matcher(input).matches(); 
		if(pattern)
			System.out.println("All the conditions are validated");
		else
			System.out.println("All the conditions are not validated");
		
	}

}
