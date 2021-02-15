package Stack;

import LinkedList.LinkedList;

import java.util.Scanner;

public class StackByLinkedMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StackLinkedList obj=new StackLinkedList();
        Node n1=new Node();



        while(true){
            System.out.println("1 - View Top of Stack");
            System.out.println("2 - Add new element");
            System.out.println("3 - Delete top the Stack");
            System.out.println("4 - View Stack");

            int ch= sc.nextInt();
            switch (ch){
                case 1->obj.peek();

                case 2->{System.out.println("Enter value ");
                    n1.data= sc.nextInt();
                    obj.push(n1);}

                case 3-> obj.pop();

                case 4-> obj.display();

                default-> System.out.println("Wrong choice");
            }
        }
    }
}
