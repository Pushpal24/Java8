package groups.java8.programs;

public class MaxMinElementInArray {

	public static void main(String[] args) {

		int arr[]={1,423,6,46,34,23,13,53,4};
		
		int max = getMaxElementInArray(arr);
		int min = getMinElementInArray(arr);
		
		System.out.println("Min Element: "+ min);
		System.out.println("Max Element: "+ max);
	}

	private static int getMinElementInArray(int[] arr) {
		
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min)
				min = arr[i];
		}
		
		return min;
		
	}

	private static int getMaxElementInArray(int[] arr) {
		
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max)
				max = arr[i];
		}
		
		return max;
		
	}

}
