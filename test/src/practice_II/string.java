package practice_II;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String hi = "Hi, ";
        String mom = "mom.";
        System.out.println(hi.concat(mom));
        System.out.println(hi+mom);


        System.out.println("Enter 2 strings : ");
        String s1=sc.next();
        String s2=sc.next();
        s2 = new StringBuilder(s2).reverse().toString();
        System.out.println(s1+s2);

        System.out.println("Enter any String : ");
        String s=sc.next();


    }
}
