import java.lang.*;
import java.util.*;

class ArrayToTreeSet{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of the elements ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter the elements of the array : ");
		for(int i = 0; i < a.length; i++){
			
			a[i] = sc.nextInt();
			
		}
		
		TreeSet<Integer> t1 = new TreeSet<Integer>();
		for(int b : a){
			
			t1.add(b);
			
		}
		
		System.out.println("Elements in the tree set are : ");
		for(int c : t1){
			
			System.out.println(c);
		}
	}
}