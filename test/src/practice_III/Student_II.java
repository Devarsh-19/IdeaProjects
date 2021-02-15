/*
* Q6. Print the names of students by creating a DSA.Student class. If no name is passed while creating an object of
    DSA.Student class, then the name should be “Unknown”, otherwise the name should be equal to the String value
    passed while creating an object of DSA.Student class
*/

package practice_III;

import java.util.Scanner;

public class Student_II {
    String nm;

    Student_II(){
        nm="Unknown";
    }

    Student_II(String s) {
        nm = s;
    }

    void print(){
        System.out.println(nm);
    }

    public static void main(String[] args) {

        Student_II obj1 = new Student_II();
        obj1.print();

        Student_II obj2 = new Student_II("ABC");
        obj2.print();

        Student_II obj3 = new Student_II();
        obj3.print();

        Student_II obj4 = new Student_II("XYZ");
        obj4.print();

    }
}