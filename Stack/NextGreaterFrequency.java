/*
Next Greater Frequency Element
*/
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterFrequency {
    public static int[] greaterFreq(int arr[],int map[]) {
        int res[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);  //push first index into stack
        for (int i = 1; i < arr.length; i++) {
            if (map[arr[stack.peek()]] > map[arr[i]])
           /*
           if the index(frequency of tha index element) on top of stack has frequency greater than
           current element then just push the index into stack
            */
                stack.push(i);
            else {
           /*
           if the frequency of tp of stack is less than current element
           then pop index from stack till you get greater frequency index
           on top f stack
            */
                while (!stack.isEmpty() && map[arr[stack.peek()]] < map[arr[i]]) {
                    int index = stack.peek();
                    res[index] = arr[i];
                    stack.pop();
                }
           /*
           after popping push the current element into stack
            */
                stack.push(i);
            }
        }
     /*
     if there are some index left in the stack then it is clear that they
     dont have any greater frequency next to them so assign them -1
      */
        while (!stack.isEmpty())
            res[stack.pop()] = -1;
        return res;
    }
    public static void display(int res[])
    {
        for(int i=0;i<res.length;i++)
        {
         System.out.print(res[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,1,2,3,4,2,1};
        int max=arr[0];
         for(int i=1;i<arr.length;i++)
         {
             if(max<arr[i])
                 max=arr[i];
         }
         int map[]= new int[max+1];
         for(int i=0;i<arr.length;i++)
         {
            map[arr[i]]++;
         }
        int num[]=greaterFreq(arr,map);
        display(num);
    }
}
