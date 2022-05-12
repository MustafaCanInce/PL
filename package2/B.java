package package2;

import package1.A;
import package1.I;

public class B extends A implements I {

    A data = new A(4);

    public void updateA(){
        data.d = 5;
        //data.a = 3;
        //data.b = 2;
        //data.c = 1;

        setA(2);
        setB(7);
        c= 5;
        d = 3;

    }

    @Override
    public int foo() {
       setA(2 * super.foo());
       return getA();
    }
}
