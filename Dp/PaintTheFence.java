/*
Painting the fence
Given a fence with n posts and k colors, find out the number of ways
of painting the fence so that not more than two consecutive fences 
have the same colors. Since the answer can be large return it modulo 
10^9 + 7.

Example 1:
Input:
N=3,  K=2 
Output: 6

Example 2:
Input:
N=2,  K=4
Output: 16
*/
class Solution
{
    long countWays(int n,int k)
    {
        //code here.
        if(n==1)
        return k;
    long mod = 1000000007;    
    long same = k,diff=k*(k-1),total = (same+diff)%mod;
    for(int i=3;i<=n;i++)
    {
    same = diff;
    diff = (total*(k-1))%mod;
    total = (same+diff)%mod;
    }
    return total%mod;
}
}