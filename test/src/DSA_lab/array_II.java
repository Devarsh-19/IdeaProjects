package DSA_lab;

import java.util.Arrays;
import java.util.Scanner;

public class array_II {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        try{
            System.out.println("Enter number of integers :");
            int n=sc.nextInt();

            int arr[]=new int[n];
            System.out.println("Enter "+n+" integers : ");
            for (int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }

            find(arr,n);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    private static void find(int[] arr,int n) {
        StringBuffer sb=new StringBuffer();
        int f=0;
        for(int i=0;i<n;i++){
            for(int j=0;j< i;j++){
                if(arr[i]==arr[j]){
                    f=1;
                    sb.append(arr[i]);
                    sb.append(" ");
                }
            }
        }

        if(f==1){
            System.out.println("Duplicate elements are :"+ sb);
        }
        else {
            System.out.println("No duplicate items found.");
        }

    }


}
