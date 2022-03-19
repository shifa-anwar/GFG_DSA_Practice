import java.util.Stack;

public class PrefixToPostfix {
    public static boolean isOperator(char c)
    {
        switch(c)
        {
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
            return true;
        }
     return false;
    }
    public static String prefixToPostfix(String exp)
    {
     Stack<String> stack = new Stack<String>();
     for(int i=exp.length()-1;i>=0;i--)
     {
      char c = exp.charAt(i);
      if(isOperator(c))
      {
         String op1=stack.pop();
         String op2=stack.pop();
         String temp= op1+op2+c;
         stack.push(temp);
      }
      else
      {
          stack.push(c+" ");
      }
     }
     return stack.pop();
    }
    public static void main(String[] args) {
       String exp="*-A/BC-/AKL";
       System.out.println(prefixToPostfix(exp));
    }
}
