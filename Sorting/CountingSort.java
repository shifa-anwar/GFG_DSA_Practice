/*
Counting sort
Given a string arr consisting of lowercase english letters, arrange all its letters in lexicographical order using Counting Sort.

Example 1:

Input:
N = 5
S = "edsab"
Output:
abdes
Explanation: 
In lexicographical order, string will be 
abdes.
*/
class Solution
{
    //Function to arrange all letters of a string in lexicographical 
    //order using Counting Sort.
    public static String countSort(String arr)
    {
        // code here
        int str[] = new int[26];
        char b[] = new char[arr.length()];
        for(int i=0;i<arr.length();i++)
        {
        str[arr.charAt(i)-'a']++;    
        }
        for(int i=1;i<str.length;i++)
        {
         str[i]+=str[i-1];    
        }
        for(int i= arr.length()-1;i>=0;i--)
        {
        b[--str[arr.charAt(i)-'a']]=arr.charAt(i); 
        }
       return String.valueOf(b);
    }
}
/* For Positive number
public class CountSort {
    public static void main(String args[])
    {
        int arr[] = {2,1,1,0,2,5,4,0,2,8,7,7,9,2,0,1,9};
        int min =arr[0],max = arr[0];
        for(int i=0;i<arr.length;i++)
        {
           min = Math.min(min,arr[i]);
           max = Math.max(max,arr[i]);
        }
        int count[] = new int[max+1];
        for(int i=0;i<arr.length;i++)
        {
         count[arr[i]]++;
        }
        for(int i=1;i<count.length;i++)
        {
         count[i] +=count[i-1];
        }
        int b[] = new int[arr.length];
        for(int i = arr.length-1;i>=0;i--)
        {
         int index = --count[arr[i]];
         b[index]=arr[i];
        }
        display(b);
    }
    public static void display(int arr[])
    {
     for(int i=0;i<arr.length;i++)
     {
      System.out.print(arr[i]+" ");
     }
    }
}
*/