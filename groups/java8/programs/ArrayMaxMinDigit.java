package groups.java8.programs;

public class ArrayMaxMinDigit {
	
	public static void main(String[] args) {
		
		int arr[] = {2,3,7,13,5,14,4,1,9};
		
		findMinDigit(arr);
		findMaxDigit(arr);
	}

	private static void findMaxDigit(int[] arr) {

		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max)
				max = arr[i];
		}
		
		System.out.println("Max Digit is: "+ max);
	}

	private static void findMinDigit(int[] arr) {
		
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min)
				min = arr[i];
		}
		
		System.out.println("Min Digit is: "+ min);
	}

}
