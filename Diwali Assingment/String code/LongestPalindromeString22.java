import java.lang.*;
import java.util.*;

class LongestPalindromeString22{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		
		int end = 1;
		int start = 0;
		int high;
		int low;
		
		 for (int i = 0; i < s.length(); i++) {
            low = i - 1;
            high = i + 1;
            while ( high < s.length() && s.charAt(high) == s.charAt(i))                                  
                high++;
       
            while ( low >= 0 && s.charAt(low) == s.charAt(i))                  
                low--;
       
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high) ){
                low--;
                high++;
        }
 
        int length = high - low - 1;
        if (end < length){
            end = length;
            start = low+1;
        }
		
		 }
		 System.out.println("Longest palindrome substring is : "+s.substring(start, start + end ));
	
	}
}