package groups.java8.programs;

public class SecondSmallestElementInArray {

	public static void main(String[] args) {
		
		int arr[] = {2,3,7,13,5,14,4,1,9};
		checkForSecondLowestNumber(arr);

	}

	private static void checkForSecondLowestNumber(int[] arr) {
		
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		int thirdMin = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]<min) {
				thirdMin = secondMin;
				secondMin = min;
				min = arr[i];
			}
			else if(arr[i]<secondMin) {
				thirdMin = secondMin;
				secondMin = arr[i];
			}
			else if(arr[i]<thirdMin)
				thirdMin = arr[i];
		}
		System.out.println("Minimun: "+ min);
		System.out.println("SecondMin: "+ secondMin);
		System.out.println("ThirdMin: "+ thirdMin);
	}

}
