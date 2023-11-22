package groups.java8.programs;

import java.util.HashMap;

public class ZeroSumSubarray {

	public static void main(String[] args) {
		
		int[] arr = {3,9,-2,4,1,-7,2,6,-5,8,-3,-7,6,2,1};
		int target = 5;
		findZeroSumSubArray(arr, target);
		}

	private static void findZeroSumSubArray(int[] arr, int target) {
		
	int ans = 0;	
//	List<HashMap<Integer, Integer>> list = new ArrayList<HashMap<Integer,Integer>>(); 
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	map.put(0, 1);
	int sum = 0;
	
	for(int i=0; i<arr.length; i++) {
		sum +=arr[i];
		
		if(map.containsKey(sum-target)) {
			ans +=map.get(sum-target);
//			list.add(map);
		}
		map.put(sum, map.getOrDefault(sum, 0)+1);
	}
	System.out.println("Ans: "+ ans);
//	System.out.println("List: "+ map);
	}
}
