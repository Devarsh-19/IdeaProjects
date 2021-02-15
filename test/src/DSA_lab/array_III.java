package DSA_lab;

import java.util.Scanner;

public class array_III {
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

            System.out.println("Enter new value and its index : ");
            int n1= sc.nextInt();
            int index=sc.nextInt();

            add(arr,n,n1,index);

        }catch (Exception e){
            System.out.println(e);
        }
    }

    private static void add(int[] arr, int n, int n1, int index) {
        int arr1[]=new int[n+1];
        for(int i=0;i<n;i++){

        }
    }


}
