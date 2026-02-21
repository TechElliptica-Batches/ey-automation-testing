package day1;

public class DataTypeDemo {
    public static void main(String[] args) {
        // maximum positive value
        //  255
        //  127  = 128
        // byte range is -128 to 127
        //
        byte b1 = 120;
        //System.out.println(b1);
        short s1 = -32768;
        int i1 = -2147483648;

        int x = 10 + 20;
        // how many variables created in memory? - 4
        // 10, 20, 30, x
        System.out.println(x);

        // default - int
        byte b2 = 100;
        // 100 - what datatype will it be saved

        byte k1 = 10;  //  1 byte
        int i = k1;    //  4 byte
        //00101100
        int m1 = 300;    //  4 byte
        byte b5 = (byte) m1;   //  1 byte  // type cast
        System.out.println(b5);
        long k9 = 12131231L;




    }
}
