package practice_I;

import java.util.Scanner;

public class Q4_num {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number : ");

        int n=sc.nextInt();

        if(n>0)
            System.out.println("Positive number.");
        else if (n<0)
            System.out.println("Negative number.");
        else
            System.out.println("Zero.");

    }
}
