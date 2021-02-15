package DSA;

public class Student {
    private static String uname;
    private static String stream;
    private int id,marks;
    private String nm;

    Student(){
        id=marks=0;
        nm="";
    }

    static {
        uname="GLA University";
        stream="B.Tech CSE";
    }

    Student(int id,int marks,String nm){
        this.id=id;
        this.marks=marks;
        this.nm=nm;

    }

    void display(){
        System.out.println("University Name : "+uname);
        System.out.println("Name of DSA.Student : "+nm);
        System.out.println("Stream : "+stream);
        System.out.println("DSA.Student ID : "+id);
        System.out.println("Marks Obtained : "+marks);

        System.out.println();

    }

}
