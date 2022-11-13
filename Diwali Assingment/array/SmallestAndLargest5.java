import java.util.*;

class SmallestAndLargest5
{
 public static void main (String args[])
 {
   Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no of ele of array:");
		int n = sc.nextInt();
		int array[]=new int[n];
		
		
		System.out.println("enter element :");
		for (int i=0;i<array.length;i++)
		{
		 array[i]= sc.nextInt();
		}
		
		int small= array[0];
		int large= array[0];

		for(int i= 1;i<array.length;i++)
		{
		 if (array[i]<small)
		 {
		  small = array[i];
		 }
		 if(array[i]>large)
		 {
		  large = array[i];		 
    	 }
		}
		System.out.println("Smallest element in the array is : "+small);
		System.out.println("Largest element in the array is : "+large);
 }
}


/*
Enter the no of ele of array:
5
enter element :
10
20
30
40
50
Smallest element in the array is : 10
Largest element in the array is : 50
*/