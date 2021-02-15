package DSA;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val;

        try {
            while (true) {
                System.out.println("Choose an option : ");
                System.out.println("1 - Hello");
                System.out.println("2 - Bye");
                System.out.println("3 - Lunch");
                System.out.println("4 - Exit");

                val = sc.nextInt();

                switch (val) {
                    case 1:
                        System.out.println("Hello");
                        break;

                    case 2:
                        System.out.println("Bye");
                        break;

                    case 3:
                        System.out.println("Lunch");
                        break;

                    case 4:
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Error.....");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
