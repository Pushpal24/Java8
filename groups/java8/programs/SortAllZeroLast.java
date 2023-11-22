package groups.java8.programs;

import java.util.Arrays;

public class SortAllZeroLast {

	public static void main(String[] args) {
		
		int arr[] = {0, 1, 0, 3, 12, 7, 6, 4, 2};
		
		sortAllZeroToLast(arr);

	}

	private static void sortAllZeroToLast(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[j]>arr[i]) {
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++)
		System.out.println(arr[i]);	
	}
}
