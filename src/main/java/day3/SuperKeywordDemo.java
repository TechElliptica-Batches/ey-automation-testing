package day3;

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Y2 y2 = new Y2();
        y2.m1();
        y2.m2();
    }
}
// super - immediate parent
class Y1{
    public void m1(){
        System.out.println("Y1 - m1");
    }
}
class Y2 extends Y1{
    public void m1(){
        System.out.println("Y2 - m1");
    }
    public void m2(){
        super.m1();
    }
}
