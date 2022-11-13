import java.util.*;

class ReverseArray4{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements in the array : ");
		int n = sc.nextInt();
		
		int array[] = new int[n];
		System.out.println("Enter the elements of the array : ");
		for(int i = 0; i < array.length; i++){
			
			array[i] = sc.nextInt();
		
		}
		
		int temp;
		int start = 0;
		int end = n-1;
		
		while(start < end){
			
			temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
		
		System.out.println("Array after reversal : ");
		for(int i = 0; i < array.length; i++){
			
			
			System.out.println(array[i]);
		}
	}
}