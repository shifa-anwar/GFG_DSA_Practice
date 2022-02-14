// { Driver Code Starts
import java.util.Scanner;
import java.util.*;

class ToRoman
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int N = sc.nextInt();
			
			Solution ob = new Solution();
			System.out.println(ob.convertToRoman(N));
			t--;
		}
	}
}// } Driver Code Ends


//User function template for JAVA

class Solution
{
	String convertToRoman(int n) {
		//code here
		
	    StringBuilder ans = new StringBuilder();
	    String roman[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int val[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
		for(int i=0;i<val.length;i++)
		{
		    while(n>=val[i])
		    {
		       ans.append(roman[i]);
		        n= n-val[i]; 
		    }
		}
		return ans.toString();
	}
}