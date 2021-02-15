/*
Q4. Program to print the area of a rectangle by creating a class named “Area” taking the values of its
    length and breadth as parameters of its constructors and have a method named “returnArea” which returns the
    area of the rectangle. Length and breadth of the rectangle are entered through the keyboard.

 */

package practice_III;

import java.util.Scanner;

public class Area {
    int l,b;
    Area(int l,int b){
        this.l=l;
        this.b=b;
    }

    int returnArea(){
        return l*b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and breadth of Rectangle :");
        int l=sc.nextInt();
        int b=sc.nextInt();

        Area obj=new Area(l,b);
        System.out.println("Area = "+obj.returnArea());
    }
}
