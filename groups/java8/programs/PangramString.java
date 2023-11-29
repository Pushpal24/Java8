package groups.java8.programs;

// A string is a pangram string if it contains all the character of the alphabets ignoring the case of the alphabets.
public class PangramString {

	public static void main(String[] args) {
		
//		String input = "geekForGeeks";
		String input = "Abcdefghijklmnopqrstuvwxyz";
		if(checkForPangramString(input))
			System.out.println("It is Pangram");
		else
			System.out.println("It is not a Pangram");

	}

	private static boolean checkForPangramString(String input) {
		
		input = input.toLowerCase();
		int length = input.length();
		
		boolean[] present = new boolean[26];
		char[] chars = input.toCharArray();
		
		for(char c:chars) {
			
			if(Character.isLetter(c)) {
				
				int letter = c - 'a';
				present[letter] = true;
			}
		}
		
		for(int i=0; i<length; i++)

			if(!present[i])
				return false;
			else
				return true;
		return false;
	}

}
