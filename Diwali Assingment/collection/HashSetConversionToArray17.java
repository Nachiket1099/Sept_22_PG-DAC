import java.lang.*;
import java.util.*;

class HashSetConversionToArray17{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		HashSet<String> l1 = new HashSet<String>();
		
		l1.add("Red");
		l1.add("Blue");
		l1.add("Black");
		l1.add("Brown");
		l1.add("Yellow");
		l1.add("Orange");
		
		System.out.println("Original hash Set is : ");
		for(String x : l1){
			
			System.out.print(x+" ");
		}
		
		System.out.println();
		
		l1.toArray();
		
		System.out.println("Array is : ");
		for(String x : l1){
			
			System.out.print(x+" ");
		}
		
	}
}