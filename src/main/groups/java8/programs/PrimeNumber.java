package groups.java8.interviews;

public class PrimeNumber {

	public static void main(String[] args) {

		int n = 33;
		boolean flag = false;
		for(int i=2; i<n/2; i++) {

			if(n%i==0) {
				flag = true;
				break;
			}
		}
		if(flag)
			System.out.println("It is not a prime number");
		else
			System.out.println("It is a prime number");


	}

}
