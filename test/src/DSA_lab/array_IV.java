package DSA_lab;

import java.util.Scanner;

public class array_IV {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n numbers :");
        int n=sc.nextInt();

        recursion(1,n);
    }

    static int recursion(int x, int y){

        if(x<=y){
            System.out.println(x);
            recursion(++x,y);
        }

        return 1;
    }
}
