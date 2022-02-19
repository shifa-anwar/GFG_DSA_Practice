/*Implement Atoi 
Your task  is to implement the function atoi. The function takes a string(str) as argument and converts it to an integer and returns it.
Note: You are not allowed to use inbuilt function.

Example 1:
Input:
str = 123
Output: 123

Example 2:
Input:
str = 21a
Output: -1
Explanation: Output is -1 as all
characters are not digit only.
*/
class Solution
{
    int atoi(String str) {
	// Your code here
	int a=1,j=str.length()-1;
	int sum=0;
	for(int i=0;i<str.length();i++)
	{
	   char ch = str.charAt(i);
	   int x=(int)ch;
	   if(ch=='-'&&i==0)
	   {
	   a=-1;
	   j--;
	   }
	   else if(x>=48&&x<=57)
	   {
	   x=x-48;
	   int r=(int)Math.pow(10,j);
	   sum=sum+(x*r);
	   j--;
	   }
	   else
	   {
	   return -1;    
	   }
    }
    return(sum*a);
}
}
