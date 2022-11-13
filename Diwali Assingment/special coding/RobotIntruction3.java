import java.lang.*;
import java.util.*;

class RobotIntruction3{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		
		char ch[] = s.toCharArray();
		
		int Lcount = 0;
		int Rcount = 0;
		int Dcount = 0;
		int Ucount = 0;
		
		for(int i = 0; i < ch.length; i++){
			
			if(ch[i] == 'L'){
				
				Lcount++;
				
			}
			else if(ch[i] == 'R'){
				
				Rcount++;
				
			}
			
			else if(ch[i] == 'D'){
				
				Dcount++;
				
			}
			else if(ch[i] == 'U'){
				
				Ucount++;
				
			}
		}
		
		if(Lcount == Rcount && Dcount == Ucount){
			
			System.out.println("Robot will return to its original position");
			
		}
		
		else{
			
			System.out.println("Robot will not return to its original position");
		}
	}
}