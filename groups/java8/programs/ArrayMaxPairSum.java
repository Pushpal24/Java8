package groups.java8.programs;

public class ArrayMaxPairSum {

	public static void main(String[] args) {

		int[] arr = {12, 34, 10, 6, 40};
		findMaxPairSum(arr);

	}

	private static void findMaxPairSum(int[] arr) {

		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for(int i=0; i<arr.length; i++) {

			if(arr[i]>highest) {
				secondHighest = highest;
				highest = arr[i];

			}
			else if(arr[i]>secondHighest) {
				secondHighest = arr[i];
			}
		}		
		System.out.println("Highest: "+ highest);
		System.out.println("Second Highest: "+ secondHighest);
		System.out.println("Final Sum: "+ (highest+secondHighest));
	}

}
