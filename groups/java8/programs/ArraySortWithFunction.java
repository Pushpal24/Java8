package groups.java8.programs;

import java.util.Arrays;

public class ArraySortWithFunction {

	public static void main(String[] args) {

		int[] arr = {1,23,0,24,56,0,12,0};


				Arrays.sort(arr);
		int temp = 0;
//		for(int i=0; i<arr.length;i++) {
//
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i]>arr[j]) {
//					temp = arr[i];
//					arr[i]=arr[j];
//					arr[j]= temp;
//				}
//			}
//		}

//		for(int i=0; i<arr.length;i++) 

//			System.out.println(arr[i]);

		System.out.println(Arrays.toString(arr));
	}

}
