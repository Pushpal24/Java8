package groups.java8.programs;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
		
		public static void main(String[] args) {
			
			String input = "MyNameIsPushpal";
			getDistinctCharacterCount(input);

		}

		private static void getDistinctCharacterCount(String input) {
			
			char[] chars = input.toCharArray();
			Map<Character, Integer> charsCount = new HashMap<Character, Integer>();
			for(char c : chars) {
				if(charsCount.containsKey(c)) {
					charsCount.put(c, charsCount.get(c)+1);
				}
				else
					charsCount.put(c, 1);
			}
			
			System.out.println(charsCount);
			
		}

}
