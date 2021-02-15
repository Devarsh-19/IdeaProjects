package III_SEM;

import java.io.*;
public class numRev {
    public static void main(String[] args)throws IOException{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));

        int n;
        System.out.println("Enter a number : ");
        n=Integer.parseInt(in.readLine());

        System.out.println("Reverse of the number ="+reverse(n));
        System.out.println("Number of digits ="+count(n));
        System.out.println("Sum of digits ="+sum(n));
    }

        static  int reverse(int n){
        int r=0;
        while(n>0){
            int d=n%10;
            r=(r*10)+d;
            n=n/10;
        }
        return r;
    }

    static int count(int n){
        int c=0;
        while(n>0){

            c++;
            n=n/10;
        }
        return c;
    }

    static int sum(int n){
        int s=0;
        while(n>0){
            int d=n%10;
            s=s+d;
            n=n/10;
        }
        return s;
    }
}
