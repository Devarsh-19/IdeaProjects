package inherit;

public class student extends person{
    String institution;
    int [] qualif=new int[2];
    int roll;
    int[] mrks=new int[3];

    void print(){
        person p=new person();
        p.printData();
        System.out.println("Institution :"+institution);
        System.out.print("Qualification :");
        for (int i=0;i<2;i++) {
            System.out.print(qualif[i]+" ");
        }
        System.out.println("\nRoll no. :"+roll);
        System.out.print("Marks :");
        for (int i=0;i<3;i++) {
            System.out.print(mrks[i]+" ");
        }
    }

}
