import java.lang.*;
import java.util.*;

class HashMapEmpty24{
	
	public static void main(String args[]){
		
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		
		hm1.put(1, "Red");
		hm1.put(2, "Blue");
		hm1.put(3, "Orange");
		hm1.put(4, "Yellow");
		hm1.put(5, "Pink");
		hm1.put(6, "Black");
		hm1.put(7, "Brown");
		hm1.put(8, "White");
		
		if(hm1.isEmpty()){
			
			System.out.println("Hash map is empty");
			
		}
		
		else{
			
			System.out.println("Hash map is not empty");
		}
	}
}