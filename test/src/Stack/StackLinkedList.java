package Stack;

public class StackLinkedList {
    Node top;

    public StackLinkedList(){
       top=null;
    }

    public boolean isEmpty(){
        return(top==null);
    }

    public void peek(){
        if(isEmpty())
            System.out.println("Stack empty.");
        else
            System.out.println(top.data);
    }


    public void push(Node newnode){
        newnode.next=top;
        top=newnode;
    }

    public  void pop(){
        if(isEmpty())
            System.out.println("Stack Empty.");
        else {
            System.out.println(top.data);
            top=top.next;
        }
    }
    void display(){
        Node tmp=top;
        while (tmp!=null){
            System.out.println(tmp.data);
            tmp=tmp.next;
        }
    }
}
