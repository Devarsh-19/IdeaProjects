package III_SEM;

import java.util.*;

public class list {
    public static void main(String[] args) {

        System.out.println("Enter nos. : ");
        ArrayList <Integer> l= new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            l.add(sc.nextInt());
        }

        for(int i=0;i<l.size();++i){
            System.out.print(l.get(i)+" ");
        }

    }
}
