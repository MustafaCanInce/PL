package package1;

public class A {

    static int z;
    int a;
    private int b=2;
    protected int c=3;
    public int d;

    public A(int x){
        a = x;
    }

    public A(){

    }
    public  int foo(){
        a = b + c;
        return a;
    }


    public static void doo(){
        z++;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
