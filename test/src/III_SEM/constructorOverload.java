package III_SEM;

public class constructorOverload {
    int x, y, z;

    constructorOverload() {
        x = 0;
        y = 0;
        z = 0;
    }
    constructorOverload(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println("hi3   "+this.x);
    }

    constructorOverload(constructorOverload n) {
        this.x=n.x;
        this.y=n.y;
        this.z=n.z;
    }

    constructorOverload(int x) {
        this.x = x;
    }

    public static void main(String[] args) {
        constructorOverload a = new constructorOverload();
        constructorOverload b = new constructorOverload(5);
        constructorOverload c = new constructorOverload(7,8,9);
        constructorOverload d = new constructorOverload(c);

        System.out.println(a.x+" "+a.y+" "+a.z);
        System.out.println(b.x+" "+b.y+" "+b.z);
        System.out.println(c.x+" "+c.y+" "+c.z);
        System.out.println(d.x+" "+d.y+" "+d.z);


    }

}