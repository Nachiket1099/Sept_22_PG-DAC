
import java.util.*;

class ArrayElements1{
	
	public static void main(String args[]){
		
		int array[] = new int[7];
		
		array[0] = 11;
		array[1] = 12;
		array[2] = 13;
		array[3] = 14;
		array[4] = 15;
		array[5] = 16;
		array[6] = 17;
		
		for(int x : array){
			
			System.out.println(x);
		}
	}
}