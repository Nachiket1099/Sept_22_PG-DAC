import java.lang.*;
import java.util.*;

class HighestOccuredCharacter18{
	
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		
		int c[] = new int[s.length()];
		for(int i = 0; i < s.length(); i++){
			int count = 1;
			for(int j = 0; j < s.length(); j++){
				
				if(s.charAt(i) == s.charAt(j)){
					
					c[i] = count++;
					
				}
			}
		}
		
		int large = c[0];
		for(int i = 1; i < c.length; i++){
			
			if(c[i] > large){
				
				large = c[i];
				
			}
		}
		char ch = ' ';
		for(int i = 0; i < s.length(); i++){
			if(c[i] == large){
				
				ch = s.charAt(i);
			}
		}
		
		System.out.println("Highest occured character in the string is : "+ch);
	}
}