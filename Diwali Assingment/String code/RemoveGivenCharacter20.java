import java.lang.*;
import java.util.*;

class RemoveGivenCharacter20{
	
	public static void removeCharacter(String res, char c){
		
		int x = res.indexOf(c);
		
		StringBuffer str = new StringBuffer(res);
		str.delete(x, x+1);
		
		System.out.println("String after deletion of given character is : "+str);
		
	}
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		
		System.out.println("Enter the character you want to remove : ");
		char ch = sc.next().charAt(0);
		
		removeCharacter(s, ch);
	}
}
