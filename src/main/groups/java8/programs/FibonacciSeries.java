package groups.java8.interviews;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=0,c=1;

		for(int i=0; i<10; i++) {

			a=b;
			b=c;
			c=a+b;

			System.out.println("Fibonacci Series: "+ a);
		}
	}
}
