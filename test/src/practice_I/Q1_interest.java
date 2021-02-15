package Q2_string;

public class Q1_interest {
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
