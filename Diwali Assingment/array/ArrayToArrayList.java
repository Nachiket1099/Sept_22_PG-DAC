import java.util.*;

class ArrayToArrayList{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of the elements in the array : ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter the elements of the array : ");
		for(int i = 0; i < a.length; i++){
			
			a[i] = sc.nextInt();
			
		}
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		for(int x : a){
			
			l1.add(x);
		}
		
		System.out.println("Elements in the array list are : ");
		for(int x : l1){
			
			System.out.println(x);
		}
		
	}
}