package day3;

public class InheritanceType {
    public static void main(String[] args) {

    }
}

// Single level  , x -> y
// Multi level , x -> y -> z
// Hierarchy    one class is parent of multiple class
// multiple inheritance - one child have multiple parent - not allowed in java
// ambiguity

class X{
    int i;
    public void m1(){

    }
}
class Y{
    int i;
    public void m1(){

    }
}
class Z extends X{
    public void m2(){
        m1();
        System.out.println(i);
    }
}
