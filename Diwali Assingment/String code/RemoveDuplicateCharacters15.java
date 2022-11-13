import java.lang.*;
import java.util.*;

class RemoveDuplicateCharacters15{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		
		int c[] = new int[s.length()];
		for(int i = 0; i < s.length(); i++){
			for(int j = i+1; j < s.length(); j++){
				
				if(s.charAt(i) == s.charAt(j)){
					
					c[j] = 1;
				}
			}
		}
		
		System.out.println("String after removal of the duplicate elements : ");
		for(int i = 0; i < c.length; i++){
			if(c[i] == 0){
				
				System.out.print(s.charAt(i));
			}
		}
	}
}