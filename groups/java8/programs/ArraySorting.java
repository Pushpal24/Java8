package groups.java8.programs;

public class ArraySorting {
	
	public static void main (String[] args) {
		
		int arr[] = {5, 2 , 8, 7, 1};
		
		int temp =0;
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]<arr[j]) {
					
					temp = arr[i];
					arr[i]= arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Printing the elements in descending order");
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+ " ,");
	}

}
