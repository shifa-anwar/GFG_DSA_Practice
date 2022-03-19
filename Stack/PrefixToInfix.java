import java.util.Stack;

public class PrefixToInfix {
    public static boolean isOperator(char ch)
    {
       switch (ch)
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
    public static String preToinfix(String s)
    {
        Stack<String> stack = new Stack<String>();
        for(int i=s.length()-1;i>=0;i--)
        {
            char c=s.charAt(i);
            if(isOperator(c))
            {
                String op1=stack.pop();
                String op2=stack.pop();
                String temp ="("+op1+c+op2+")";
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
        String exp = "*-A/BC-/AKL";
        System.out.println(preToinfix(exp));
    }
}
