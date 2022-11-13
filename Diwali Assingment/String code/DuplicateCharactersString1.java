import java.lang.*;
import java.util.*;

class DuplicateCharactersString1{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		
		System.out.println("Duplicate elements are : ");
		for(int i = 0; i < s.length(); i++){
			for(int j = i+1; j < s.length(); j++){
				
				if(s.charAt(i) == s.charAt(j)){
					
					System.out.println(s.charAt(i));
				}
			}
			
		}
	}
}