package day1;

public class SwapDemo {
    public static void main(String[] args) {

        int a = 10;
        int b = 8;

        // swap these number
        // a = 8
        // b = 10;
        // without using third variable

        a = a + b ;   // a = 18, b = 8
        b = a - b;    // a = 18, b = 10
        a = a - b;    // a = 8, b = 10


//        int temp = a;    // a = 10, b = 8, temp = 10
//        a = b;           // a = 8 , b = 8 , temp = 10;
//        b = temp;        // a= 8, b = 10, temp = 10;

    }
}
