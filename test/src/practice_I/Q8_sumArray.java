package practice_I;

import java.util.Scanner;

public class Q8_sumArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 10 integer nos. : ");

        int[] n=new int[10];
        int s=0;

        for(int i=0;i<10;i++){
            n[i]=sc.nextInt();
        }

        for(int j=0;j<10;j++){
            if(j%2==0){
                s=s+n[j];
            }
        }

            System.out.println("Sum of even indexed numbers "+s);

    }
}
