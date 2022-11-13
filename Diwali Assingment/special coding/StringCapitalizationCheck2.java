import java.lang.*;
import java.util.*;

class StringCapitalizationCheck2{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		
		int count = 0;
		int count1 = 0;
		int init = 0;
		for(int i = 0 ; i < s.length(); i++){
			
			if(Character.isUpperCase(s.charAt(i))){
				
				count++;
				if(Character.isUpperCase(s.charAt(0))){
				
					init++;
				
				}
				
			}
			
			else if(Character.isLowerCase(s.charAt(i))){
				
				count1++;
				
			}
			
			else{
				
				break;
				
			}
		}
		
		if(count == s.length() || count1 == s.length() || init == 1){
			
			System.out.println("String is correctly capitalized");
			
		}
		
		else{
			
			System.out.println("String is not correctly capitalized");
		}
		
		
	}
}