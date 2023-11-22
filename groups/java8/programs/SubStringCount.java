package groups.java8.programs;

public class SubStringCount {

	public static void main(String[] args) {
		
		String input = "Pushpal";
		int size = input.length();
		int count = 0;
			
		count = size*(size+1)/2;
		System.out.println(count);	
	}

}
