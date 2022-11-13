import java.util.*;

class ArrayListToStringArray{
	
	public static void main(String args[]){
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);	
		l1.add(5);
		l1.add(6);	
		l1.add(3);
		l1.add(9);	
		
		l1.toArray();
		System.out.print("Elements in the array are : ");
		for(int x : l1){
			
			System.out.print(x+" ");
		}
		
	}
}