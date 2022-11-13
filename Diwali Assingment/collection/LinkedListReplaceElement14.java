import java.lang.*;
import java.util.*;

class LinkedListReplaceElement14{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		LinkedList<String> l1 = new LinkedList<String>();
		
		l1.add("Red");
		l1.add("Blue");
		l1.add("Black");
		l1.add("Brown");
		l1.add("Yellow");
		l1.add("Orange");
		
		System.out.println("Original linked list is : ");
		for(String x : l1){
			
			System.out.print(x+" ");
		}
		
		System.out.println();
		System.out.println("Enter the element you want to add : ");
		String s = sc.nextLine();
		
		System.out.println("Enter the position where you want to add element : ");
		int n = sc.nextInt();
		
		l1.remove(n);
		l1.add(n, s);
		
		System.out.println("Changed linked list is : ");
		for(String x : l1){
			
			System.out.print(x+" ");
		}
		
	}
}