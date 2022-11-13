import java.lang.*;
import java.util.*;

class JewelsStones10{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the jewels : ");
		String k = sc.nextLine();
		
		System.out.println("Enter the stones : ");
		String s = sc.nextLine();
		
		int count = 0;
		for(int i = 0; i < s.length(); i++){
			for(int j = 0; j < k.length(); j++){
				if(s.charAt(i) == k.charAt(j)){
					count++;
					
				}	
			}
		}
		
		System.out.println(count);
	}
}