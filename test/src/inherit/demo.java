package inherit;

public class demo {
    public static void main(String[] args) {
        person p=new person();
        student s=new student();

        p.readData("Devarsh Raj","9-11-2000",72579798);
        s.institution="GLA";
        s.qualif= new int[]{1, 2};
        p.printData();
        s.print();
    }
}
