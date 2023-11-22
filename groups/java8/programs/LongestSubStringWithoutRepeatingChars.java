package groups.java8.programs;

import java.util.ArrayList;
import java.util.List;

public class LongestSubStringWithoutRepeatingChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int start = 0;
		int end = 0;
		int max_length = 0;
		String input = "abcabcbb";
		
		List<Character> list = new ArrayList<Character>();
		while(end<input.length()) {
			
			if(!list.contains(input.charAt(end))) {
				list.add(input.charAt(end));
				end++;
				max_length = Math.max(max_length, list.size());
			}
			else {
				list.remove(Character.valueOf(input.charAt(start)));
				start++;
			}
		}
		System.out.println("Longest Substring Without Repeating Charascters: "+max_length);
	}

}
