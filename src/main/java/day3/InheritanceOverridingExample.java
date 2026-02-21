package day3;

public class InheritanceOverridingExample {
    public static void main(String[] args) {
        K1 k = new K1();
        System.out.println(k);
        // when we print any object on sout., that time toString() method from object class

    }
}
// Object class
class K1{
    public void m1(){

    }

    public String toString() {
        String str = "I am object of K1 class, I am a demo object.";
        return str;
    }
}
