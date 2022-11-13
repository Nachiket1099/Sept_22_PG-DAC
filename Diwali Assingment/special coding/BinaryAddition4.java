import java.lang.*;
import java.util.*;

class BinaryAddition4{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string 1 : ");
		String s1 = sc.nextLine();
		
		System.out.println("Enter the string 2 : ");
		String s2 = sc.nextLine();
		
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);
		
		int dec1 = 0, binary1, rem1 = 0, a1 = 0;
		binary1 = n1;
		
		while (binary1 != 0){
			rem1 = binary1 % 10;
			dec1 = dec1 + rem1*(int)(Math.pow(2, a1));
			binary1 = binary1 / 10;
			a1++;
		}
		
		int n3 = dec1;
		
		
		int dec2 = 0, binary2, rem2 = 0, a2 = 0;
		binary2 = n2;
		
		while (binary2 != 0){
			rem2 = binary2 % 10;
			dec2 = dec2 + rem2*(int)(Math.pow(2, a2));
			binary2 = binary2 / 10;
			a2++;
		}
		
		int n4 = dec2;
		
		int n5 = n3 + n4;
		
		int binary[] = new int[50];
		int index = 0, num;
		num = n5;
		
		while(num != 0){
		
			binary[index++] = num % 2;
			num = num / 2;
		}
		
		for(int i = index-1; i >= 0; i--){
			
			System.out.print(binary[i]);
		}
		
	}
}