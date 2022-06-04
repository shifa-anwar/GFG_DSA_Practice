/*
coin change combination
Given a value N, find the number of ways to make change 
for N cents, if we have infinite supply of each of 
S = { S1, S2, .. , SM } valued coins.

Example 1:
Input:
n = 4 , m = 3
S[] = {1,2,3}
Output: 4
Explanation: Four Possible ways are:
{1,1,1,1},{1,1,2},{2,2},{1,3}.
*/
class Solution {
    public long count(int S[], int m, int n) {
        // code here.
        long dp[] = new long[n+1];
        dp[0]=1;
        for(int i=0;i<m;i++)
        {
        for(int j=S[i];j<=n;j++)
        {
        dp[j]+=dp[j-S[i]];
        }
        }
        return dp[n];
    }
}
time complexity:O(m*n)
space complexity:O(n)(n is the amount)

/*Coin change Permutation
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception 
{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
    arr[i]=sc.nextInt();
    int amt = sc.nextInt();
    int dp[]= new int[amt+1];
    dp[0]=1;
    for(int i=0;i<=amt;i++)//amount
    {
    for(int j=0;j<n;j++)//coin
    {
    if(arr[j]<=i)
    {
    dp[i]+=dp[i-arr[j]];    
    }
    }
    }
    System.out.println(dp[amt]);
 }
}
*/