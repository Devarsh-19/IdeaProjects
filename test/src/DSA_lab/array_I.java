package DSA_lab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class array_I {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int smallest = 0,largest=0;
        try{
            System.out.println("Enter number of integers :");
            int n=sc.nextInt();

            int arr[]=new int[n];
            System.out.println("Enter "+n+" integers : ");
            for (int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }

          //  sort(arr,n);
            Arrays.sort(arr);
            System.out.println("Difference : "+(arr[n-1]-arr[0]));

        }catch (Exception e){
            System.out.println(e);
        }


    }


        }




