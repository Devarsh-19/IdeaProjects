package III_SEM;

public class formattedPrint {
    public static void main(String[] args) {
        int x=100;
        System.out.printf("Right margin =  d x = %d\n",x);
        System.out.printf("Right margin = 10 x = %10d\n",x);
        System.out.printf("Right margin = 20 x = %20d\n",x);

        System.out.println();

        float y=5.2f;
        System.out.printf("right margin =  d decimal=d   y = %f\n",y);
        System.out.printf("right margin =  0 decimal=4   y = %.4f\n",y);
        System.out.printf("right margin =  0 decimal=2   y = %.2f\n",y);
        System.out.printf("right margin = 10 decimal=2   y = %10.2f\n",y);
        System.out.printf("right margin = 10 decimal=4   y = %10.4f\n",y);



    }
}
