import java.util.Stack;

public class StackInfix {
    static int prec(char ch)
    {
        switch(ch)
        {
            case '+':
            case '-':
            return 1;
            case '*':
            case '/':
            return 2;
            case '^':
            return 3;
        }
        return -1;
    }
    static String infixToPostFix(String exp)
    {
     String res = new String("");
     Stack<Character> stack = new Stack<>();
     for(int i=0;i<exp.length();++i) {
         char c = exp.charAt(i);
         if (Character.isLetterOrDigit(c))  //if character is some letter or digit then we will just add it to string
             res += c;
         else if (c == '(') // if it is a opening bracket then push it into stack
             stack.push(c);
         else if (c == ')') {
             while (!stack.isEmpty() && stack.peek() != '(') //when closing bracket appear then pop all operator from stack
             {
                 res += stack.pop();
             }
             stack.pop();//pop this bracket (
         } else //operator
         {
             while (!stack.isEmpty() && prec(c) <= prec(stack.peek())) {
                 res += stack.pop();
             }
             stack.push(c);
         }
     }
      while(!stack.isEmpty()) {
          if (stack.peek() == '(')
              return "invalid expression";
          res += stack.pop();
      }
     return exp;
    }
    public static void main(String[] args) {
    String exp="a+b*(c^d-e)^(f+g*h)-i";
    System.out.println(infixToPostFix(exp));
    }
}
