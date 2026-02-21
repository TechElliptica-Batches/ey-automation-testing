package day2;

// Sequence of loading these variable and method
// class level entity - static
    // static variable and block
    // static methods
// object level entity - instance
//



public class KnowledgeCheck1 {
    public static void main(String[] args) {
       // System.out.println(A.j);
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();


//        A a1 = new A();
//        System.out.println(a1.i);
//
//        A.m2();
//        a1.m1();

    }
}

class A{
    /*
     1 - static block and variables
     2 - static method
     3 - instance block and variables
     4 - instance method
     */
    // static method only allow static variable directly

    static void m2(){
        System.out.println("m2");
        System.out.println(j);
        A a1 = new A();
        System.out.println(a1.i);
    }

    static int j;
    static{
        System.out.println(j);
        System.out.println("Hello i am static block");
        // only execute once. when class loading happens
    }
    int i ;
    {
        System.out.println(i);
        System.out.println("Hello I am instance block");
    }

    void m1(){
        System.out.println(i);
        System.out.println(j);
        System.out.println("m1");
    }
    // instance method allow static and non-static both entity
}
