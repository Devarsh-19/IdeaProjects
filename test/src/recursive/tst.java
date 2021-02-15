package recursive;

import java.util.Scanner;

public class tst {
    static int A(int n){
        System.out.println(n);
        if(n<=100)
            return n;
        else
            return A(n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        A(n);
    }
}
