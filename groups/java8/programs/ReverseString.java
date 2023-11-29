package groups.java8.programs;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String input = "My name is Pushpal";
		char[] chars = input.toCharArray();
		String output = "";
		for(int i=chars.length-1;i>=0;i--) {
			output+=chars[i];
		}
		
		System.out.println("Output: "+ output);
	}

}
