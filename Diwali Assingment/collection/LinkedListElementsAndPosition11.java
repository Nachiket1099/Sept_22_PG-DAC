import java.lang.*;
import java.util.*;

class LinkedListElementsAndPosition11{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		LinkedList<String> l1 = new LinkedList<String>();
		
		l1.add("Red");
		l1.add("Blue");
		l1.add("Black");
		l1.add("Brown");
		l1.add("Yellow");
		l1.add("Orange");
		
		System.out.println("Elements in the linked list are : ");
		for(int i = 0; i < l1.size(); i++){
			
			System.out.println(l1.get(i)+" : "+i);
		}
		
	}
}