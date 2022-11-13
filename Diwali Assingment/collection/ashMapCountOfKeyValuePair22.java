import java.util.*;

class HashMapCountOfKeyValuePair22{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer, String> m1 = new HashMap<Integer, String>();
		
		m1.put(1, "AAAAAA");
		m1.put(2, "BBBBBB");
		m1.put(3, "CCCCCC");
		m1.put(4, "DDDDDD");
		m1.put(5, "EEEEEE");
		m1.put(6, "FFFFFF");
		m1.put(7, "GGGGGG");
		
		System.out.println("Elements in the hashmap are : ");
		int count = 0;
		
		Set<Map.Entry<Integer, String>> s1 = m1.entrySet();
		
		for(Map.Entry<Integer, String> entry : s1){
		
			System.out.println(entry);
			count++;
		}
		
		System.out.println("Total key-value pairs in the hashmap are : "+count);
	}
}