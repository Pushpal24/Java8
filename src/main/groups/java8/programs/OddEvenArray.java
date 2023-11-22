package groups.java8.interviews;

import java.util.ArrayList;
import java.util.List;

public class OddEvenArray {
	
	public static void main(String[] args) {
		
		int[] arr = {2, 5, 6, 9, 3, 12};
		List<Integer> array = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.println("This is Even");
				array.add(arr[i]);
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==1) {
				System.out.println("This is Odd");
				array.add(arr[i]);
			}
		}
		
		System.out.println(array);
	}

}
