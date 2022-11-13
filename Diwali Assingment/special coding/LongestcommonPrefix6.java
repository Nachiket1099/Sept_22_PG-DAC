import java.lang.*;
import java.util.*;

class LongestcommonPrefix6{
	
	 static String commonPreUtil(String str1, String str2) {
        String result = "";
        int n1 = str1.length(), n2 = str2.length();
 
       
        for (int i = 0, j = 0; i <= n1 - 1 && j <= n2 - 1; i++, j++) {
            if (str1.charAt(i) != str2.charAt(j)) {
                break;
            }
            result += str1.charAt(i);
        }
 
        return (result);
    }

    static String commonPre(String arr[], int n) {
        String prefix = arr[0];
 
        for (int i = 1; i <= n - 1; i++) {
            prefix = commonPreUtil(prefix, arr[i]);
        }
 
        return (prefix);
    }
 

    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of the strings in the array : ");
		int x = sc.nextInt();
		
		
        String arr[] = new String[x];
		System.out.println("Enter the strings : ");
		for(int i = 0; i < arr.length; i++){
			
			arr[i] = sc.nextLine();
			
		}
		
        int n = arr.length;
 
        String ans = commonPre(arr, n);
 
		System.out.printf("The longest common prefix is : "+ans);
        
    }

}