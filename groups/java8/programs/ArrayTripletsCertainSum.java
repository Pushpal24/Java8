package groups.java8.programs;

import java.util.Arrays;

public class ArrayTripletsCertainSum {

	public static void main(String[] args) {
		
		int[] arr = {1,4, 45, 6, 10, 8};
		int sum = 13;
		findNumbersForSum(arr, sum);

	}

	private static void findNumbersForSum(int[] arr, int sum) {
		
		Arrays.sort(arr);
		System.out.println("Sorted Array: "+Arrays.toString(arr));
		for(int i=0; i<arr.length; i++) {
			
			int left = i+1;
			int right = arr.length-1;
			while(left<right) {
				if(arr[i]+arr[left]+arr[right] == sum) {
					int value = arr[i]+arr[left]+arr[right]; 
					System.out.printf("%d %d %d\n", arr[i], arr[left], arr[right]);
					break;
				}
				else if(arr[i]+arr[left]+arr[right] > sum) {
					int value = arr[i]+arr[left]+arr[right];
					right --;
				}
				else {
					int value = arr[i]+arr[left]+arr[right];
					left++;
				}
			}
		}
		
		
	}

}
