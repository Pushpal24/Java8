package groups.java8.programs;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String input = "My name is Pushpal";
		StringBuilder sb = new StringBuilder(input);
		char[] chars = input.toCharArray();
//		for(char c:chars) {
			
			System.out.print(sb.reverse().toString());
//		}
	}

}
