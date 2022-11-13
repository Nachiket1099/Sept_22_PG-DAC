import java.lang.*;
import java.util.*;

class StringToInt9{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = sc.nextLine();

		int num = Integer.parseInt(s);
		System.out.println("Integer conversion of given string is : "+num);
		
		s = s + 123;
		num = num + 123;
		
		System.out.println("s = s + 123 : "+s);
		System.out.println("num = num + 123 : "+num);
	}
}