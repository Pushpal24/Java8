package groups.java8.interviews;


///// Needs to be looked into
import java.util.HashMap;

public class WordsCount {

	public static void main(String[] args) {
		
		String input = "My name is Pushpal name";
		String[] split = input.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int size = split.length;
		for(int i=0; i<size;i++) {
			
			if(map.containsKey(split[i])) {
				int count = map.get(split[i]);
				map.put(split[i], count+1);
			}
			else
				map.put(split[i], 1);
		}
		
		System.out.println("Count: "+ map);
	}

}
