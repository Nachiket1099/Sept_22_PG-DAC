import java.lang.*;
import java.util.*;


class Palindrome9{
	
	public static boolean isPalindrome(String s, int low, int high){
		
		while(low < high){
			
			if(s.charAt(low) != s.charAt(high)){
				
				return false;
				
			}
			
			low++;
			high--;
		}
		
		return true;
		
	}
	
	public static boolean checkPalindrome(String str){
		
		int low = 0;
		int high = str.length()-1;
		
		while(low < high){
			
			if(str.charAt(low) == str.charAt(high)){
				
				low++;
				high--;
				
			}
			
			else{
				
				if(isPalindrome(str, low+1, high)){
					
					return true;
					
				}
				
				if(isPalindrome(str, low, high-1)){
					
					return true;
					
				}
				
				return false;
			}
			
		}
		
		return true;
	}
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string you want to check : ");
		String str = sc.nextLine();
		
		boolean a = checkPalindrome(str);
		
		if(a){
			
			System.out.println("true");
		}
		else{
			
			System.out.println("false");
		}
	}
}