import java.lang.*;
import java.util.*;

class AnagramsString2{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string 1 : ");
		String s1 = sc.nextLine();
		
		System.out.println("Enter the string 2 :");
		String s2 = sc.nextLine();
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char array1[] = s1.toCharArray();
		char array2[] = s2.toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		boolean res = Arrays.equals(array1, array2);
		
		if(res){
			
			System.out.println("Two strings are anagrams");
		}
		
		else{
			
			System.out.println("Two strings are not anagrams");
		}
	}
}