package practice_I;

import java.util.Scanner;

public class Q9_maxArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 10 integer nos. : ");

        int[] n=new int[10];

        for(int i=0;i<10;i++){
            n[i]=sc.nextInt();
        }

        int max1=n[0],max2=n[0];

        for(int j=0;j<10;j++){
            if(max1<n[j])
                max1=n[j];
        }

        for(int j=0;j<10;j++){
            if(max2<n[j] && n[j]<max1) {
                max2=n[j];
            }
        }

        System.out.println(max1+" "+max2);
    }
}
