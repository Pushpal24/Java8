package groups.java8.programs;

import java.util.HashSet;

public class ArrayDuplicate {

	public static void main(String[] args) {
		
		int[] input = {2,3,7,3,5,4,4,1,9};
		removeDuplicates(input);
		checkForDuplicates(input);
		printDuplicates(input);

	}

	private static void printDuplicates(int[] input) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i:input) {
			if(set.add(i)==false)
				System.out.println("Duplicate Value: "+i);
		}
		
	}

	private static void removeDuplicates(int[] input) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i: input) {
			if(set.add(i)==true) {
				set.toArray(); 
			}
		}
		System.out.println(set);
		
	}

	private static void checkForDuplicates(int[] input) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		boolean flag = false;
		for(int i:input) {
			
			if(set.add(i)==false)
				flag = true;
		}
		if(flag == false)
			System.out.println("It doesn't have duplicates");
		else
			System.out.println("It has duplicates");
	}
	
	

}
