import package1.A;
import package2.B;

public class Test {

    public static void main(String[] args){


        A.doo();
        //A.foo();
        A a = new A();
        a.foo();
        a.doo();



        a = new B();
        System.out.println("a = " + a.getA());
        a.foo();
        System.out.println("a = " + a.getA());

        IDictionary dictionary = new Dictionary(100);
        //dictionary.count = 5;

        testDictionary(dictionary);
        testDictionary(new Dictionary2());


    }

    public static void testDictionary(IDictionary dictionary){
        dictionary.add("hello");
        System.out.println(dictionary.contains("hello") + " == true");
        System.out.println(dictionary.contains("halo") + " == false");
    }
}
