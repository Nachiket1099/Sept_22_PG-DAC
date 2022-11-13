import java.lang.*;
import java.util.*;

class DigitsInString5{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		
		s = s.toLowerCase();
		
		char s1[] = s.toCharArray();
		
		int count = 0;
		for(int i = 0; i < s1.length; i++){
			
			if(Character.isDigit(s1[i])){
				
				count++;
			}
		}
		
		if(count == s1.length){
			
			System.out.println("String contains only digits");
		}
		
		else{
			
			System.out.println("String contains charater ");
		}
	}
}