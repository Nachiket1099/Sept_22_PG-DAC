class pract1{
public static void main(String args[]){

System.out.println();
		System.out.println("PIRYAMID PATTERN 1");
		for (int i= 1; i<=9;i++) {
			
			for(int j =8 ; j >= i ; j--) {
		
				System.out.print(" ");
				
			}
			for(int x=1;x<=i;x++){
				
				System.out.print(i+" ");
			}
			
			System.out.println();	
		}
		//pattern2
		System.out.println();
		System.out.println("PIRYAMID PATTERN 2");
		for (int i= 1; i<=9;i++) {
			
			for(int j =8 ; j >= i ; j--) {
		
				System.out.print(" ");
				
			}
			for(int x=1;x<=i;x++){
				
				System.out.print(x+" ");
			}
			
			System.out.println();	
		}
		//pattern3
		System.out.println();
		System.out.println("PIRYAMID PATTERN 3");
		for (int i= 1; i<=9;i++) {
			
			for(int j =8 ; j >= i ; j--) {
		
				System.out.print(" ");
				
			}
			for(int x=1;x<=i;x++){
				
				System.out.print("* ");
			}
			
			System.out.println();	
		}
		//pattern6
		System.out.println();
		System.out.println("PIRYAMID PATTERN 6");
		for (int i= 9; i>=1;i--) {
			
			for(int x=9;x>=i;x--){
				
				System.out.print(" ");
			}
			for(int j =1 ; j <= i ; j++) {
		
				System.out.print("* ");
				
			}
			System.out.println();	
		}
		//pattern7
		System.out.println();
		System.out.println("PIRYAMID PATTERN 7");
		for (int i= 9; i>=1;i--) {
			
			for(int x=9;x>=i;x--){
				
				System.out.print(" ");
			}
			for(int j =1 ; j <= i ; j++) {
		
				System.out.print(i+" ");
				
			}
			System.out.println();	
		}
		//pattern4
		System.out.println();
		System.out.println("PIRYAMID PATTERN 4");
		for (int i= 0; i<=9;i++) {
			
			for(int j =8 ; j >= i ; j--) {
		
				System.out.print("  ");
				
			}
			for(int j=1;j<=i;j++){
				
				System.out.print(j+" ");
				
			}
			for(int j=i-1;j>0;j--){
				
				System.out.print(j+" ");
			}
			
			System.out.println();	
		}
		//pattern5
		System.out.println();
		System.out.println("PIRYAMID PATTERN 5");
		for (int i=10;i>1;i--){
			for(int j =2; j < i ; j++) {
		
				System.out.print("  ");
			}
			for(int j=i-1; j<=9; j++){
				System.out.print(j+" ");
			}
			for(int j=9-1; j>=i-1; j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
}

