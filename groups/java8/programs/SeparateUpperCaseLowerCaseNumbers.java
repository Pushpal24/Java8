package groups.java8.programs;

public class SeparateUpperCaseLowerCaseNumbers {

	public static void main(String[] args) {

		String input = "MyNameIsPushpal2406";
		
		char[] chars = input.toCharArray();
		StringBuilder sbUpper = new StringBuilder();
		StringBuilder sbLower = new StringBuilder();
		StringBuilder sbNumber = new StringBuilder();
		for(char c:chars) {
			if(Character.isUpperCase(c)) {
				sbUpper.append(c);
			}
			else if(Character.isLowerCase(c)) {
				sbLower.append(c);
			}
			else if(Character.isDigit(c)) {
				sbNumber.append(c);
				
			}
		}
		StringBuilder strings = new StringBuilder("MADABC");
		System.out.println("Output: "+ strings.reverse());
		
		System.out.println("Upper Case: "+ sbUpper.toString());
		System.out.println("Lower Case: "+ sbLower.toString());
		System.out.println("Reverse : "+sbLower.reverse());
		System.out.println("Numbers: "+ sbNumber.toString());
	}

}