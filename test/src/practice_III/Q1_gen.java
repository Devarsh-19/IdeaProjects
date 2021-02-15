/*
Q1. Write a program to accept gender (“Male” or “Female”) and age from command line arguments and print the
        percentage of interest-based on the given conditions.
        If gender is “Female” and age is between 1 and 58, the percentage of interest is 8.2%.
        If gender is “Female” and age is between 59 and 100, the percentage of interest is 9.2%.
        If gender is “Male” and age is between 1 and 58, the percentage of interest is 8.4%.
        If gender is “Male” and age is between 59 and 100, the percentage of interest is 10.5%.
 */

package practice_III;

public class Q1_gen {
    public static void main(String[] args) {

        String g=args[0];
        int age=Integer.parseInt(args[1]);

        if(g.equals("Male") || g.equals("male")){
            if(age>=1 && age<=58)
                System.out.println("Interest is 8.4%");
            else if(age>58 && age<=100)
                System.out.println("Interest is 10.5%");
        }

        else if(g.equals("Female") || g.equals("female")){
            if(age>=1 && age<=58)
                System.out.println("Interest is 8.2%");
            else if(age>58 && age<=100)
                System.out.println("Interest is 9.2%");
        }
    }
}
