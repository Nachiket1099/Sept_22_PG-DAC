import java.util.*;

class ThirdLargest6
{
 public static void main (String args[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the no of ele in array :");
  int n = sc.nextInt();
  int array[]= new array[n];
  
   System.out.println("Enter  ele :");
   for (int i=0;i<array.length;i++)
   {
    array[i]=sc.nextInt();
   }
   
   int firstMax= array[0];
   
   for(int i=1;i<array.length;i++)
   {
    if (array[i]>firstMax)
	{
	 firstMax=array[i];
	}
   }
  

  
   int secondMax=array[0];
   for (int i=1;i<array.length;i++)
 {
    if(array[i] ! = firstMax)
   {
      if(array[i]>secondMax)
	{
	   secondMax =array[i];
	}
   }
 }
  
  
  int thirdMax=array[0];
  for (int i=1;i<array.length;i++)
  {
   if(array[i] != secondMax &&  array[i] != firstMax)
				{
					if(array[i] > thirdMax)
					{
					
						thirdMax = array[i];
					}
				}
  }  
  System.out.println("Third largest element in the array is : "+thirdMax);
  
 }
}