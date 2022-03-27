/*Celebrity Problem
*/
class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here
    	Stack<Integer> stack = new Stack<Integer>();
    	for(int i=0;i<M.length;i++)
    	{
    	  stack.push(i);  
    	}
    	while(stack.size()>=2)
    	{
    	 int i=stack.pop();
    	 int j=stack.pop();
    	 if(M[i][j]==0)
    	 {
    	    stack.push(i); 
    	 }
    	 else
    	 {
    	     stack.push(j);
    	 }
    	}
    	int p=stack.pop();
    	for(int i=0;i<M.length;i++)
    	{
    	 if(i!=p)
    	 {
    	   if(M[p][i]==1||M[i][p]==0)
    	   {
    	   return -1;    
    	   }
    	 }
    	}
    	return p;
    }
}