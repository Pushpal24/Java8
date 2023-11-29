package groups.java8.programs;

public class PrintEvenLengthWords {

	public static void main(String[] args) {
		
		String input = "i am GFG";
		printEvenLengthWords(input);

	}

	private static void printEvenLengthWords(String input) {
		
		
		String[] words = input.split(" ");
		
		for(String str : words) {
			
			if(str.length()%2 == 0) {
				System.out.println(str);
			}
		}
		
	}

}
