package groups.java8.programs;

public class Swap2Strings {

	public static void main(String[] args) {


		String a = "Good";
		String b = "Morning";

		a = a + b;
		System.out.println("Total String: "+ a);
		b = a.substring(0, (a.length()-b.length()));
		System.out.println("Second Word: "+b);
		a = a.substring(b.length());
		System.out.println("First Word: "+a);
		System.out.println("After Swapping: "+a +" "+ b);
	}

}
