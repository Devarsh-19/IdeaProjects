package DSA;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Student[] arr =new Student[10];

        try {

            for (int i = 0; i < 10; i++) {
                System.out.print("Enter your Name :");
                String nm = sc.next();

                System.out.print("Enter your ID :");
                int id = sc.nextInt();

                System.out.print("Enter your marks :");
                int marks = sc.nextInt();

                System.out.println();

                arr[i] = new Student(id, marks, nm);

            }
        }catch (Exception e){
            System.out.println("Please check your input and try again.");
            System.out.println("Error Type : "+e);
            e.printStackTrace();
        }

        for (int i=0;i<10;i++){
            arr[i].display();
        }
    }


}
