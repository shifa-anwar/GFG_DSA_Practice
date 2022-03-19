class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        Stack<Long> s = new Stack<Long>();
        long nums[]= new long[arr.length];
        for(int i=arr.length-1;i>=0;i--)//iterate from last element
        {
            if(!s.isEmpty())
            {
             /*
             if stack is not empty and element at peek of stack is less than the present element then pop it
             till you get greater element
             */
             while(!s.isEmpty()&&s.peek()<arr[i]) 
             s.pop();
            }
            nums[i]=s.isEmpty()?-1:s.peek();  //if last element then add -1 or the stack is empty
            s.push(arr[i]);
        }
     return nums;   
    } 
}
