package Stack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of stack");
        int size= sc.nextInt();
        Stack obj=new Stack(size);

        while(true){
            System.out.println("1 - View Top of Stack");
            System.out.println("2 - Add new element");
            System.out.println("3 - Delete top the Stack");
            System.out.println("4 - Delete stack");
            System.out.println("5 - View Stack");

            int ch= sc.nextInt();

            switch (ch) {
                case 1 -> obj.peek();
                case 2 -> {
                    System.out.println("Enter data :");
                    obj.push(sc.nextInt());
                }
                case 3 -> obj.pop();
                case 4 -> obj.deleteStack();
                case 5 -> obj.viewStack();
                default -> System.out.println("wrong choice.");
            }
        }
    }
}
