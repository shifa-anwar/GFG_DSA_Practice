/*
Count the number of ways to tile the
floor of size n x m using 1 x m size tiles 
*/
class Solution
{
    public int countWays(int n, int m)
    {
        // Code here
        long mod = 1000000007;
        long dp[] = new long[n+1];
        for(int i=1;i<=n;i++)
        {
        if(i<m)
        {
        dp[i]=1;    
        }
        else if(i==m)
        {
        dp[i]=2;    
        }
        else
        {
        dp[i]=(dp[i-1]+dp[i-m])%mod;    
        }
        }
        return (int)(dp[n]%mod);
    }
}