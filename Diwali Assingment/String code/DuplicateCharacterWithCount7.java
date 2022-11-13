import java.lang.*;
import java.util.*;

class DuplicateCharacterWithCount7{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
	
		for(int i = 0; i < s.length(); i++){
			int count = 1;
			for(int j = i+1; j < s.length(); j++){
				
				if(s.charAt(i) == s.charAt(j)){
					count++;
					if(count > 1){
						
						System.out.println(s.charAt(i)+" : "+count);
					}	
				}
			}
		}
	}
}