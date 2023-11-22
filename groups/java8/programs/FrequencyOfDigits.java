package groups.java8.programs;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfDigits {

	public static void main(String[] args) {
		
		int[] arr = {1,4,2,4,5,4};
		checkForNumberFrequency(arr);
	}

	private static void checkForNumberFrequency(int[] arr) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<arr.length; i++) {
			
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else
				map.put(arr[i], 1);
		}
		System.out.println("Frequency Of Numbers: "+map);
		
	}

}
