package groups.java8.programs;

import java.util.ArrayList;
import java.util.List;

public class ArrayPosition {

	public static void main(String[] args) {
		
		int arr[] = {0, 1, 0, 3, 12};
		List<Integer> newArr = new ArrayList();

				for(int i=0; i<arr.length; i++){

				if(arr[i] != 0){

				newArr.add(arr[i]);
				}
				}
				int size = arr.length - newArr.size();

				for(int j=0; j<size; j++){

				newArr.add(0); 
				}

				System.out.println("New Array: "+ newArr);

	}

}
