/*
Count subsequences of type a^i, b^j, c^k 
Given a string S, the task is to count number of subsequences of the form aibjck, where i >= 1, j >=1 and k >= 1.
Note: 
1. Two subsequences are considered different if the set of array indexes picked for the 2 subsequences are different.
2.  For large test cases, output value will be too large, return the answer MODULO 10^9+7

Example 1:
Input:
S = "abbc"
Output: 3
Explanation: Subsequences are abc, abc and abbc.
*/
class Solution
{
    public int fun(String s)
    {
        // Write your code here
        long mod = 1000000007;
        long a=0,ab=0,abc=0;
        for(int i=0;i<s.length();i++)
        {
           if(s.charAt(i)=='a')
           {
            a = (2*a+1)%mod;   
           }
           else if(s.charAt(i)=='b')
           {
             ab = (2*ab+a)%mod;  
           }
           else if(s.charAt(i)=='c')
           {
             abc = (2*abc+ab)%mod;  
           }
        }
        return (int) (abc%mod);
    }
}
Time complexity:O(Length of String)
Space complexity:O(1)