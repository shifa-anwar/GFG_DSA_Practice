class Solution{
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        int arr[][]= new int[n][n];
      return nQueensPosition(arr,0);
    }
    static ArrayList<ArrayList<Integer>>nQueensPosition(int arr[][],int row)
    {
        if(row==arr.length)
        {
       ArrayList<ArrayList<Integer>> li = new ArrayList<>();
        li.add(display(arr));
        return li;
        }
         ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int col =0;col<arr.length;col++)
        {
            if(isSafePlace(arr,row,col))
            {
            arr[row][col]=1;
            list.addAll(nQueensPosition(arr,row+1));
            arr[row][col]=0;
            }
        }
        return list;
    }
    static ArrayList<Integer> display(int arr[][])
    {
    ArrayList<Integer> li = new ArrayList<>();    
    for(int i=0;i<arr.length;i++)
    {
     for(int j=0;j<arr.length;j++)
     {
    if(arr[i][j]==1)
    {
       li.add(j+1); 
    }
     }
    }
    return li;
    }
    static boolean isSafePlace(int arr[][],int row,int col)
    {
    for(int i=row-1,j=col;i>=0;i--)
    {
    if(arr[i][j]==1)
    {
    return false;    
    }
    }
    for(int i = row-1,j=col-1;i>=0&&j>=0;i--,j--)
    {
   if(arr[i][j]==1)
    {
    return false;    
    }   
    }
    for(int i = row-1,j=col+1;i>=0&&j<arr.length;i--,j++)
    {
   if(arr[i][j]==1)
    {
    return false;    
    } 
    }
    return true;
    }
}