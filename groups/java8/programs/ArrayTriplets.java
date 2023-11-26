package groups.java8.programs;

import java.util.HashSet;

public class ArrayTriplets {

	public static void main(String[] args) {
		
		int arr[] = { 0, -1, 2, -3, 1 };
		findTriplets(arr);

	}

	private static void findTriplets(int[] arr) {
		
		boolean found = false;
		for(int i=0; i<arr.length; i++) {
			
			HashSet<Integer> set = new HashSet<Integer>();
			
			for(int j=i+1; j<arr.length; j++) {
				int x = -(arr[i]+arr[j]);
				if(set.contains(x)) {
					System.out.printf("%d %d %d\n", x, arr[i], arr[j]);
					found = true;
			}
				else
					set.add(arr[j]);
		}
		}
		if(found == false) 
		System.out.println("No Triplets found");
	}

}
