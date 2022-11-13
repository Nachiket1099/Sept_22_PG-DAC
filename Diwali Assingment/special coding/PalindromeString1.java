import java.lang.*;
import java.util.*;

class PalindromeString1{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
	
		String str = s.replaceAll("[^a-zA-Z]","");
		
		str = str.toLowerCase();
		
		String s1 = "";
		
		for(int i = str.length()-1; i >= 0;  i--){
			
			s1 = s1 + str.charAt(i);
		}
		
		if(str.equals(s1)){
			
			System.out.println("String is palindrome");
		}
		
		else{
			
			System.out.println("String is not palindrome");
		}
		
	}
}