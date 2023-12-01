package groups.java8.programs;

public class PrintNosWithoutLoop {

	public static void main(String[] args) {
		
		int n = 100;
		printNos(n);
	}

	private static void printNos(int n) {
		
		if(n>0)
			printNos(n-1);
		System.out.println(n);
		
	}

}
