public class MiddleStackOperation {
    class DllNode  //doubly linked list class
    {
        int data;
        DllNode prev,next;
        DllNode(int d)
        {
         data=d;
        }
    }
    class MyStack
    {
        DllNode head,mid; //head and mis of node type
        int size;
    }
    MyStack createStack()
    {
        MyStack s = new MyStack();
        s.size=0; //size of stack
        return s;
    }
    void push(MyStack s,int data)
    {
        DllNode new_Node = new DllNode(data);
        new_Node.prev=null;//make new node previous as null
        new_Node.next=s.head; //make new node the first one
        s.size+=1; //incrementing size by one
        if(s.size==1)
        {//if size is one then mid is first node
         s.mid=new_Node;
        }
        else {
            s.head.prev=new_Node;
            if (s.size % 2 != 0) { //if size is odd then make prev one of mid as new mid
                s.mid = s.mid.prev;
            }
        }
        s.head=new_Node; //make new node as head
    }
    int pop(MyStack s)
    {
        if(s.size==0) {
            System.out.println("Stack is empty");
           return -1;
        }
        DllNode head = s.head;
        int item = s.head.data;
        s.head= head.next;
        if(s.head!=null)  // if there is atleast one element in stack
        {
            s.head.prev=null;
        }
        s.size-=1;
        if(s.size%2==0) // if size of stack is even then
        {
         s.mid = s.mid.next;
        }
        return item;
    }
    int findMiddle(MyStack s) {
        if (s.size == 0){
            System.out.println("STack is empty");
            return -1;
    }
        return  s.mid.data;
    }
    public static void main(String[] args) {
    MiddleStackOperation ob = new MiddleStackOperation();
    MyStack s = ob.createStack();
    ob.push(s,10);
    ob.push(s,20);
    ob.push(s,30);
    ob.push(s,40);
    //ob.pop(s);
    System.out.println(ob.pop(s));
    System.out.println("Middele:"+ob.findMiddle(s));
    }
}
