package groups.java8.programs;

public class RecursiveFunction {

	//Print nos 1-100 without loop
	public static void main(String[] args) {
		
		printNumbers1to100(1);

	}

	private static void printNumbers1to100(int n) {
		
		if(n == 100) {
			System.out.println(100);
			return;
		}
		
		System.out.print(n + " ");
		printNumbers1to100(n+1);
		
	}

}
