package day3;

public class InheritanceDemo {
    public static void main(String[] args) {

    }
}

class A{
    int i;
    public void m1(){
        System.out.println("A -> m1()");
    }
}

class B extends A{
    int j;
    public void m2(){
        System.out.println(i);
        m1();
    }
}

// A = parent
// B = child
// IS-A Relationship
// Class B IS-A Class A
// HAS-A RELATIONSHIP
// B class HAS-A A class object

// Unidirection - parent method and attribute will pass on to child
// access modifier rule - private method wont inherit
// final rule - class is final , then we cant inherit that class
// type of inheritance

