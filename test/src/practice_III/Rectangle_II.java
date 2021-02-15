package practice_III;

public class Rectangle_II {
    int l,b,a;

    Rectangle_II(){
        l=b=0;
    }

    Rectangle_II(int l,int b){
        this.l=l;
        this.b=b;
    }

    Rectangle_II(int x){
        l=b=x;
    }

    void area(){
        a=l*b;
    }

    void print(){
        System.out.println("Area = "+a);
    }

    public static void main(String[] args) {
        Rectangle_II obj1=new Rectangle_II();
        obj1.area();
        obj1.print();

        Rectangle_II obj2=new Rectangle_II(10, 2);
        obj2.area();
        obj2.print();

        Rectangle_II obj3=new Rectangle_II(5);
        obj3.area();
        obj3.print();
    }
}
