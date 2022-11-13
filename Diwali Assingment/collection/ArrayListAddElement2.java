import java.lang.*;
import java.util.*;

class ArrayListAddElement2{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> l1 = new ArrayList<String>();
		
		l1.add("Red");
		l1.add("Blue");
		l1.add("Black");
		l1.add("Brown");
		l1.add("Yellow");
		l1.add("Orange");
		
		System.out.println("Original array list is : ");
		for(String x : l1){
			
			System.out.print(x+" ");
		}
		
		System.out.println();
		System.out.println("Enter the element you want to add : ");
		String s = sc.nextLine();
		
		l1.add(0, s);
		
		System.out.println();
		System.out.println("Array list after adding element is : ");
		for(String x : l1){
			
			System.out.print(x+" ");
		}
	}
}