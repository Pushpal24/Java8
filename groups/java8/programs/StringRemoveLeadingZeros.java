package groups.java8.programs;

public class StringRemoveLeadingZeros {

	public static void main(String[] args) {
		
		String input = "00000123569";
		removeLeadingZeroes(input);

	}

	private static void removeLeadingZeroes(String input) {
		
		System.out.println("Initial String: "+ input);
		String output = "";
		char[] chars = input.toCharArray();
		
		for(char c: chars) {
			if(!(c == '0')) {
				output+=c;
			}
		}
		System.out.println("Final Output: "+output);
	}

}
