package groups.java8.interviews;

public class CharcterCount {

	public static void main(String[] args) {

		String input = "Today is Monday";
		int count =0;
		char[] ch = input.toCharArray();
		int length = ch.length;
		
		for(int i=0; i<length;i++) {
			
			if(ch[i] == ' ') {
				count++;
			}
			else
				continue;
		}
		System.out.println("Total Words: "+ (count+1));
		
	}
}