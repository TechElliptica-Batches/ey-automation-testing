package day2;

public class ShadowingDemo {
    public static void main(String[] args) {
        M mObject = new M();
        mObject.m1();
    }
}


class M{
    // this - instance
    int i = 10 ;
    static int j = 20;

    public void m1(){
        int i = 30;  // local variable
        int j = 40;  // local variable
        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("instance i : " + this.i);
        System.out.println("static j: " + M.j );
    }
}