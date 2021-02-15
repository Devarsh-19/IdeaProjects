package III_SEM;

import java.io.DataInputStream;
import java.io.IOException;

public class datasSream {
    public static void main(String[] args) throws IOException {
        Float a=new Float(0);
        Float b=new Float(0);


        DataInputStream in = new DataInputStream(System.in);

        String tmp;
        System.out.flush(); //Clear buffer
        tmp=in.readLine();  //Input String
        a=Float.valueOf(tmp); //convert string to float
        System.out.println(a); //print
        System.out.flush(); // clear buffer again
        tmp=in.readLine();
        b=Float.valueOf(tmp);
        System.out.println(b);
    }
}
