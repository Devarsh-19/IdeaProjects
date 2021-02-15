package III_SEM;

public class circle {
    int r;

    circle(int r){
        this.r=r;
    }

    public circle big(circle c){
        System.out.println(c.r+" "+r);
        if(c.r>r) return c;
        else return this;
    }

    public static circle big(circle a,circle b){
        System.out.println("in static "+a.r+" "+b.r);
        if(a.r>b.r) return a;
        else return b;
    }

    public static void main(String[] args) {
        circle a= new circle(5);  //creating object  a and initializing r->5
        circle b=new circle(2);
        circle c=a.big(b); //calling method big from object a  INSTANCE METHOD
        circle d=circle.big(a,b); //calling static method big from class III_SEM.circle  CLASS METHOD

        System.out.println(c+" "+d);

    }

}
