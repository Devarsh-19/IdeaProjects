package inherit;

public class person{
    String name,dob;
    int mobile;
    void readData(String n,String d,int m){

        name=n;
        dob=d;
        mobile=m;

    }

    void printData(){
        System.out.println("Name : "+name);
        System.out.println("Date of birth :"+dob);
        System.out.println("Mobile no. :"+mobile);
    }
}
