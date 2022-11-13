import java.lang.*;
import java.util.*;

class OccuranceOfCharacter8{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		
		System.out.println("Enter the character you want to find : ");
		char ch = sc.next().charAt(0);
		
		int count = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == ch){
				count++;
			}
		}
		
		System.out.println(ch+" occured in the string "+count+" times.");
	}
}