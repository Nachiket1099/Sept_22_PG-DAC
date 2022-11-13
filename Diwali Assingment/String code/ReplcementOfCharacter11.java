import java.lang.*;
import java.util.*;

class ReplcementOfCharacter11{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		
		System.out.println("Enter the character with which you want to replace blank space : ");
		String n = sc.nextLine();
		
		String r = s.replaceAll(" ", n);
		System.out.println(r);
	}
}