package groups.java8.programs;

public class Swap2Numbers {

	public static void main(String[] args) {
		int x=20;
		int y=30;

		System.out.println("Before Swap: "+x +","+ y);
		x = x+y;
		y = x-y;
		x = x-y;

		System.out.println("After Swap: "+x +","+ y);
	}
}
