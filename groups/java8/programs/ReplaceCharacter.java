package groups.java8.programs;

public class ReplaceCharacter {

	public static void main(String[] args) {
		
		String input = "Geeks Gor Geeks";
		int index = 6;
		char ch = 'F';
		replaceCharAtIndex(input, index, ch);

	}

	private static void replaceCharAtIndex(String input, int index, char ch) {
		
		StringBuilder stringBuilder = new StringBuilder(input);
		
		stringBuilder.setCharAt(index, ch);
		
		System.out.println("Initial String: "+ input);
		System.out.println("Final String: "+stringBuilder.toString());
		
	}

}
