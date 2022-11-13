import java.lang.*;
import java.util.*;

class ArrayListPrintingElements7{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> l1 = new ArrayList<String>();
		
		l1.add("Red");
		l1.add("Blue");
		l1.add("Black");
		l1.add("Brown");
		l1.add("Yellow");
		l1.add("Orange");
		
		System.out.println("Elements in the array list is : ");
		for(int i = 0; i < l1.size(); i++){
			
			System.out.print(l1.get(i)+" ");
		}
		
	}
}