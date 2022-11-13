import java.util.*;

class ArrayListColors1
{
 public static void main(String args[])
 {
  ArrayList<String> l1= new ArrayList<String>();
  
  l1.add("Red");
  l1.add("Blue");
  l1.add("balck");
  l1.add("Brown");
  l1.add("orange");
  
  l1.remove("Brown");
  
  for(String x : l1)
  {
   System.out.println(x);
  }
  
  
 }
}