package practice_II;

public class loop {
    public static void main(String[] args) {

        for (int i=100;i>=1;i--)
            System.out.print(i+" ");

        System.out.println("\n");

        for(int i=1;i<=10;i++){
            for(int j=1;j<=i;j++)
                System.out.print(j);
            System.out.println();
        }

        System.out.println();

        for (int i=1;i<=5;i++){
            for(int j=5;j>i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("1");
            }
            System.out.println();
        }

    }
}
