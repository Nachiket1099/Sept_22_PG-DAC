import java.lang.*;
import java.util.*;

class ArrayListSwappingTwoElements6{
	
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
		System.out.println("Enter the elements you want to swap : ");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		int n1 = l1.indexOf(s1);
		int n2 = l1.indexOf(s2);
		
		l1.remove(s1);
		l1.remove(s2);
		
		l1.add(n1, s2);
		l1.add(n2, s1);
		
		System.out.println("Array list after Swapping  : ");
		for(String x : l1){
			
			System.out.print(x+" ");
		}
		
	}
}