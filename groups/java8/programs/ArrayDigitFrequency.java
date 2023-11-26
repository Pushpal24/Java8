package groups.java8.programs;

import java.util.HashMap;
import java.util.Map;

public class ArrayDigitFrequency {

	public static void main(String[] args) {
		
		int[] arr = {2,7,4,6,8,2,15,16,18,2};
		int digit = 2;
		checkFrequencyOfDigitInArray(arr, digit);
		checkFrequencyOfAllElements(arr);

	}

	private static void checkFrequencyOfAllElements(int[] arr) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<arr.length;i++) {
			
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else
				map.put(arr[i], 1);
		}
		
		System.out.println("Frequency of the elements: "+map);
	}

	private static void checkFrequencyOfDigitInArray(int[] arr, int digit) {
		
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == digit)
				count++;
		}
		
		System.out.println("The digit: "+digit+" is present "+ count + " times");
		
	}

}
