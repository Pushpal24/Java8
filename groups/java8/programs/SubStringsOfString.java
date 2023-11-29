package groups.java8.programs;

import java.util.ArrayList;

public class SubStringsOfString {

	public static void main(String[] args) {
		
		String input = "The cat";
		getSubStringOfString(input);

	}

	private static void getSubStringOfString(String input) {
		 
		ArrayList<String> list = new ArrayList<String>();
		int count = 0;
		int length = input.length();
		for(int i=0; i<input.length(); i++) {
			
			for(int j=i+1; j<=input.length(); j++) {
				
				list.add(input.substring(i, j));
				count = length*(length+1)/2;
			}
		}
	System.out.println(list);	
	System.out.println(count);
		
	}

}
