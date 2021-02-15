package III_SEM;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int init=1500;
        int ar[];
        try{
            while(T>0){
                int N=sc.nextInt();
                int Q=sc.nextInt();

                ar=new int[N];
                for (int i=0;i<N;i++){
                    ar[i]=sc.nextInt();
                }

                while(Q>0){
                    int P=sc.nextInt();
                    int s=init;
                    String R="";
                    for(int i=0;i<P;i++){
                        s=s+ar[i];
                    }

                    if(s<=0)
                        R="Newbie";
                    else if(s>0 && s<=1500)
                        R="Grey";
                    else if(s>1500 && s<=1700)
                        R="Green";
                    else if(s>1700 && s<=1900)
                        R="Blue";
                    else if(s>1900 && s<=2000)
                        R="Indigo";
                    else if(s>2000 && s<=2500)
                        R="Purple";
                    else if(s>2500)
                        R="Red";

                    System.out.print(R+"\n");
                    Q--;
                }
                T--;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}