import java.io.*;
class missingNumbers{
	public static void main(String[] args) {
		List<Integer> arr = {203,204,205,206,207,208,203,204,205,206};

		List<Integer> brr = {203,204,204,205,206,207,205,208,203,206,205,206,204};
		missingNumbers(arr,brr);
	}
	
	public static List<Integer> missingNumbers(List<Integer> arr , List<Integer> brr){
		List<Integer> result = new ArrayList<>();
		Map<Integer,Integer> map = new HashMap<>();

		for (Integer val : brr ) {
			map.put(val,map.getOrDefault(val,0)-1);
		}

		for (Integer val : arr ) {
			if (map.containsKey(val)) {
				map.put(val,map.getOrDefault(val,0) -1 );
			}
		}
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>0){
                result.add(entry.getKey());
            }
        }
        return result;

	}
}