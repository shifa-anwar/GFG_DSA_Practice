//stockSpanProblem
class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        int res[]= new int[price.length];//to store span
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);//push first index in stack
        res[0]=1;//span of first will be 1 always
        for(int i=1;i<n;i++)
        {
        while(stack.size()>0&&price[i]>=price[stack.peek()])
        /*
        pop index from stack till you get element greater
        than curren element
        */
        {
        stack.pop();    
        }
        if(stack.size()==0)
        {
        /*if no element are there then 
        span will be add 1 to current index no
        for ex- 30,20,10,40
        when 40 will come it will pop
       all 10,20 and 30 's index so span will be (4)
        which is index of 40+1
        */
        res[i]=i+1;    
        }
        else
        {
       /*
         for ex - 100,60,70,85
         when 85 will come then 
         it will pop index of 70
         then 60 and then span wil be index of 80-index of 100
         (element at top of stack)
        */
        res[i]=i-stack.peek();    
        }
        stack.push(i);
        }
        return res;
    }
    
}