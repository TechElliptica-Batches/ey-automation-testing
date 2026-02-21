package day1;

public class CharDemo {
    public static void main(String[] args) {

        // all char are int by default
        char c1 = 'a';  // ASCII code 1 byte
        int k = 'a';
        System.out.println("c1 = " + c1);
        System.out.println("k = " +k);

        int m1 = 'a' + 2;  // 4 byte
        char c2 = (char)m1; //1 byte
        System.out.println("m1 = " +m1);
        System.out.println("c2 = " +c2);

        // unicode

    }
}
