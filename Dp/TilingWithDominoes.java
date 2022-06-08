/*
Tiling with dominoes
*/
class Solution {
    static Long numberOfWays(int N) {
        // code here
        if(N==1)
        return (long)N;
        long mod = 1000000007;
        long dp [] = new long[N+1];
        dp[1]=1;dp[2]=2;
        for(int i=3;i<=N;i++)
        {
        dp[i]=(dp[i-1]+dp[i-2])%mod;    
        }
        return dp[N]%mod;
    }
}