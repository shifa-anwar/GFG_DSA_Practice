//tle(using backtracking)
class Solution{
    static int maxGold(int n, int m, int M[][])
    {
    boolean arr[][]= new boolean[n][m];    
        int max =0;
    for(int i=0;i<n;i++){
    max = Math.max(max,findMaximum(M,i,0,arr));     
    }    
    return max;
    }
    static int findMaximum(int M[][],int r,int c,boolean visit[][])
    {
        if(r<0||r>=M.length||c>=M[0].length||visit[r][c]==true)
        {
        return 0;    
        }
        visit[r][c]=true;
        int rdiag=findMaximum(M,r-1,c+1,visit);
        int ldiag=findMaximum(M,r+1,c+1,visit);
        int right=findMaximum(M,r,c+1,visit);
      visit[r][c]=false;
        return M[r][c]+Math.max(Math.max(rdiag,ldiag),right);
    }
}
/*Time complexity: O(3N*M)
Auxiliary Space: O(N*M)*/
2.using tabulation
class Solution{
    static int maxGold(int n, int m, int M[][])
    {
     int arr[][] = new int[n][m];
     for(int i=0,j=m-1;i<M.length;i++)
     {
        arr[i][j]=M[i][j]; 
     }
     for(int j=m-2;j>=0;j--)
     {
     for(int i = n-1;i>=0;i--)
     {
      int rdiag=(i>0)?arr[i-1][j+1]:0;
      int ldiag=(i<n-1)?arr[i+1][j+1]:0;
      int right=arr[i][j+1];
      arr[i][j]=Math.max(Math.max(rdiag,ldiag),right)+M[i][j];
     }
    }
    return findMax(arr,n,m);
}
static int findMax(int arr[][],int n,int m)
{
int max = arr[0][0];//now all the max path are in first column only so we'll search only first col    
for(int i=1;i<n;i++)
{
max = Math.max(max,arr[i][0]);
}
return max;
}
}
max = Math.max(max,arr[i][j]);    
}
}
return max;
}

/*Time complexity:O(m*n)
space complexity:O(m*n)(2d array is used)
*/
