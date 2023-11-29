package groups.java8.programs;

public class InsertString {

	public static void main(String[] args) {
		
		String originalString = "GeeksGeeks"; 
	    String stringToBeInserted = "For"; 
	    int index = 4;
	    
	    insertStringAtIndex(originalString, stringToBeInserted, index);
	}

	private static void insertStringAtIndex(String originalString, String stringToBeInserted, int index) {
		
		
		String newString = "";
		for(int i=0; i<originalString.length(); i++) {
			
			newString+=originalString.charAt(i);
			
			if(i==index) {
				newString+=stringToBeInserted;
			}
		}
		
		System.out.println(newString);
		
	}

}
