import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

  Stack<Integer> op = new Stack<>();//operand
    Stack<Character>opr = new Stack<>();//operator
    for(int i=0;i<exp.length();i++)
    {
       char c = exp.charAt(i);
       if(c=='(')
       opr.push(c);
       else if(Character.isDigit(c))
       op.push(c-'0');//push digit in stack
       else if(c==')')
       {
        while(opr.peek()!='(')
        {
          char oper=opr.pop();
          int x=op.pop();
          int y=op.pop();
          int res= operation(oper,y,x); //perform operation
          op.push(res);
        }
        opr.pop(); //pop opening bracket
       }
       else if(c=='+'||c=='-'||c=='*'||c=='/')
       {
           while(!opr.isEmpty()&&precedence(c)<=precedence(opr.peek()))
           {
            char oper=opr.pop();
            int x= op.pop();
            int y= op.pop();
            int res = operation(oper,y,x);
            op.push(res);
           }
           opr.push(c);
       }
    }
       while(!opr.isEmpty())
       {
           char oper=opr.pop();
            int x= op.pop();
            int y= op.pop();
            int res = operation(oper,y,x);
            op.push(res);
       }
       System.out.println(op.peek());
    }
   public static int precedence(char ch)
    {
        switch(ch)
        {
        case '+':
        case '-':
        return 1;
        case '*':
        case '/':    
        return 2;    
        }
        return -1;
    }
   public static int operation(char ch,int v1,int v2)
    {
    if(ch=='+')
    return v1+v2;
    else if(ch=='-')
    return v1-v2;
    else if(ch=='*')
    return v1*v2;
    else
    return v1/v2;
    }
 }
