package groups.java8.programs;

public class StringReplace {
	
	public static void main(String[] args) {
		
		String str = "My Name is Pushpal";
		 String s = "";           
	        // Iterate over each character of the string
	        for (int i = 0; i < str.length(); ++i) 
	        {       
	            // If a space encounters then replace it with -
	            if (str.charAt(i) == ' ')  
	                s += "??";               
	            else
	                s += str.charAt(i);               
	        }
	        
	        System.out.println("String is: "+ s);
	}

}
