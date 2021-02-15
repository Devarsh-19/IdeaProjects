package LinkedList;

public class LinkedList {
    Node head;


    boolean isEmpty(){
        if(head==null)
            return true;
        else
            return false;
    }

    void insertAtLast(Node newnode){
        if(isEmpty()){
            head=newnode;
        }
        else{
            Node tmp=head;
            while(tmp.next!=null){
                tmp=tmp.next;
            }
            tmp.next=newnode;


        }
        System.out.println("value inserted");
    }

    void insertAtBeg(Node newnode){
        newnode.next=head;
        head=newnode;

        System.out.println("value inserted");
    }

    void insertAtPos(Node newnode, int pos){
        if(head==null){
            System.out.println("list already empty");
        }
        else if(pos==1){
            insertAtBeg(newnode);
        }
        else{
            Node tmp;
            tmp=head;
            for(int i=1;i<pos;i++){
                tmp=tmp.next;
            }
            newnode.next=tmp.next;
            tmp.next=newnode;

        }
    }

    void deleteAtFirst(){

    }

    void deleteAtLast(){

    }

    void deleteAtPos(){

    }

    void traverse(){
        Node tmp=head;

        while(tmp!=null){
            System.out.println(" "+tmp.data);
            tmp=tmp.next;
        }
    }

}
