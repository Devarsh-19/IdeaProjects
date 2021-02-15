/*
* Q5. Write a program by creating an “Employee” class having the following methods and print the final salary.
 1) “getInfo()” which takes the salary, number of hours of work per day of an employee as a parameter
 2). “addSal()” which adds 10 to the salary of the employee if it is less than 500.
 3). “addWork()” which adds 5 to the salary of an employee if the number of hours of work per day is more than
     6 hours
* */
package practice_III;

import java.util.Scanner;

public class Employee {
    int sal,hrs;

    void getInfo(int s,int h){
        sal=s;
        hrs=h;
    }

    void addSal(){
        sal=sal+10;
    }
    void addWork(){
        sal=sal+5;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Salary and no. of hours : ");
        int sal=sc.nextInt();
        int hr=sc.nextInt();

        Employee obj=new Employee();
        obj.getInfo(sal,hr);

        if(sal<500)
            obj.addSal();

        if(hr>6)
            obj.addWork();

        System.out.println("Salary : "+obj.sal);
    }
}
