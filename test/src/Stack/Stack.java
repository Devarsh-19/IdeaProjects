package Stack;

import III_SEM.P;

public class Stack {
     private int[] arr;
    private int top;

    Stack(int size){
        arr=new int[size];
        top=-1;
    }

    public boolean isEmpty(){
        return(top==-1);
    }

    public  boolean isStackFull(){
        return(top== arr.length-1);
    }

    public void peek(){
        if(isEmpty())
            System.out.println("Stack Empty.");

        else
            System.out.println(arr[top]);
    }

    public void push(int d){
        if(isStackFull()){
            System.out.println("Stack Full");
        }
        else {
            arr[top+1]=d;
            top++;
        }
    }

    public void pop(){
        if(isEmpty())
            System.out.println("Stack Empty");
        else{
            System.out.println(arr[top]);
            top--;
        }
    }

    public void deleteStack(){
        arr=null;
        top=-1;
    }

    public void viewStack(){
        if(!isEmpty()){
            for(int i=top;i>=0;i--){
                System.out.println(arr[i]);
            }
        }
    }
}
