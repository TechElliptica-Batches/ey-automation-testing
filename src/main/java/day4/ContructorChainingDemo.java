package day4;

public class ContructorChainingDemo {
    public static void main(String[] args) {
        R2 r1 = new R2();
 //       r1.m1();
    }
}


class R1{
    public R1(){
        System.out.println("R1 Constructor");
    }
    public void m1(){
        System.out.println("I am R1-m1");
    }
}
class R2 extends R1{

}

// final - we cannot have IS-A Relationship
// abstract - We cannot have HAS-A Relationship
// We cannot use final and abstract together
