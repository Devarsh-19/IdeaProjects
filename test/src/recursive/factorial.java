package recursive;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n=sc.nextInt();
        System.out.println("Factorial of "+n+" = "+fact(n));
    }

    static int fact(int n){
        if(n==0){
            System.out.println("In returning");
            return 1;
        }
        else{
            System.out.println("in recursive "+n);
            return (n*fact(n-1));
        }
    }
}
