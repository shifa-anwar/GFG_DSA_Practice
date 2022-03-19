import java.util.Stack;

public class MinStack {
    static Stack<Integer>stack=new Stack<Integer>();//stack to store all values
    static  Stack<Integer>min = new Stack<Integer>(); //auxillary stackk to store min value
    static void push(int x)
    {
     if(stack.isEmpty())
     {
      stack.push(x); //if empty then add to both stack and auxillary stack
      min.push(x);
     }
     else
     {
      stack.push(x);  //push value in first stack
         /*pop element from auxillary to check if the min value present in auxillary stack is less 
         than or greater than then the upcoming value to be pushed in stack the value which is min 
         will be pushed into auxillary stack
          */
         int y=min.pop();
      min.push(y);
      if(x>y)
       min.push(y);
      else
          min.push(x);
         /*for makin space optimised(push in auxillary stack only if current value is less than peek element of auxillary stack)
         if(x<=y)
         min.push(x);
         */
     }
    }
    static int pop()
    {
     int x = stack.pop();
     min.pop();
     return x;
    }
    static int getMin()
    {
     int m=min.pop();
     min.push(m);
     return m;
    }
    public static void main(String args[])
    {
     push(10);
     push(20);
     push(30);
     System.out.println(getMin());
     push(5);
     System.out.println(getMin());
    }
}
