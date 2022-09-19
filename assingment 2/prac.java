class prac{
public static void main(String args[]){
	





// pattern 1,3,4
for (int i=1;i<=5;i++)//row
{   
   
   for (int j=1;j<=i;j++)
   {
    System.out.print( " * ");
	
   }
   System.out.println();
}






//pattern 14
for (int i=1;i<=5;i++)//row
{   
   
   for (int j=5;j>=i;j--)
   {
    System.out.print( i+"  ");
	
   }
   System.out.println();
}






// pattern 16
for (int i=5;i>=1;i--)//row
{   
   
   for (int j=5;j>=i;j--)
   {
    System.out.print( j+"  ");
	
   }
   System.out.println();
}





//pattern 6

for (int i=1;i<=5;i++)//row
   
	{
   for (int j=4;j>=i;j--)
   {
    System.out.print("  "); 
	
   }
  for(int j=1;j<=i;j++)
  {
	  System.out.print(i+" ");
  }
	
   
   System.out.println();
    }





// pattern 12
for (int i=1;i<=5;i++)//row
   
	{
   for (int j=4;j>=i;j--)
   {
    System.out.print(" "); 
	
   }
  for(int j=1;j<=i;j++)
  {
	  System.out.print(i+" ");
  }
	
   
   System.out.println();
    }



// pattern 8
int x=5;
		for (int i= 5; i>=1;i--) {
			
		for(int j =1 ; j <= i-1; j++) {
		
			System.out.print(" ");
				
		}
		for(int y=5;y>=i;y--){
			
		System.out.print(x+" ");
		x--;
		}
		for(int j =1;j<=i;j++){
		x--;
		}
		x=5;
		System.out.println();	
		}


//pattern 9
char c = 65;
	for (int i= 1; i<=5;i++) {
	for(int j =4 ; j >= i ; j--) {
		
	System.out.print(" ");
				
	}
	for(char j =1; j <= i ; j++) {
				
				
	System.out.print(c+" ");
	c++;	
	}
	c=65;
	System.out.println();	
	}
	
	
// patterrn 10
char d = 69;
	for (int i= 1; i<=5;i++) {
	for(int j =4 ; j >= i ; j--) {
		
	System.out.print(" ");
				
	}
			
	for(char j =1; j <= i ; j++) {
				
				
	System.out.print(d+" ");
	d--;	
	}
	for(int j =1;j<=i;j++){
	d--;
	}
	d=69;
	System.out.println();	
	}
		
		
		
		// pattern 11
	for (int i= 1; i<=5;i++) {
			
	for(int j =4 ; j >= i ; j--) {
		
	System.out.print(" ");
				
	}
	for(int j=1;j<=i;j++){
				
	System.out.print("*");
	}
	for(int j =2 ; j <= i ; j++) {
		
	System.out.print("*");
				
	}
	System.out.println();	
	}
		
	// pattern 12
		
	for (int i= 1; i<=5;i++) {
			
	for(int j =4 ; j >= i ; j--) {
		
	System.out.print(" ");
				
	}
	for(int j=1;j<=i;j++){
				
	System.out.print(i+" ");
	}
			
	System.out.println();	
	}
		
      //pattern17

		
	int v=1;
	for (int i= 1; i<=5;i++) {
			
	for(int j =1 ; j <= i ; j++) {
		
	System.out.print(v+" ");
	v++;
	}
			
	System.out.println();	
	}
		
		
		//pattern18
		
	char f=65;
	for (int i= 1; i<=5;i++) {
			
	for(int j =1 ; j <=6-i ; j++) {
		
	System.out.print(f+" ");
	f++;
	}
	f=65;
	System.out.println();	
		}
		
	}
}