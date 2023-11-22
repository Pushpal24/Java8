package groups.java8.programs;
//String s = "ab@#23CD$&56"
//abCD
//@#$&
//79
public class SplitString {
	
	public static void main(String[] args) {
		
		StringBuffer num = new StringBuffer();
		String num1 = "";
		StringBuffer alpha = new StringBuffer();
		StringBuffer special = new StringBuffer();
		String input = "ab@#23CD$&56";
		
		for(int i=0; i<input.length(); i++) {
			
			if(Character.isDigit(input.charAt(i))) {
				num.append(input.charAt(i));
				num1  = num1 + input.charAt(i);
				
			}
			else if(Character.isAlphabetic(input.charAt(i))) {
				alpha.append(input.charAt(i));
			}
			else
				special.append(input.charAt(i));
		}
		
		System.out.println("Alpha: "+ alpha);
		System.out.println("Number: "+ num);
		System.out.println("NumberString: "+ num1);
		System.out.println("Special: "+ special);
		
		int a = Integer.parseInt(num.substring(0, 2));
		int b = Integer.parseInt(num.substring(2, 4));
		
		int sum = a+b;
		
		System.out.println("Total Sum: "+ sum);
	}

}
