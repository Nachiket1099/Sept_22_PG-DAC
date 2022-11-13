import java.util.*;

class MergingTwoArrays7
{
 public static void main(String args[])
 {
  int a[]={23,30,50,40,90};
  int n1=a.length;
  
  int b[]={102,205,603};
  int n2= b.length;
  
  int c[]=new int[n1+n2];
 
  int i=0;
  int j=0;
  int k=0;
  
  while(i<n1 && j<n2)
  {
	  c[k++]=a[i++];
	  c[k++]=b[j++];
	  
  }
  while(i < n1)
		{
			
			c[k++] = a[i++];
			
		}
		
		while(j < n2)
		{
			
			c[k++] = b[j++];
		}
		
		System.out.println("Array after merging two array is : ");
		for(i = 0; i < c.length; i++)
		{
			
			System.out.println(c[i]);
			
		}
  
  
 }
}