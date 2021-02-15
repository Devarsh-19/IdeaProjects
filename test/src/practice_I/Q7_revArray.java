package practice_I;

import java.util.Scanner;

public class Q7_revArray {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 8 integer nos. : ");

        int[] n=new int[8];

        for(int i=0;i<8;i++){
            n[i]=sc.nextInt();
        }

        for(int j=0;j<4;j++){
            int tmp=n[j];
            n[j]=n[7-j];
            n[7-j]=tmp;

        }

        for (int k=0;k<8;k++){
            System.out.print(n[k]+" ");
        }


    }
}
