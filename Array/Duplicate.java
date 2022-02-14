class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        int max = arr[0];
        boolean flag = false;
        for(int i=0;i<n;i++)
        {
         if(arr[i]>max)
         max=arr[i];
        }
        int hash[]= new int[max+1];
        for(int i=0;i<n;i++)
        {
        hash[arr[i]]++;    
        }
        
        for(int i=0;i<hash.length;i++)
        {
         if(hash[i]>1)
         {
         list.add(i);
         flag=true;
         }
        }
        if(flag==false)
        {
         list.add(-1);        
        }
        return list;
    }
}
