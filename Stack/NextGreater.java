class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        Stack<Long> s = new Stack<Long>();
        long nums[]= new long[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            if(!s.isEmpty())
            {
             while(!s.isEmpty()&&s.peek()<arr[i])
             s.pop();
            }
            nums[i]=s.isEmpty()?-1:s.peek();
            s.push(arr[i]);
        }
     return nums;   
    } 
}