/*
    Create a class named “Programming”. While creating an object of the class, if nothing is passed to it,
    then the message “I love programming languages” should be printed. If some String is passed to it, then in
    place of “programming languages” the name of that String variable should be printed.
    For Example, while creating an object if we pass “Java”, then “I love Java” should be printed.

 */


package practice_III;

public class Programming {
    String v;

    Programming(){
        v="I love Programming";
    }

    Programming(String x){
        v="I love "+x;
    }

    void print(){
        System.out.println(v);
    }

    public static void main(String[] args) {
        Programming obj1=new Programming();
        obj1.print();

        Programming obj2=new Programming("Java");
        obj2.print();

        Programming obj3=new Programming();
        obj3.print();

        Programming obj4=new Programming("Python");
        obj4.print();
    }
}
