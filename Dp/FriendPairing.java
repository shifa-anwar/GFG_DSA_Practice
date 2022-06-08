/*
Friends Pairing Problem
*/
class Solution
{
    public long countFriendsPairings(int n) 
    { 
       //code here
       if(n==1)
       return (long)1;
       long mod = 1000000007;
      long dp[] = new long[n+1];
      dp[1]=1;dp[2]=2;
      for(int i=3;i<=n;i++)
      {
        dp[i]=(dp[i-1]+(i-1)*dp[i-2])%mod;  
      }
      return dp[n]%mod;
    }
}    
 