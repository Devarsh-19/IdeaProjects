package DSA;

public class test {
    public static void main(String[] args) {

    }
}
/*
    Devansh and Shob/*hit sat down to create a simple problem for the ESC101 lab.
/*   Devansh suggested to keep it simple, we will give a problem that students already know of reversing a string.
/*  Shobhit laughed that this could simply be done by calling strrev().
 To avoid this they decided to use a modified string reverse.
 */
/*
     In this modi/*fied version, while reversing the string, you swap the 2 characters if and only if both
      of them come between ‘d/D’ and ‘s/S’(both included) in alphabetical order.
 */
/*        For eg., while reversing ‘Devansh’ you swap ‘D’ and ‘h’,’e’ and ‘s’, don’t swap ‘v’ and ‘n’ as ‘v’ comes after ‘s’.
        Therefore in the special reverse, the new reverse string of ‘Devansh’ will be ‘hsvaneD’.
/*
/*        Shobhit again laughs that this can be done easily by a single loop.
 But, Devansh thinks this problem is a good chance for students to practice Recursion.
 */
/*        Hence, it is compulsory to use recursion to solve this problem.
/*
/*
/*        Note:
        0% - If recursion is not used

        Input:
        A single line containing the string.

        Output:
        A single line containing the special reversed output string.
        The characters are swapped only if both are either in ‘d’-’s’ or in ‘D’-’S’.


        Examples:

        INPUT: codingisfun
        OUTPUT: cofsignidun

        INPUT: Recursion Is The Most Powerful
        OUTPUT: lecuesoPn so Teh MsIt oiwrrfuR


        INPUT:  QWERTyuiopasdFGHJKlzxcvbNM
        OUTPUT: MWERTyulKJaGFdsHpoizxcvbNQ
*/