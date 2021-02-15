/*
Q3. Program to print the area of two rectangles having sides (4,5) and (5,8) respectively by creating a class
    named “Rectangle” with a method named “area” which returns the area and length and breadth passed as parameters
    to its constructors
   */

package practice_III;

public class Rectangle {
    int l,b;
    Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }

    int area(){
        return l*b;
    }

    public static void main(String[] args) {
        Rectangle obj1=new Rectangle(4,5);
        Rectangle obj2=new Rectangle(5,8);
        System.out.println("Object 1 Area : "+obj1.area());
        System.out.println("Object 2 Area : "+obj2.area());
    }
}
