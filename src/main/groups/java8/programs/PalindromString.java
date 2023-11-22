package groups.java8.interviews;

public class PalindromString {

	public static void main(String[] args) {

		String input = "pushpal";
		String reverse = "";
		for (int i = input.length()-1; i>=0; i--) {
			reverse = reverse + input.charAt(i);
		}
		
		if(reverse.equalsIgnoreCase(input))
			System.out.println("It is a palindrome string");
		else
			System.out.println("It is not a palindrome string");
	}

}
