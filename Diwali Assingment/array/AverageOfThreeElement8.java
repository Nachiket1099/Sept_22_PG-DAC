import java.util.*;

class AverageOfThreeElement8
{
 public static void main(String args[])
 {
  int a[]={10,20,30,4,50};
  int n = a.length;
  
  int b[]= new int[3];
  
  int i=0;
  int j=0;
  //int x=0;
  
  while(n>=3)
  {
   int sum= 0;
   sum =a[i]+a[++i]+a[++i];
   b[j]=sum/3;
   j++;
   i=j;
   n--;
  
  }
  System.out.println("Array of sum is : ");
  for (int x: b)
  {
   System.out.println(x);
  }
 }
}
