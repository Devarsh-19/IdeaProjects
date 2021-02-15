package md;


public class pack {
    private int a=10;
    public int b=23;
    int c=30;

    void print(){
        System.out.println(a+" "+b+" "+c);
    }
}

class class2{
    public static void main(String[] args) {
        pack p=new pack();
        p.print();
    }
}