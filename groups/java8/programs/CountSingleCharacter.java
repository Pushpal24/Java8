package groups.java8.programs;

public class CountSingleCharacter {

	public static void main(String[] args) {
		
		String input = "My Name is Pushpal";
		
		int count = 0;
		char[] ch = input.toCharArray();
		int length = ch.length;
		
		for(int i=0; i<length; i++) {
			
			if(ch[i] == 'a') {
				count ++;
			}
		}
		
		System.out.println("Frequency of character a is: "+ count);
	}
}
