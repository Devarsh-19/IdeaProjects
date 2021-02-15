package LinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList list=new LinkedList();
        Node n1=new Node();



        while(true){
            System.out.println("Enter 1 to insert node At last");
            System.out.println("Enter 2 to insert node At beginning");
            System.out.println("Enter 3 to insert node At Position");
            System.out.println("Enter 4 to display list");
            int ch= sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter value ");
                    n1.data= sc.nextInt();
                    list.insertAtLast(n1);
                    break;

                case 2:
                    System.out.println("Enter value ");
                    n1.data= sc.nextInt();
                    list.insertAtBeg(n1);
                    break;

                case 3:
                    list.traverse();
                    break;
                default:
                    System.out.println("error");
            }
        }
    }
}
