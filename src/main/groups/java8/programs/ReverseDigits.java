package groups.java8.interviews;

public class ReverseDigits {
	
	public static void main(String[] args) {
		
		int n = 214455232;
		
		String temp = ""+n;
		
		StringBuilder sb = new StringBuilder(temp);
		
		StringBuilder str = sb.reverse();
		
		System.out.println(str.toString());
		
	}

}
