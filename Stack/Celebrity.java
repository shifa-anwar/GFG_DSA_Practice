/*Celebrity Problem
*/
class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	/
    	Stack<Integer> stack = new Stack<Integer>();
    	for(int i=0;i<M.length;i++)
    	{
    	  stack.push(i);  //push all index in stack
    	}
    	while(stack.size()>=2)
    	{
    	 int i=stack.pop();//pop 2 index from stack till two index are left
    	 int j=stack.pop();
    	 if(M[i][j]==0)
    	 {
         //if i does not know j    
    	    stack.push(i); 
    	 }
    	 else
    	 {
          // if j is known by i   
    	     stack.push(j);
    	 }
    	}
    	int p=stack.pop(); //pop last indx which might be the celebrity
    	for(int i=0;i<M.length;i++)
    	{
    	 if(i!=p)//dont check element which has same index
    	 {
    	   if(M[p][i]==1||M[i][p]==0)
           /* if potential element knows any element
           and potential elem is not known by ith elem
           */
    	   {
    	   return -1;    
    	   }
    	 }
    	}
    	return p;
    }
}
