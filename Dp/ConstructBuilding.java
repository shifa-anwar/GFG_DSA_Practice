/* count possible way to costruct building
Given N, the number of plots on either sides of the road. Find the total ways to construct buildings in the plots such that there is a space between any 2 buildings. All plots on one side of the road are continuous.
Lets suppose ‘*’ represents a plot, then for N=3, the plots can be represented as * * * | | * * *                               

Where | | represents the road.                                                                                                                                                                  
Note: As the answer can be very large, print it mod 1000000007
*/
class Solution
{
    public int TotalWays(int N)
    {
        // Code here
        long mod = 1000000007;
        long oldSpace=1,oldBuild=1;
        for(int i=2;i<=N;i++)
        {
            long  newBuild = oldSpace%mod;
            long newSpace = (oldSpace+oldBuild)%mod;
            oldSpace=newSpace;
            oldBuild = newBuild;
        }
        long res = (oldBuild+oldSpace)%mod;
        return (int)((res*res)%mod);
    }
}