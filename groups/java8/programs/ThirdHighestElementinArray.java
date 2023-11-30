package groups.java8.programs;

public class ThirdHighestElementinArray {

	public static void main(String[] args) {
		
		int[] arr = {2, 7, 1, 4, 5, 8};
		getThirdHighestElement(arr);

	}

	private static void getThirdHighestElement(int[] arr) {
		
		int highest = Integer.MIN_VALUE; 
		int secondHighest = Integer.MIN_VALUE; 
		int thirdHighest = Integer.MIN_VALUE;
		for(int i=0; i< arr.length; i++) {
			
			if(arr[i]>highest) {
				
				thirdHighest = secondHighest;
				secondHighest = highest;
				highest = arr[i];
			}
			else if(arr[i]> secondHighest){
				thirdHighest = secondHighest;
				secondHighest = arr[i];
			}
			else if(thirdHighest > arr[i]) {
				thirdHighest = arr[i];
			}
		}
		
		System.out.println("Highest: "+ highest);
		System.out.println("Second Highest: "+ secondHighest);
		System.out.println("Third Highest: "+ thirdHighest);
	}

}
