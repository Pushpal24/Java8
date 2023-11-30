package groups.java8.programs;

public class EvenOddArrayElements {

	public static void main(String[] args) {
		
		int[] arr = {2,3,7,13,5,14,4,1,9};
		
		printEvenElements(arr);
		printOddElements(arr);

	}

	private static void printOddElements(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
		
			if(i%2 != 0)
				System.out.println("Odd Elements: "+arr[i]);
		}	
	}

	private static void printEvenElements(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			if(i%2 == 0)
				System.out.println("Even Elements: "+arr[i]);
		}
		
	}

}
