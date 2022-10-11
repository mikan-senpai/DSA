import java.io.*;
class iceCreamParlour {
	public static void main(String[] args) {
		List<Integer> arr = {1, 4, 5, 3, 2};
		iceCreamParlour(arr,6);
	}

	public static List<Integer> iceCreamParlour(int m , List<Integer> arr) {
		List<Integer> ans = new ArrayList<>();

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0 ; i < arr.size() ; i++ ) {
			int key = m - arr.get(i);
			if (map.containsKey(key)) {
				ans.add(i + 1);
				ans.add(map.get(key) - 1);
				break;
			} else {
				map.put(arr.get(i), i);
			}
		}
		ans.sort(null);
		return ans ; 
	}
}