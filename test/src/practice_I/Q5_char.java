package practice_I;

import java.util.Scanner;

public class Q5_char {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a character : ");
        char ch=sc.next().charAt(0);

        if(ch>=65 && ch<=91)
            System.out.println((char)(ch+32));
        else if(ch>=97 && ch<=122)
            System.out.println((char)(ch-32));

    }
}
