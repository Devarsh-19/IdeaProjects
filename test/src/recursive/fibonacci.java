package recursive;

import java.util.Scanner;

public class fibonacci {

    static int fibo(int n) {
        if (n <= 1) {
            System.out.println(n);
        }
        System.out.println(fibo((n - 1)) + fibo((n - 2)));
        return 0;
    }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            fibo(n);
        }

    }



