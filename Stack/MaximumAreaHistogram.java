//Maximum Rectangle area
class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) 
    {
        // your code here
        int lb[]=new int[hist.length];//indicate left boundary
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        lb[0]=-1;
        for(int i=1;i<hist.length;i++)
        {
        while(!stack.isEmpty()&&hist[i]<=hist[stack.peek()])
        //pop all element greater than current element    
        {
        stack.pop();    
        }
        if(stack.size()==0)
        lb[i]=-1;
        else
        lb[i]=stack.peek();
        stack.push(i);
        }
        int rb[]=new int[hist.length];//indicate right boundary
        Stack<Integer> st = new Stack<>();
        st.push(hist.length-1);
        rb[hist.length-1]=hist.length;
        for(int i=hist.length-2;i>=0;i--)
        {
            while(!st.isEmpty()&&hist[i]<=hist[st.peek()])
            {
                st.pop();
            }
            if(st.size()==0)
            rb[i]=hist.length;
            else
            rb[i]=st.peek();
            st.push(i);
        }
        long max_Area=0;
        for(int i=0;i<hist.length;i++)
        {
         long width=rb[i]-lb[i]-1;
         long area = width*hist[i];
         if(max_Area<area)
         max_Area=area;
        }
        return max_Area;
    }
        
}



