package groups.java8.programs;

import java.util.Arrays;

public class StringSorting {

	public static void main(String[] args) {
		
		String input = "geeksforgeeks";
		sortString(input);

	}

	private static void sortString(String input) {
		
		char[] chars = input.toCharArray();
		char temp;
		for(int i=0; i<chars.length; i++) {
			
			for(int j=i+1; j<chars.length; j++) {
				
				if(chars[i]>chars[j]) {
					temp = chars[i];
					chars[i]=chars[j];
					chars[j]=temp;
				}
				
			}
		}
		System.out.println("Sorted Array: "+ Arrays.toString(chars));
	}

}
