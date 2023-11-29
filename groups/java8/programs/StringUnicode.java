package groups.java8.programs;

public class StringUnicode {

	public static void main(String[] args) {
		
		String input = "Java";
		int index = 0;
		getUnicode(input, index);

	}

	private static void getUnicode(String input, int index) {
		
		int unicode = input.codePointAt(index);
		
		System.out.println("Unicode is: "+ unicode);
		
	}

}
