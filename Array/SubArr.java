class SubArr
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer>list = new ArrayList<Integer>();
        // Your code here
       int cur_sum=0,start=0,last=0;
       for(int i=0;i<n;i++)
       {
        cur_sum+=arr[i];
        if(cur_sum>=s)
        {
            last=i; 
        while(cur_sum>s&&start<last)
        {
         cur_sum = cur_sum-arr[start];
         ++start;
        }
        if(cur_sum==s)
        {
        list.add(start+1);
        list.add(last+1);
        return list;
        }
        }
       }
       list.add(-1);   
       return list;
    }
}