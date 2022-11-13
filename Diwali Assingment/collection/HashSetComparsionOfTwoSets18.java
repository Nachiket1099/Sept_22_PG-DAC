import java.lang.*;
import java.util.*;

class HashSetComparsionOfTwoSets18{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		HashSet<String> l1 = new HashSet<String>();
		
		Object l3[] = l1.toArray(new Object[l1.size()]);
		
		l1.add("Red");
		l1.add("Blue");
		l1.add("Black");
		l1.add("Brown");
		l1.add("Yellow");
		l1.add("Orange");
		
		System.out.println("Hash Set 1 is : ");
		for(String x : l1){
			
			System.out.print(x+" ");
		}
		
		System.out.println();
		
		HashSet<String> l2 = new HashSet<String>();
		
		Object l4[] = l2.toArray(new Object[l2.size()]);
		
		l2.add("Red");
		l2.add("Violet");
		l2.add("Black");
		l2.add("Green");
		l2.add("Yellow");
		l2.add("Pink");
		
		System.out.println("Hash Set 2 is : ");
		for(String x : l2){
			
			System.out.print(x+" ");
		}
		
		System.out.println();
		
		for(int i = 0; i < l1.size(); i++){
			for(int j = 0; j < l2.size(); j++){
				if(l3[i] == l4[j]){
					
					System.out.print(l3[i]+" ");
				}
			}
		}
	}
}